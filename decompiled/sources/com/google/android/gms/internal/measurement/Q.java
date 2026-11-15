package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends N implements T {
    Q(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final Bundle c0(Bundle bundle) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, bundle);
        Parcel parcelJ = J(1, parcelH0);
        Bundle bundle2 = (Bundle) P.b(parcelJ, Bundle.CREATOR);
        parcelJ.recycle();
        return bundle2;
    }
}
