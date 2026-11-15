package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2193Ok extends AbstractC3885ie implements InterfaceC2245Pk {
    C2193Ok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2245Pk
    public final void b() {
        N0(2, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2245Pk
    public final void k(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(1, parcelJ);
    }
}
