package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1882Ik extends AbstractC3885ie implements InterfaceC1986Kk {
    C1882Ik(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1986Kk
    public final void Y4(H4.W w10, com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, w10);
        AbstractC4135ke.e(parcelJ, aVar);
        N0(1, parcelJ);
    }
}
