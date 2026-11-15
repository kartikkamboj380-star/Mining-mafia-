package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ni0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4522ni0 extends AbstractC3885ie implements IInterface {
    C4522ni0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final C4270li0 H1(C4018ji0 c4018ji0) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c4018ji0);
        Parcel parcelH0 = h0(1, parcelJ);
        C4270li0 c4270li0 = (C4270li0) AbstractC4135ke.b(parcelH0, C4270li0.CREATOR);
        parcelH0.recycle();
        return c4270li0;
    }

    public final void Z1(C3642gi0 c3642gi0) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c3642gi0);
        N0(2, parcelJ);
    }

    public final C5403ui0 i2(C5151si0 c5151si0) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c5151si0);
        Parcel parcelH0 = h0(3, parcelJ);
        C5403ui0 c5403ui0 = (C5403ui0) AbstractC4135ke.b(parcelH0, C5403ui0.CREATOR);
        parcelH0.recycle();
        return c5403ui0;
    }
}
