package com.miningmafia.app.data

import java.math.BigDecimal
import java.math.RoundingMode

/** Pool balances are kept as integer units: 1 coin = 100,000,000 units. */
object Units {
    const val PER_COIN = 100_000_000L

    fun format(units: Long): String =
        BigDecimal.valueOf(units, 8).setScale(8, RoundingMode.DOWN).toPlainString()

    /** Parses a decimal coin amount such as "0.125" into units. Returns null if invalid. */
    fun parse(text: String): Long? = runCatching {
        BigDecimal(text.trim()).movePointRight(8).setScale(0, RoundingMode.DOWN).longValueExact()
    }.getOrNull()
}
