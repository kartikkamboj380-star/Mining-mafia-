package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4163ks extends AbstractC3885ie implements IInterface {
    C4163ks(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void H1(InterfaceC2727Yr interfaceC2727Yr, String str, String str2) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2727Yr);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        N0(2, parcelJ);
    }
}
