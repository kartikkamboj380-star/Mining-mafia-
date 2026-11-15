package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3531fq extends NativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2401Sk f28484a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3405eq f28486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NativeAd.a f28487d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f28485b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f28488e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f28489f = new AtomicLong();

    public C3531fq(InterfaceC2401Sk interfaceC2401Sk) {
        C3405eq c3405eq;
        this.f28484a = interfaceC2401Sk;
        C3154cq c3154cq = null;
        try {
            List listB = interfaceC2401Sk.b();
            if (listB != null) {
                for (Object obj : listB) {
                    InterfaceC2763Zj interfaceC2763ZjY6 = obj instanceof IBinder ? AbstractBinderC2711Yj.y6((IBinder) obj) : null;
                    if (interfaceC2763ZjY6 != null) {
                        this.f28485b.add(new C3405eq(interfaceC2763ZjY6));
                    }
                }
            }
        } catch (RemoteException e10) {
            L4.p.d("", e10);
        }
        try {
            List listM = this.f28484a.m();
            if (listM != null) {
                for (Object obj2 : listM) {
                    H4.I0 i0Y6 = obj2 instanceof IBinder ? H4.H0.y6((IBinder) obj2) : null;
                    if (i0Y6 != null) {
                        this.f28488e.add(new H4.J0(i0Y6));
                    }
                }
            }
        } catch (RemoteException e11) {
            L4.p.d("", e11);
        }
        try {
            InterfaceC2763Zj interfaceC2763ZjC = this.f28484a.c();
            c3405eq = interfaceC2763ZjC != null ? new C3405eq(interfaceC2763ZjC) : null;
        } catch (RemoteException e12) {
            L4.p.d("", e12);
        }
        this.f28486c = c3405eq;
        try {
            if (this.f28484a.a() != null) {
                c3154cq = new C3154cq(this.f28484a.a());
            }
        } catch (RemoteException e13) {
            L4.p.d("", e13);
        }
        this.f28487d = c3154cq;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void a() {
        try {
            this.f28484a.h();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f28484a.d();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String c() {
        try {
            return this.f28484a.zzg();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String d() {
        try {
            return this.f28484a.zzi();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String e() {
        try {
            return this.f28484a.zze();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.b f() {
        return this.f28486c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List g() {
        return this.f28485b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final B4.l h() {
        try {
            InterfaceC2401Sk interfaceC2401Sk = this.f28484a;
            if (interfaceC2401Sk.t() != null) {
                return new H4.F1(interfaceC2401Sk.t(), null);
            }
        } catch (RemoteException e10) {
            L4.p.d("", e10);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String i() {
        try {
            return this.f28484a.e();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final B4.u j() {
        InterfaceC0582a1 interfaceC0582a1W;
        try {
            interfaceC0582a1W = this.f28484a.w();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            interfaceC0582a1W = null;
        }
        return B4.u.e(interfaceC0582a1W);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double k() {
        try {
            double dZzk = this.f28484a.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String l() {
        try {
            return this.f28484a.zzl();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void m(B4.o oVar) {
        try {
            this.f28484a.c2(new H4.R1(oVar));
        } catch (RemoteException e10) {
            L4.p.d("Failed to setOnPaidEventListener", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ Object n() {
        try {
            return this.f28484a.zzu();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle) {
        try {
            this.f28484a.F2(bundle);
        } catch (RemoteException e10) {
            L4.p.d("Failed to record native event", e10);
        }
    }
}
