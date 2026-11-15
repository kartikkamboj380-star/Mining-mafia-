package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0588c1;
import H4.InterfaceC0591d1;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2503Uj extends AbstractC3885ie implements InterfaceC2607Wj {
    C2503Uj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final float c() {
        Parcel parcelH0 = h0(5, J());
        float f10 = parcelH0.readFloat();
        parcelH0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final InterfaceC0591d1 d() {
        Parcel parcelH0 = h0(7, J());
        InterfaceC0591d1 interfaceC0591d1Y6 = AbstractBinderC0588c1.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0591d1Y6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final float zze() {
        Parcel parcelH0 = h0(2, J());
        float f10 = parcelH0.readFloat();
        parcelH0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final com.google.android.gms.dynamic.a zzg() {
        Parcel parcelH0 = h0(4, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final boolean zzk() {
        Parcel parcelH0 = h0(8, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2607Wj
    public final boolean zzl() {
        Parcel parcelH0 = h0(10, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }
}
