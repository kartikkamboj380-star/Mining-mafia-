package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4246lW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f31279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4372mW0 f31280b;

    public C4246lW0(Handler handler, InterfaceC4372mW0 interfaceC4372mW0) {
        this.f31279a = interfaceC4372mW0 == null ? null : handler;
        this.f31280b = interfaceC4372mW0;
    }

    final /* synthetic */ void A(C4498nW0 c4498nW0) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.h(c4498nW0);
    }

    final /* synthetic */ void B(C4498nW0 c4498nW0) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.v(c4498nW0);
    }

    final /* synthetic */ void a(int i10) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.j(i10);
    }

    final /* synthetic */ void b(C5871yQ0 c5871yQ0) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.o(c5871yQ0);
    }

    public final void c(final C5997zQ0 c5997zQ0) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.kW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f30814a.q(c5997zQ0);
                }
            });
        }
    }

    public final void d(final String str, final long j10, final long j11) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.WV0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f24786a.r(str, j10, j11);
                }
            });
        }
    }

    public final void e(final JY0 jy0, final AQ0 aq0) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.aW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f26547a.s(jy0, aq0);
                }
            });
        }
    }

    public final void f(final long j10) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f26837a.t(j10);
                }
            });
        }
    }

    public final void g(final int i10, final long j10, final long j11) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f27135a.u(i10, j10, j11);
                }
            });
        }
    }

    public final void h(final String str) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f27429a.v(str);
                }
            });
        }
    }

    public final void i(final C5997zQ0 c5997zQ0) {
        c5997zQ0.a();
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f27792a.w(c5997zQ0);
                }
            });
        }
    }

    public final void j(final boolean z9) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f28342a.x(z9);
                }
            });
        }
    }

    public final void k(final Exception exc) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f28678a.y(exc);
                }
            });
        }
    }

    public final void l(final Exception exc) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f29008a.z(exc);
                }
            });
        }
    }

    public final void m(final C4498nW0 c4498nW0) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.iW0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f29428a.A(c4498nW0);
                }
            });
        }
    }

    public final void n(final C4498nW0 c4498nW0) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.XV0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f25294a.B(c4498nW0);
                }
            });
        }
    }

    public final void o(final int i10) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.YV0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f25625a.a(i10);
                }
            });
        }
    }

    public final void p(final C5871yQ0 c5871yQ0) {
        Handler handler = this.f31279a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ZV0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f26203a.b(c5871yQ0);
                }
            });
        }
    }

    final /* synthetic */ void q(C5997zQ0 c5997zQ0) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.l(c5997zQ0);
    }

    final /* synthetic */ void r(String str, long j10, long j11) {
        String str2 = AbstractC4634ob0.f32117a;
        this.f31280b.c(str, j10, j11);
    }

    final /* synthetic */ void s(JY0 jy0, AQ0 aq0) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.s(jy0, aq0);
    }

    final /* synthetic */ void t(long j10) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.e(j10);
    }

    final /* synthetic */ void u(int i10, long j10, long j11) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.k(i10, j10, j11);
    }

    final /* synthetic */ void v(String str) {
        String str2 = AbstractC4634ob0.f32117a;
        this.f31280b.Y(str);
    }

    final /* synthetic */ void w(C5997zQ0 c5997zQ0) {
        c5997zQ0.a();
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.i(c5997zQ0);
    }

    final /* synthetic */ void x(boolean z9) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.a(z9);
    }

    final /* synthetic */ void y(Exception exc) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.q(exc);
    }

    final /* synthetic */ void z(Exception exc) {
        String str = AbstractC4634ob0.f32117a;
        this.f31280b.n(exc);
    }
}
