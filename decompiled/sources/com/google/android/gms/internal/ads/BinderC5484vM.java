package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import K4.AbstractC0786o0;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC5484vM extends AbstractBinderC2555Vj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OM f34045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.dynamic.a f34046b;

    public BinderC5484vM(OM om) {
        this.f34045a = om;
    }

    private static float y6(com.google.android.gms.dynamic.a aVar) {
        Drawable drawable;
        return (aVar == null || (drawable = (Drawable) com.google.android.gms.dynamic.b.h0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final void H5(C1830Hk c1830Hk) {
        OM om = this.f34045a;
        if (om.l0() instanceof BinderC4425mx) {
            ((BinderC4425mx) om.l0()).E6(c1830Hk);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final float c() {
        OM om = this.f34045a;
        return om.l0() != null ? om.l0().d() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final InterfaceC0591d1 d() {
        return this.f34045a.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final float zze() {
        C2479Tx c2479TxE;
        int i10;
        int i11;
        OM om = this.f34045a;
        if (om.C() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return om.C();
        }
        if (om.l0() != null) {
            try {
                return om.l0().e();
            } catch (RemoteException e10) {
                int i12 = AbstractC0786o0.f2696b;
                L4.p.d("Remote exception getting video controller aspect ratio.", e10);
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        com.google.android.gms.dynamic.a aVar = this.f34046b;
        if (aVar != null) {
            return y6(aVar);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Pd)).booleanValue() && om.u() != null && (c2479TxE = om.u().E()) != null && (i10 = c2479TxE.f23648c) >= 0 && (i11 = c2479TxE.f23647b) > 0) {
            return i10 / i11;
        }
        InterfaceC2763Zj interfaceC2763ZjD = om.d();
        if (interfaceC2763ZjD == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float fZze = (interfaceC2763ZjD.zze() == -1 || interfaceC2763ZjD.b() == -1) ? 0.0f : interfaceC2763ZjD.zze() / interfaceC2763ZjD.b();
        return fZze == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? y6(interfaceC2763ZjD.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final void zzf(com.google.android.gms.dynamic.a aVar) {
        this.f34046b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final com.google.android.gms.dynamic.a zzg() {
        com.google.android.gms.dynamic.a aVar = this.f34046b;
        if (aVar != null) {
            return aVar;
        }
        InterfaceC2763Zj interfaceC2763ZjD = this.f34045a.d();
        if (interfaceC2763ZjD == null) {
            return null;
        }
        return interfaceC2763ZjD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final float zzi() {
        OM om = this.f34045a;
        return om.l0() != null ? om.l0().zzk() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final boolean zzk() {
        return this.f34045a.l0() != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final boolean zzl() {
        return this.f34045a.v();
    }
}
