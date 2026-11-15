package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4639oe extends AbstractC3885ie implements InterfaceC5016re {
    C4639oe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5016re
    public final void A2(int[] iArr) {
        Parcel parcelJ = J();
        parcelJ.writeIntArray(null);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5016re
    public final void P2(byte[] bArr) {
        Parcel parcelJ = J();
        parcelJ.writeByteArray(bArr);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5016re
    public final void V(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(7, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5016re
    public final void Y2(com.google.android.gms.dynamic.a aVar, String str) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        parcelJ.writeString("GMA_SDK");
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5016re
    public final void b() {
        N0(3, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5016re
    public final void zzi(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(0);
        N0(6, parcelJ);
    }
}
