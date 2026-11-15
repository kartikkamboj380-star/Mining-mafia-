package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4913qp extends AbstractC3885ie implements InterfaceC5164sp {
    C4913qp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5164sp
    public final void i(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString("Adapter returned null.");
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5164sp
    public final void o(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5164sp
    public final void zze() {
        N0(2, J());
    }
}
