package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1682Eo extends AbstractC3885ie implements InterfaceC1786Go {
    C1682Eo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1786Go
    public final boolean b() {
        Parcel parcelH0 = h0(2, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1786Go
    public final com.google.android.gms.dynamic.a zze() {
        Parcel parcelH0 = h0(1, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }
}
