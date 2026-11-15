package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4157kp extends AbstractC3885ie implements InterfaceC4409mp {
    C4157kp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4409mp
    public final void i(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString("Adapter returned null.");
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4409mp
    public final void o(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4409mp
    public final void zze() {
        N0(2, J());
    }
}
