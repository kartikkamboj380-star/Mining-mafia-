package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1834Hm extends AbstractC3885ie implements InterfaceC1938Jm {
    C1834Hm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Jm
    public final void i(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Jm
    public final void zze() {
        N0(2, J());
    }
}
