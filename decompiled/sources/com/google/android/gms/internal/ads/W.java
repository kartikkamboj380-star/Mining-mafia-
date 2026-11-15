package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JY0 f24625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ X f24626b;

    /* synthetic */ W(X x10, byte[] bArr) {
        Objects.requireNonNull(x10);
        this.f24626b = x10;
    }

    public final void a(final C3152cp c3152cp) {
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.s0(c3152cp.f27222a);
        c5507vX0.t0(c3152cp.f27223b);
        c5507vX0.l0("video/raw");
        this.f24625a = c5507vX0.m();
        this.f24626b.r().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.V
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f24147a.f24626b.q().a(c3152cp);
            }
        });
    }

    public final void b(long j10, long j11, boolean z9) {
        if (z9) {
            X x10 = this.f24626b;
            if (x10.p() != null) {
                x10.r().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.T
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f23357a.f24626b.q().zzb();
                    }
                });
            }
        }
        JY0 jy0M = this.f24625a;
        if (jy0M == null) {
            jy0M = new C5507vX0().m();
        }
        JY0 jy0 = jy0M;
        X x11 = this.f24626b;
        x11.s().c(j11, j10, jy0, null);
        ((InterfaceC3052c1) x11.u().remove()).a(j10);
    }
}
