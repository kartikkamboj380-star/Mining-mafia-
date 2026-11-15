package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5040rq extends AbstractC3885ie implements InterfaceC5292tq {
    C5040rq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5292tq
    public final IBinder I(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        Parcel parcelH0 = h0(1, parcelJ);
        IBinder strongBinder = parcelH0.readStrongBinder();
        parcelH0.recycle();
        return strongBinder;
    }
}
