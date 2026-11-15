package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.HandlerC6299q0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6657x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Handler f38500d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3 f38501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f38502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f38503c;

    AbstractC6657x(C3 c10) {
        Preconditions.checkNotNull(c10);
        this.f38501a = c10;
        this.f38502b = new RunnableC6650w(this, c10);
    }

    private final Handler f() {
        Handler handler;
        if (f38500d != null) {
            return f38500d;
        }
        synchronized (AbstractC6657x.class) {
            try {
                if (f38500d == null) {
                    f38500d = new HandlerC6299q0(this.f38501a.d().getMainLooper());
                }
                handler = f38500d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            C3 c10 = this.f38501a;
            this.f38503c = c10.e().currentTimeMillis();
            if (f().postDelayed(this.f38502b, j10)) {
                return;
            }
            c10.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f38503c != 0;
    }

    final void d() {
        this.f38503c = 0L;
        f().removeCallbacks(this.f38502b);
    }

    final /* synthetic */ void e(long j10) {
        this.f38503c = 0L;
    }
}
