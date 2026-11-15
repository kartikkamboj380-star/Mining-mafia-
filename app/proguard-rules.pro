# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

-dontwarn androidx.**
-dontwarn com.google.android.gms.**
-dontwarn com.google.firebase.**
-dontwarn okhttp3.**
-dontwarn retrofit2.**
-dontwarn com.squareup.**

-keep class com.miningmafia.app.** { *; }
-keep class androidx.room.** { *; }
