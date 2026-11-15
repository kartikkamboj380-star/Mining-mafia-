package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4277lm extends AbstractC3885ie implements InterfaceC4529nm {
    C4277lm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4529nm
    public final void j(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(1, parcelJ);
    }
}
