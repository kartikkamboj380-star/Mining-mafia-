package com.miningmafia.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Night = Color(0xFF0B0F14)
val Charcoal = Color(0xFF131A22)
val Slate = Color(0xFF1E2731)
val Gold = Color(0xFFF5B942)
val Crimson = Color(0xFFC0392B)
val Mint = Color(0xFF3DDC97)
val Ash = Color(0xFF9AA7B4)
val Bone = Color(0xFFEDE7DA)

private val MafiaDark = darkColorScheme(
    primary = Gold,
    onPrimary = Color(0xFF1A1200),
    secondary = Crimson,
    onSecondary = Color.White,
    tertiary = Mint,
    background = Night,
    onBackground = Bone,
    surface = Charcoal,
    onSurface = Bone,
    surfaceVariant = Slate,
    onSurfaceVariant = Ash,
    error = Color(0xFFFF6B6B),
)

@Composable
fun MiningMafiaTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = MafiaDark, content = content)
}
