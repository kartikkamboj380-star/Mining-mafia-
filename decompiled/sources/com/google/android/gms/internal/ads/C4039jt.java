package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4039jt extends AbstractC3885ie implements InterfaceC4291lt {
    C4039jt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291lt
    public final void N2(com.google.android.gms.dynamic.a aVar, C4795pt c4795pt, InterfaceC3789ht interfaceC3789ht) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.c(parcelJ, c4795pt);
        AbstractC4135ke.e(parcelJ, interfaceC3789ht);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291lt
    public final com.google.android.gms.dynamic.a R4(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, String str, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, aVar2);
        parcelJ.writeString(str);
        AbstractC4135ke.e(parcelJ, aVar3);
        Parcel parcelH0 = h0(11, parcelJ);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291lt
    public final void i0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(8, parcelJ);
    }
}
