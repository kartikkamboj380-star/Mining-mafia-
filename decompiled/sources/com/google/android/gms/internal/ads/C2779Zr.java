package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2779Zr extends AbstractC3885ie implements InterfaceC3033bs {
    C2779Zr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final void C5(InterfaceC3535fs interfaceC3535fs) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC3535fs);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final void V0(H4.h2 h2Var, InterfaceC4037js interfaceC4037js) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, h2Var);
        AbstractC4135ke.e(parcelJ, interfaceC4037js);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final void c1(C4919qs c4919qs) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c4919qs);
        N0(7, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final InterfaceC0582a1 e() {
        Parcel parcelH0 = h0(12, J());
        InterfaceC0582a1 interfaceC0582a1Y6 = H4.Y0.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0582a1Y6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final void l1(H4.h2 h2Var, InterfaceC4037js interfaceC4037js) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, h2Var);
        AbstractC4135ke.e(parcelJ, interfaceC4037js);
        N0(14, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final void t0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final void t6(boolean z9) {
        Parcel parcelJ = J();
        int i10 = AbstractC4135ke.f30848b;
        parcelJ.writeInt(z9 ? 1 : 0);
        N0(15, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final void v6(H4.S0 s10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, s10);
        N0(13, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033bs
    public final InterfaceC2727Yr zzl() {
        InterfaceC2727Yr c2623Wr;
        Parcel parcelH0 = h0(11, J());
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            c2623Wr = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            c2623Wr = iInterfaceQueryLocalInterface instanceof InterfaceC2727Yr ? (InterfaceC2727Yr) iInterfaceQueryLocalInterface : new C2623Wr(strongBinder);
        }
        parcelH0.recycle();
        return c2623Wr;
    }
}
