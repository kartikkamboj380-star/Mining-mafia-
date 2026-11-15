package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;
import com.unity3d.services.core.di.ServiceProvider;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f12745b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f12746a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12747c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f12748d;

    c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f12747c) {
                    return;
                }
                c.this.f12746a.d();
                long unused = c.f12745b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f12748d, 500L);
                } else {
                    m.a().a(c.this.f12748d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f12745b);
            }
        };
        this.f12748d = runnable;
        this.f12746a = bVar;
        m.a().a(runnable, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f12745b <= 15000;
    }

    public final void b() {
        this.f12747c = true;
    }

    public final void a() {
        if (this.f12747c) {
            return;
        }
        m.a().a(this.f12748d, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
    }
}
