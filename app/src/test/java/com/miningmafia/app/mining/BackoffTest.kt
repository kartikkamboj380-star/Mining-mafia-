package com.miningmafia.app.mining

import org.junit.Assert.assertEquals
import org.junit.Test

class BackoffTest {
    @Test
    fun delaysGrowExponentiallyAndCap() {
        assertEquals(2_000L, Backoff.delayMillis(1))
        assertEquals(4_000L, Backoff.delayMillis(2))
        assertEquals(8_000L, Backoff.delayMillis(3))
        assertEquals(60_000L, Backoff.delayMillis(50))
    }

    @Test
    fun formatsHashrateWithUnits() {
        assertEquals("512.0 H/s", formatHashrate(512.0))
        assertEquals("1.50 kH/s", formatHashrate(1_500.0))
        assertEquals("2.00 MH/s", formatHashrate(2_000_000.0))
    }

    @Test
    fun formatsDuration() {
        assertEquals("01:01:01", formatDuration(3_661_000L))
    }
}
