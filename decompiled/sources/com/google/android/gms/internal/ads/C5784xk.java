package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5784xk extends AbstractC3885ie implements InterfaceC6036zk {
    C5784xk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6036zk
    public final void k4(InterfaceC4777pk interfaceC4777pk) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC4777pk);
        N0(1, parcelJ);
    }
}
