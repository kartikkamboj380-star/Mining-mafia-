package com.miningmafia.app.mining

import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import java.security.MessageDigest

/**
 * SHA-256d share math for Stratum v1 pools (Bitcoin-style header layout).
 * Byte-order conventions follow the common Stratum v1 implementations:
 *  - prevhash arrives as 8 big-endian words; each 4-byte word is reversed in the header.
 *  - version, ntime and nbits arrive as big-endian hex and are written little-endian.
 *  - the nonce is written little-endian into the last 4 header bytes.
 */
object MiningMath {
    private val DIFF1_TARGET = BigInteger("00000000ffff0000000000000000000000000000000000000000000000000000", 16)
    private const val HEX_CHARS = "0123456789abcdef"

    fun hexToBytes(hex: String): ByteArray {
        require(hex.length % 2 == 0) { "Odd-length hex string" }
        val out = ByteArray(hex.length / 2)
        for (i in out.indices) {
            val hi = Character.digit(hex[2 * i], 16)
            val lo = Character.digit(hex[2 * i + 1], 16)
            require(hi >= 0 && lo >= 0) { "Invalid hex character" }
            out[i] = ((hi shl 4) or lo).toByte()
        }
        return out
    }

    fun bytesToHex(bytes: ByteArray): String {
        val sb = StringBuilder(bytes.size * 2)
        for (b in bytes) {
            val v = b.toInt() and 0xff
            sb.append(HEX_CHARS[v shr 4]).append(HEX_CHARS[v and 0x0f])
        }
        return sb.toString()
    }

    fun sha256(data: ByteArray): ByteArray = MessageDigest.getInstance("SHA-256").digest(data)

    fun sha256d(data: ByteArray): ByteArray = sha256(sha256(data))

    /** Reverses the byte order inside every 4-byte word (Stratum prevhash to header layout). */
    fun swapWords(bytes: ByteArray): ByteArray =
        ByteArray(bytes.size) { i -> bytes[(i and 3.inv()) + 3 - (i and 3)] }

    fun computeMerkleRoot(coinbaseHash: ByteArray, branches: List<ByteArray>): ByteArray {
        var root = coinbaseHash
        for (branch in branches) root = sha256d(root + branch)
        return root
    }

    fun buildHeader(
        version: String,
        prevHashHex: String,
        merkleRoot: ByteArray,
        ntimeHex: String,
        nbitsHex: String,
        nonce: Int = 0,
    ): ByteArray {
        require(merkleRoot.size == 32) { "Merkle root must be 32 bytes" }
        val header = ByteArray(80)
        hexToBytes(version).reversedArray().copyInto(header, 0)
        swapWords(hexToBytes(prevHashHex)).copyInto(header, 4)
        merkleRoot.copyInto(header, 36)
        hexToBytes(ntimeHex).reversedArray().copyInto(header, 68)
        hexToBytes(nbitsHex).reversedArray().copyInto(header, 72)
        writeNonce(header, nonce)
        return header
    }

    fun writeNonce(header: ByteArray, nonce: Int) {
        header[76] = nonce.toByte()
        header[77] = (nonce shr 8).toByte()
        header[78] = (nonce shr 16).toByte()
        header[79] = (nonce shr 24).toByte()
    }

    /**
     * 32-byte big-endian target for a share difficulty (difficulty 1 = DIFF1 target).
     * Uses exact BigDecimal division so fractional difficulties are not truncated.
     */
    fun shareTarget(difficulty: Double): ByteArray {
        val d = if (difficulty.isFinite() && difficulty > 0) difficulty else 1.0
        val target = BigDecimal(DIFF1_TARGET).divide(BigDecimal(d), MathContext(120)).toBigInteger()
        val raw = target.toByteArray()
        val out = ByteArray(32)
        val copy = minOf(raw.size, 32)
        System.arraycopy(raw, raw.size - copy, out, 32 - copy, copy)
        return out
    }

    /** [hash] is in internal order (as produced by sha256d); [target] is big-endian. */
    fun meetsTarget(hash: ByteArray, target: ByteArray): Boolean {
        for (i in 0 until 32) {
            val h = hash[31 - i].toInt() and 0xff
            val t = target[i].toInt() and 0xff
            if (h != t) return h < t
        }
        return true
    }
}
