package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3160ct extends AbstractC3885ie implements InterfaceC3789ht {
    C3160ct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3789ht
    public final void j(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3789ht
    public final void x1(String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        AbstractC4135ke.c(parcelJ, bundle);
        N0(3, parcelJ);
    }
}
