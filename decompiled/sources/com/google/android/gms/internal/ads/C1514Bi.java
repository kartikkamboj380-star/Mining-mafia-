package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1514Bi extends AbstractC3885ie implements InterfaceC1618Di {
    C1514Bi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1618Di
    public final void W1(InterfaceC1462Ai interfaceC1462Ai) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC1462Ai);
        N0(1, parcelJ);
    }
}
