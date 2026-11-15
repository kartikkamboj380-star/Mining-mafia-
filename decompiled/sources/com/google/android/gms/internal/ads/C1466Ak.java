package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1466Ak extends AbstractC3885ie implements InterfaceC1570Ck {
    C1466Ak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Ck
    public final void V1(InterfaceC5154sk interfaceC5154sk, String str) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC5154sk);
        parcelJ.writeString(str);
        N0(1, parcelJ);
    }
}
