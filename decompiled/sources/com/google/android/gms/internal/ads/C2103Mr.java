package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2103Mr extends AbstractC3885ie implements InterfaceC2207Or {
    C2103Mr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void E(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(7, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void b() {
        N0(2, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void c() {
        N0(4, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void d() {
        N0(6, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void g2(InterfaceC1896Ir interfaceC1896Ir) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC1896Ir);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void zze() {
        N0(1, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void zzg() {
        N0(3, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2207Or
    public final void zzl() {
        N0(8, J());
    }
}
