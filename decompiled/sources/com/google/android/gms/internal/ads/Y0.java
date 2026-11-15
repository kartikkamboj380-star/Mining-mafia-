package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z0 f25436b;

    public Y0(Handler handler, Z0 z9) {
        if (z9 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f25435a = handler;
        this.f25436b = z9;
    }

    public final void a(final C5997zQ0 c5997zQ0) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.X0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f25045a.k(c5997zQ0);
                }
            });
        }
    }

    public final void b(final String str, final long j10, final long j11) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.O0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f21432a.l(str, j10, j11);
                }
            });
        }
    }

    public final void c(final JY0 jy0, final AQ0 aq0) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.P0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f21993a.m(jy0, aq0);
                }
            });
        }
    }

    public final void d(final int i10, final long j10) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Q0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f22266a.n(i10, j10);
                }
            });
        }
    }

    public final void e(final long j10, final int i10) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.R0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f22678a.o(j10, i10);
                }
            });
        }
    }

    public final void f(final C3152cp c3152cp) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.S0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f23099a.p(c3152cp);
                }
            });
        }
    }

    public final void g(final Object obj) {
        Handler handler = this.f25435a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.T0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f23358a.q(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void h(final String str) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.U0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f23883a.r(str);
                }
            });
        }
    }

    public final void i(final C5997zQ0 c5997zQ0) {
        c5997zQ0.a();
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.V0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f24149a.s(c5997zQ0);
                }
            });
        }
    }

    public final void j(final Exception exc) {
        Handler handler = this.f25435a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.W0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f24627a.t(exc);
                }
            });
        }
    }

    final /* synthetic */ void k(C5997zQ0 c5997zQ0) {
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.w(c5997zQ0);
    }

    final /* synthetic */ void l(String str, long j10, long j11) {
        String str2 = AbstractC4634ob0.f32117a;
        this.f25436b.t(str, j10, j11);
    }

    final /* synthetic */ void m(JY0 jy0, AQ0 aq0) {
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.d(jy0, aq0);
    }

    final /* synthetic */ void n(int i10, long j10) {
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.m(i10, j10);
    }

    final /* synthetic */ void o(long j10, int i10) {
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.p(j10, i10);
    }

    final /* synthetic */ void p(C3152cp c3152cp) {
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.u(c3152cp);
    }

    final /* synthetic */ void q(Object obj, long j10) {
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.g(obj, j10);
    }

    final /* synthetic */ void r(String str) {
        String str2 = AbstractC4634ob0.f32117a;
        this.f25436b.K(str);
    }

    final /* synthetic */ void s(C5997zQ0 c5997zQ0) {
        c5997zQ0.a();
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.r(c5997zQ0);
    }

    final /* synthetic */ void t(Exception exc) {
        String str = AbstractC4634ob0.f32117a;
        this.f25436b.f(exc);
    }
}
