package app.notifee.core.event;

import app.notifee.core.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class LogEvent {

    @KeepForSdk
    public static final String LEVEL_DEBUG = "debug";

    @KeepForSdk
    public static final String LEVEL_ERROR = "error";

    @KeepForSdk
    public static final String LEVEL_INFO = "info";

    @KeepForSdk
    public static final String LEVEL_VERBOSE = "verbose";

    @KeepForSdk
    public static final String LEVEL_WARN = "warn";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f11474d;

    public LogEvent(String str, String str2, String str3) {
        this.f11471a = str2;
        this.f11472b = str;
        this.f11473c = str3;
        this.f11474d = null;
    }

    @KeepForSdk
    public String getLevel() {
        return this.f11472b;
    }

    @KeepForSdk
    public String getMessage() {
        return this.f11473c;
    }

    @KeepForSdk
    public String getTag() {
        return this.f11471a;
    }

    @KeepForSdk
    public Throwable getThrowable() {
        return this.f11474d;
    }

    public LogEvent(String str, String str2, String str3, Throwable th) {
        this.f11471a = str2;
        this.f11472b = str;
        this.f11473c = str3;
        this.f11474d = th;
    }
}
