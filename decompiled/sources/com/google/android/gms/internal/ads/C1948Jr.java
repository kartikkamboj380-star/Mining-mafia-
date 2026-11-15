package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1948Jr extends AbstractC3885ie implements IInterface {
    C1948Jr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void H1(InterfaceC1896Ir interfaceC1896Ir, String str, String str2) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC1896Ir);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        N0(2, parcelJ);
    }
}
