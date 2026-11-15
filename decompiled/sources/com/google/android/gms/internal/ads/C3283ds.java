package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3283ds extends AbstractC3885ie implements InterfaceC3535fs {
    C3283ds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3535fs
    public final void R2(InterfaceC2727Yr interfaceC2727Yr) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2727Yr);
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3535fs
    public final void b() {
        N0(2, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3535fs
    public final void d() {
        N0(6, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3535fs
    public final void o1(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3535fs
    public final void x(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3535fs
    public final void zze() {
        N0(1, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3535fs
    public final void zzk() {
        N0(7, J());
    }
}
