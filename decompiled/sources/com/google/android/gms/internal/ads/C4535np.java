package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4535np extends AbstractC3885ie implements InterfaceC4787pp {
    C4535np(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787pp
    public final void d3(InterfaceC2097Mo interfaceC2097Mo) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2097Mo);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787pp
    public final void i(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString("Adapter returned null.");
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787pp
    public final void o(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }
}
