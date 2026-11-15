package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ei0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1671Ei0 extends AbstractC3885ie implements InterfaceC1775Gi0 {
    C1671Ei0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1775Gi0
    public final void E3(int[] iArr) {
        Parcel parcelJ = J();
        parcelJ.writeIntArray(null);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1775Gi0
    public final void n5(com.google.android.gms.dynamic.a aVar, String str, String str2) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        parcelJ.writeString(str);
        parcelJ.writeString(null);
        N0(8, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1775Gi0
    public final void t2(byte[] bArr) {
        Parcel parcelJ = J();
        parcelJ.writeByteArray(bArr);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1775Gi0
    public final void x(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(6, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1775Gi0
    public final void zze() {
        N0(3, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1775Gi0
    public final void zzi(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(7, parcelJ);
    }
}
