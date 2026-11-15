package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2717Ym extends AbstractC3885ie implements InterfaceC3023bn {
    C2717Ym(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3023bn
    public final void J5(InterfaceC2509Um interfaceC2509Um) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2509Um);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3023bn
    public final void n(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3023bn
    public final void o(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }
}
