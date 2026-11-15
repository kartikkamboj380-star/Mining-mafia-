package com.miningmafia.app.mining

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class MiningMathTest {

    @Test
    fun sha256dOfEmptyInputMatchesKnownVector() {
        assertEquals(
            "5df6e0e2761359d30a8275058e299fcc0381534545f55cf43e41983f5d4c9456",
            MiningMath.bytesToHex(MiningMath.sha256d(ByteArray(0)))
        )
    }

    @Test
    fun genesisBlockHeaderHashMatches() {
        // Bitcoin genesis block header (80 bytes, internal byte order).
        val header = MiningMath.hexToBytes(
            "01000000" + "00".repeat(32) +
                "3ba3edfd7a7b12b27ac72c3e67768f617fc81bc3888a51323a9fb8aa4b1e5e4a" +
                "29ab5f49" + "ffff001d" + "1dac2b7c"
        )
        val displayHash = MiningMath.bytesToHex(MiningMath.sha256d(header).reversedArray())
        assertEquals("000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f", displayHash)
    }

    @Test
    fun buildHeaderLaysOutFieldsLittleEndian() {
        val root = ByteArray(32) { it.toByte() }
        val header = MiningMath.buildHeader(
            version = "20000000",
            prevHashHex = "00112233" + "44556677" + "8899aabb" + "ccddeeff" +
                "00112233" + "44556677" + "8899aabb" + "ccddeeff",
            merkleRoot = root,
            ntimeHex = "64000000",
            nbitsHex = "1d00ffff",
            nonce = 0x01020304,
        )
        assertEquals(80, header.size)
        assertArrayEquals(byteArrayOf(0x00, 0, 0, 0x20), header.copyOfRange(0, 4))
        // Prevhash words are byte-swapped inside each 4-byte word.
        assertArrayEquals(byteArrayOf(0x33, 0x22, 0x11, 0x00), header.copyOfRange(4, 8))
        assertArrayEquals(root, header.copyOfRange(36, 68))
        assertArrayEquals(byteArrayOf(0x00, 0, 0, 0x64), header.copyOfRange(68, 72))
        assertArrayEquals(byteArrayOf(0xff.toByte(), 0xff.toByte(), 0x00, 0x1d), header.copyOfRange(72, 76))
        assertArrayEquals(byteArrayOf(0x04, 0x03, 0x02, 0x01), header.copyOfRange(76, 80))
    }

    @Test
    fun swapWordsReversesEachFourByteGroup() {
        val out = MiningMath.swapWords(byteArrayOf(1, 2, 3, 4, 5, 6, 7, 8))
        assertArrayEquals(byteArrayOf(4, 3, 2, 1, 8, 7, 6, 5), out)
    }

    @Test
    fun merkleRootWithoutBranchesIsCoinbaseHash() {
        val cb = MiningMath.sha256d(byteArrayOf(9, 9, 9))
        assertArrayEquals(cb, MiningMath.computeMerkleRoot(cb, emptyList()))
    }

    @Test
    fun difficultyOneTargetStartsWithExpectedPrefix() {
        val target = MiningMath.shareTarget(1.0)
        assertEquals(0x00.toByte(), target[0])
        assertEquals(0x00.toByte(), target[3])
        assertEquals(0xff.toByte(), target[4])
        assertEquals(0xff.toByte(), target[5])
    }

    @Test
    fun higherDifficultyGivesSmallerTarget() {
        val easy = java.math.BigInteger(1, MiningMath.shareTarget(1.0))
        val hard = java.math.BigInteger(1, MiningMath.shareTarget(1024.0))
        assertTrue(hard < easy)
        assertTrue(MiningMath.meetsTarget(ByteArray(32), MiningMath.shareTarget(1024.0)))
    }

    @Test
    fun meetsTargetComparesBigEndianValues() {
        val target = ByteArray(32).also { it[0] = 0x01 } // 0x01000... big-endian
        val low = ByteArray(32).also { it[31] = 0x00 }  // internal order: most significant byte is last
        val high = ByteArray(32).also { it[31] = 0x02 }
        assertTrue(MiningMath.meetsTarget(low, target))
        assertFalse(MiningMath.meetsTarget(high, target))
    }

    @Test
    fun hexRoundTrip() {
        val hex = "00ff10ab"
        assertEquals(hex, MiningMath.bytesToHex(MiningMath.hexToBytes(hex)))
    }
}
