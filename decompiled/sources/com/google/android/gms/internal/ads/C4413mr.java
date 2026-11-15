package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4413mr extends AbstractC3885ie implements IInterface {
    C4413mr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void E1(K4.C c10) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c10);
        N0(2, parcelJ);
    }

    public final void H1(String str, C3281dr c3281dr) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.c(parcelJ, c3281dr);
        N0(1, parcelJ);
    }
}
