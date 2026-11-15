package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4035jr extends AbstractC3885ie implements InterfaceC4287lr {
    C4035jr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void D5(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, parcelFileDescriptor);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void E1(K4.C c10) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c10);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4287lr
    public final void U2(ParcelFileDescriptor parcelFileDescriptor, C5420ur c5420ur) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, parcelFileDescriptor);
        AbstractC4135ke.c(parcelJ, c5420ur);
        N0(3, parcelJ);
    }
}
