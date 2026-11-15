package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3787hs extends AbstractC3885ie implements InterfaceC4037js {
    C3787hs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void n(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void o(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void zze() {
        N0(1, J());
    }
}
