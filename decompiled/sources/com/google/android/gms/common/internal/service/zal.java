package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zal extends com.google.android.gms.internal.base.a implements IInterface {
    zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.c.d(parcelZaa, zakVar);
        zad(1, parcelZaa);
    }
}
