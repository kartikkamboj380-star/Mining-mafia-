package W3;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6566a = new d();

    private d() {
    }

    public static final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Z1.a.m("ReactNative", message);
    }

    private final String b(int i10) {
        if (i10 == 2 || i10 == 3) {
            return "log";
        }
        if (i10 == 4 || i10 == 5) {
            return LogEvent.LEVEL_WARN;
        }
        return i10 != 6 ? "none" : LogEvent.LEVEL_ERROR;
    }

    private final void c(ReactContext reactContext, String str, int i10) {
        if (i10 < 5 || reactContext == null || !reactContext.hasActiveReactInstance() || str == null) {
            return;
        }
        ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(b(i10), str);
    }

    public static final void d(ReactContext reactContext, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f6566a.c(reactContext, message, 5);
        Z1.a.I("ReactNative", message);
    }
}
