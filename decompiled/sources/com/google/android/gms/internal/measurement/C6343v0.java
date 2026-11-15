package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6343v0 extends N implements InterfaceC6361x0 {
    C6343v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6361x0
    public final void f0(Bundle bundle) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, bundle);
        N0(1, parcelH0);
    }
}
