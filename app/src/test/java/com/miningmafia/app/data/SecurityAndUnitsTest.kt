package com.miningmafia.app.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class SecurityAndUnitsTest {

    @Test
    fun passwordHashVerifiesCorrectPasswordOnly() {
        val stored = PasswordHasher.hash("correct horse")
        assertTrue(PasswordHasher.verify("correct horse", stored))
        assertFalse(PasswordHasher.verify("wrong horse", stored))
    }

    @Test
    fun passwordHashesAreSalted() {
        assertFalse(PasswordHasher.hash("same-pass") == PasswordHasher.hash("same-pass"))
    }

    @Test
    fun malformedStoredHashIsRejected() {
        assertFalse(PasswordHasher.verify("x", "not-a-hash"))
    }

    @Test
    fun unitsFormatAndParse() {
        assertEquals("1.50000000", Units.format(150_000_000L))
        assertEquals(1L, Units.parse("0.00000001"))
        assertEquals(12_500_000L, Units.parse(" 0.125 "))
        assertNull(Units.parse("abc"))
    }

    @Test
    fun workerNameIsSanitisedFromEmail() {
        assertEquals("johndoe", AppRepository.workerNameFor("John.Doe@example.com"))
        assertEquals("miner", AppRepository.workerNameFor("@example.com"))
    }

    @Test
    fun poolUserIncludesPayoutAddressWhenSet() {
        val base = AccountEntity(email = "a@b.co", displayName = "A", authProvider = PROVIDER_EMAIL, passwordHash = null, workerName = "rig1")
        assertEquals("rig1", base.poolUser())
        assertEquals("addr.rig1", base.copy(payoutAddress = "addr").poolUser())
    }
}
