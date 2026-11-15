package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2038Lk extends AbstractC3885ie implements InterfaceC2141Nk {
    C2038Lk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2141Nk
    public final void H4(InterfaceC2401Sk interfaceC2401Sk) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2401Sk);
        N0(1, parcelJ);
    }
}
