package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends N implements E0 {
    B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final void R0(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        P.c(parcelH0, bundle);
        parcelH0.writeLong(j10);
        N0(1, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final int b() {
        Parcel parcelJ = J(2, h0());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }
}
