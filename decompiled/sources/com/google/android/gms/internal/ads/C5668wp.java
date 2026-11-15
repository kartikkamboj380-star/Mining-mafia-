package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5668wp extends AbstractC3885ie implements InterfaceC5920yp {
    C5668wp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5920yp
    public final void k(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5920yp
    public final void o(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }
}
