package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4261le extends AbstractC3885ie implements InterfaceC4513ne {
    C4261le(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4513ne
    public final Bundle c0(Bundle bundle) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, bundle);
        Parcel parcelH0 = h0(1, parcelJ);
        Bundle bundle2 = (Bundle) AbstractC4135ke.b(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }
}
