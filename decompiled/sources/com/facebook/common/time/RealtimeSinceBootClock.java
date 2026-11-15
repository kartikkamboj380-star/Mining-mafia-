package com.facebook.common.time;

import Y1.d;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p053f2.b;

/* JADX INFO: loaded from: classes.dex */
@d
public class RealtimeSinceBootClock implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f13722a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f13722a;
    }

    @Override // p053f2.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p053f2.b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
