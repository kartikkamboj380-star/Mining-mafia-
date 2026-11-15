package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4903qk extends AbstractC3885ie implements InterfaceC5154sk {
    C4903qk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5154sk
    public final boolean R(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        Parcel parcelH0 = h0(10, parcelJ);
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5154sk
    public final String c() {
        Parcel parcelH0 = h0(4, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5154sk
    public final com.google.android.gms.dynamic.a e() {
        Parcel parcelH0 = h0(9, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5154sk
    public final boolean x0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        Parcel parcelH0 = h0(17, parcelJ);
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }
}
