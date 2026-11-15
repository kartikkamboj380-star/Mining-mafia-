package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2659Xj extends AbstractC3885ie implements InterfaceC2763Zj {
    C2659Xj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final int b() {
        Parcel parcelH0 = h0(5, J());
        int i10 = parcelH0.readInt();
        parcelH0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final com.google.android.gms.dynamic.a zzb() {
        Parcel parcelH0 = h0(1, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final Uri zzc() {
        Parcel parcelH0 = h0(2, J());
        Uri uri = (Uri) AbstractC4135ke.b(parcelH0, Uri.CREATOR);
        parcelH0.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final double zzd() {
        Parcel parcelH0 = h0(3, J());
        double d10 = parcelH0.readDouble();
        parcelH0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final int zze() {
        Parcel parcelH0 = h0(4, J());
        int i10 = parcelH0.readInt();
        parcelH0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final Map zzg() {
        Parcel parcelH0 = h0(6, J());
        HashMap mapG = AbstractC4135ke.g(parcelH0);
        parcelH0.recycle();
        return mapG;
    }
}
