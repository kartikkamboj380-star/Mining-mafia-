package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3017bk extends AbstractC3885ie implements InterfaceC3268dk {
    C3017bk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void B5(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(9, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void E4(String str, com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.e(parcelJ, aVar);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void G1(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(7, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final com.google.android.gms.dynamic.a H(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        Parcel parcelH0 = h0(2, parcelJ);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void J3(InterfaceC2607Wj interfaceC2607Wj) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2607Wj);
        N0(8, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void W(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void e0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(6, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void q0(com.google.android.gms.dynamic.a aVar, int i10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        parcelJ.writeInt(i10);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3268dk
    public final void zze() {
        N0(4, J());
    }
}
