package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5788xm extends AbstractC3885ie implements IInterface {
    C5788xm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void H1(C5032rm c5032rm, InterfaceC5662wm interfaceC5662wm) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c5032rm);
        AbstractC4135ke.e(parcelJ, interfaceC5662wm);
        t1(2, parcelJ);
    }
}
