package com.miningmafia.app.mining

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.os.PowerManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class DeviceState(
    val batteryPercent: Int = -1,
    val charging: Boolean = false,
    val temperatureC: Float = Float.NaN,
    val thermalStatus: Int = 0,
)

/** Live battery, temperature and thermal status used to pause mining when the phone is unsafe. */
object DeviceMonitor {
    private const val THERMAL_SEVERE = 3
    private const val MAX_SAFE_TEMP_C = 45f
    private const val MIN_BATTERY_PERCENT = 10

    private val _state = MutableStateFlow(DeviceState())
    val state: StateFlow<DeviceState> = _state.asStateFlow()

    @Volatile private var started = false

    fun start(context: Context) {
        if (started) return
        started = true
        val app = context.applicationContext
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) = update(intent)
        }
        val sticky = app.registerReceiver(receiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
        if (sticky != null) update(sticky)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val pm = app.getSystemService(PowerManager::class.java)
            _state.update { it.copy(thermalStatus = pm.currentThermalStatus) }
            pm.addThermalStatusListener(app.mainExecutor) { status ->
                _state.update { it.copy(thermalStatus = status) }
            }
        }
    }

    fun shouldThrottle(s: DeviceState = _state.value): Boolean {
        val overheating = !s.temperatureC.isNaN() && s.temperatureC >= MAX_SAFE_TEMP_C
        val critical = s.thermalStatus >= THERMAL_SEVERE
        val lowBattery = s.batteryPercent in 0..MIN_BATTERY_PERCENT && !s.charging
        return overheating || critical || lowBattery
    }

    private fun update(intent: Intent) {
        val level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
        val scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
        val percent = if (level >= 0 && scale > 0) level * 100 / scale else -1
        val status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
        val charging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
            status == BatteryManager.BATTERY_STATUS_FULL
        val rawTemp = intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, Int.MIN_VALUE)
        val tempC = if (rawTemp == Int.MIN_VALUE) Float.NaN else rawTemp / 10f
        _state.update { it.copy(batteryPercent = percent, charging = charging, temperatureC = tempC) }
    }
}
