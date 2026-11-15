package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5018rf extends AbstractC3885ie implements InterfaceC5396uf {
    C5018rf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5396uf
    public final void G(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5396uf
    public final void f5(InterfaceC4893qf interfaceC4893qf) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC4893qf);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5396uf
    public final void j0(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }
}
