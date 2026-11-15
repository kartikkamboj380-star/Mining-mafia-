package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3376eb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f27814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QR f27815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f27816c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f27818e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile long f27817d = 0;

    public C3376eb0(Clock clock, QR qr) {
        this.f27814a = clock;
        this.f27815b = qr;
    }

    private final void e() {
        long jCurrentTimeMillis = this.f27814a.currentTimeMillis();
        synchronized (this.f27816c) {
            try {
                if (this.f27818e == 3) {
                    if (this.f27817d + ((Long) H4.B.c().d(AbstractC3892ii.f29696T6)).longValue() <= jCurrentTimeMillis) {
                        this.f27818e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(int i10, int i11) {
        e();
        Object obj = this.f27816c;
        long jCurrentTimeMillis = this.f27814a.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f27818e != i10) {
                    return;
                }
                this.f27818e = i11;
                if (this.f27818e == 3) {
                    this.f27817d = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(boolean z9) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Be)).booleanValue()) {
            PR prA = this.f27815b.a();
            prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "mbs_state");
            prA.c("mbs_state", true != z9 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            prA.d();
        }
        if (z9) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean b() {
        boolean z9;
        synchronized (this.f27816c) {
            e();
            z9 = this.f27818e == 2;
        }
        return z9;
    }

    public final boolean c() {
        boolean z9;
        synchronized (this.f27816c) {
            e();
            z9 = this.f27818e == 3;
        }
        return z9;
    }

    public final void d() {
        f(2, 3);
    }
}
