package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2295Qj extends AbstractC3885ie implements InterfaceC2399Sj {
    C2295Qj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2399Sj
    public final String zzb() {
        Parcel parcelH0 = h0(2, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2399Sj
    public final List zzc() {
        Parcel parcelH0 = h0(3, J());
        ArrayList arrayListF = AbstractC4135ke.f(parcelH0);
        parcelH0.recycle();
        return arrayListF;
    }
}
