package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2028Lf extends AbstractC3885ie implements IInterface {
    C2028Lf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final C1768Gf H1(C1924Jf c1924Jf) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c1924Jf);
        Parcel parcelH0 = h0(1, parcelJ);
        C1768Gf c1768Gf = (C1768Gf) AbstractC4135ke.b(parcelH0, C1768Gf.CREATOR);
        parcelH0.recycle();
        return c1768Gf;
    }

    public final C1768Gf Z1(C1924Jf c1924Jf) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c1924Jf);
        Parcel parcelH0 = h0(2, parcelJ);
        C1768Gf c1768Gf = (C1768Gf) AbstractC4135ke.b(parcelH0, C1768Gf.CREATOR);
        parcelH0.recycle();
        return c1768Gf;
    }

    public final long i2(C1924Jf c1924Jf) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c1924Jf);
        Parcel parcelH0 = h0(3, parcelJ);
        long j10 = parcelH0.readLong();
        parcelH0.recycle();
        return j10;
    }
}
