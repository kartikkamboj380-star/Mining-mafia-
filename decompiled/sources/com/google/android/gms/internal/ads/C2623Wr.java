package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2623Wr extends AbstractC3885ie implements InterfaceC2727Yr {
    C2623Wr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2727Yr
    public final int b() {
        Parcel parcelH0 = h0(2, J());
        int i10 = parcelH0.readInt();
        parcelH0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2727Yr
    public final String zze() {
        Parcel parcelH0 = h0(1, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }
}
