package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3781hp extends AbstractC3885ie implements InterfaceC4031jp {
    C3781hp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void F3(InterfaceC1786Go interfaceC1786Go) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC1786Go);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void I(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void i(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString("Adapter returned null.");
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void o(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }
}
