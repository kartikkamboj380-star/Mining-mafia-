package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends com.google.android.gms.internal.base.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void J(int i10) {
        Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i10);
        zac(7, parcelZaa);
    }

    public final void N0(j jVar, f fVar) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.c.c(parcelZaa, jVar);
        com.google.android.gms.internal.base.c.d(parcelZaa, fVar);
        zac(12, parcelZaa);
    }

    public final void h0(IAccountAccessor iAccountAccessor, int i10, boolean z9) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.c.d(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i10);
        parcelZaa.writeInt(z9 ? 1 : 0);
        zac(9, parcelZaa);
    }
}
