package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2363Rr extends AbstractC3885ie implements InterfaceC2467Tr {
    C2363Rr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void B0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void F0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void G4(com.google.android.gms.dynamic.a aVar, int i10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        parcelJ.writeInt(i10);
        N0(9, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void I(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void e0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void g1(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(11, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void i0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(6, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void o6(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(8, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void s0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(13, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2467Tr
    public final void u2(com.google.android.gms.dynamic.a aVar, C2519Ur c2519Ur) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.c(parcelJ, c2519Ur);
        N0(7, parcelJ);
    }
}
