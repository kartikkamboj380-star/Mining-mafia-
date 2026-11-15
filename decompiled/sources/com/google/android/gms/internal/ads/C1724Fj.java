package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1724Fj extends AbstractC3885ie implements IInterface {
    C1724Fj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void H1(InterfaceC2517Uq interfaceC2517Uq) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2517Uq);
        N0(1, parcelJ);
    }
}
