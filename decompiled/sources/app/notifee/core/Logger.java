package app.notifee.core;

import android.util.Log;
import androidx.annotation.NonNull;
import app.notifee.core.event.LogEvent;
import b9.g;

/* JADX INFO: loaded from: classes.dex */
public class Logger {
    public static String a(String str, String str2) {
        return "(" + str + "): " + str2;
    }

    @KeepForSdk
    public static void d(@NonNull String str, String str2) {
        Log.d("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void e(@NonNull String str, String str2, Exception exc) {
        Log.e("NOTIFEE", a(str, str2), exc);
        g.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2, exc));
    }

    @KeepForSdk
    public static void i(@NonNull String str, String str2) {
        Log.i("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void v(@NonNull String str, String str2) {
        Log.v("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void w(@NonNull String str, String str2) {
        Log.w("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void e(@NonNull String str, String str2) {
        Log.e("NOTIFEE", a(str, str2));
        g.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2));
    }

    @KeepForSdk
    public static void e(@NonNull String str, String str2, Throwable th) {
        Log.e("NOTIFEE", a(str, str2), th);
        g.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2, th));
    }
}
