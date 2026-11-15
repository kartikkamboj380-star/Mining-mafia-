package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f13203a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13204b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13205c;

    public static MonitorCrash a() {
        if (f13203a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f13203a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f13203a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f13204b == -1) {
            f13204b = 5;
        }
        int i10 = f13205c;
        if (i10 < f13204b) {
            f13205c = i10 + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
