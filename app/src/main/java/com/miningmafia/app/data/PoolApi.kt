package com.miningmafia.app.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

/**
 * Client for your pool's account API. The app never invents balances: it reports
 * exactly what this endpoint returns. Expected contract (HTTPS only):
 *   GET  {base}/balance?worker=NAME  -> {"confirmed":"0.123","pending":"0.001"}
 *   POST {base}/withdraw             -> {"worker":"...","address":"...","amount":"0.1"} returns {"id":"..."}
 */
class PoolApi(private val baseUrl: String, private val apiKey: String) {

    data class Balance(val confirmedUnits: Long, val pendingUnits: Long)

    suspend fun balance(worker: String): Balance = withContext(Dispatchers.IO) {
        val json = request("GET", "/balance?worker=" + URLEncoder.encode(worker, "UTF-8"), null)
        Balance(
            confirmedUnits = Units.parse(json.optString("confirmed", "0")) ?: 0L,
            pendingUnits = Units.parse(json.optString("pending", "0")) ?: 0L,
        )
    }

    suspend fun withdraw(worker: String, address: String, units: Long): String = withContext(Dispatchers.IO) {
        val body = JSONObject()
            .put("worker", worker)
            .put("address", address)
            .put("amount", Units.format(units))
        request("POST", "/withdraw", body).optString("id", "")
    }

    private fun request(method: String, path: String, body: JSONObject?): JSONObject {
        require(baseUrl.isNotBlank()) { "Pool API URL is not configured in Settings" }
        val url = URL(baseUrl.trimEnd('/') + path)
        require(url.protocol == "https") { "Pool API must use HTTPS" }
        val conn = (url.openConnection() as HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 15_000
            readTimeout = 15_000
            setRequestProperty("Accept", "application/json")
            if (apiKey.isNotBlank()) setRequestProperty("Authorization", "Bearer $apiKey")
            if (body != null) {
                doOutput = true
                setRequestProperty("Content-Type", "application/json")
            }
        }
        try {
            if (body != null) conn.outputStream.use { it.write(body.toString().toByteArray(Charsets.UTF_8)) }
            val code = conn.responseCode
            val stream = if (code in 200..299) conn.inputStream else conn.errorStream
            val text = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            if (code !in 200..299) error("Pool API responded with HTTP $code")
            return JSONObject(text)
        } finally {
            conn.disconnect()
        }
    }
}
