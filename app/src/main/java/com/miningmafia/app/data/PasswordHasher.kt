package com.miningmafia.app.data

import java.security.MessageDigest
import java.security.SecureRandom
import java.util.Base64
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec

/** PBKDF2-HMAC-SHA256 password hashing. Stored format: pbkdf2_sha256|iterations|salt|hash */
object PasswordHasher {
    private const val ALGORITHM = "pbkdf2_sha256"
    private const val ITERATIONS = 120_000
    private const val KEY_BITS = 256
    private const val SALT_BYTES = 16
    private val random = SecureRandom()
    private val encoder = Base64.getEncoder()
    private val decoder = Base64.getDecoder()

    fun hash(password: String): String {
        val salt = ByteArray(SALT_BYTES).also { random.nextBytes(it) }
        val key = derive(password, salt, ITERATIONS, KEY_BITS)
        return listOf(
            ALGORITHM,
            ITERATIONS.toString(),
            encoder.encodeToString(salt),
            encoder.encodeToString(key),
        ).joinToString("|")
    }

    fun verify(password: String, stored: String): Boolean {
        val parts = stored.split("|")
        if (parts.size != 4 || parts[0] != ALGORITHM) return false
        val iterations = parts[1].toIntOrNull() ?: return false
        val salt = runCatching { decoder.decode(parts[2]) }.getOrNull() ?: return false
        val expected = runCatching { decoder.decode(parts[3]) }.getOrNull() ?: return false
        val actual = derive(password, salt, iterations, expected.size * 8)
        return MessageDigest.isEqual(expected, actual)
    }

    private fun derive(password: String, salt: ByteArray, iterations: Int, bits: Int): ByteArray {
        val spec = PBEKeySpec(password.toCharArray(), salt, iterations, bits)
        return try {
            SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec).encoded
        } finally {
            spec.clearPassword()
        }
    }
}
