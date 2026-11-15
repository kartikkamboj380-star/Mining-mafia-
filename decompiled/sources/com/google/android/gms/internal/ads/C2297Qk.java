package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0588c1;
import H4.InterfaceC0582a1;
import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2297Qk extends AbstractC3885ie implements InterfaceC2401Sk {
    C2297Qk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final void F2(Bundle bundle) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, bundle);
        N0(33, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final InterfaceC2399Sj a() {
        InterfaceC2399Sj c2295Qj;
        Parcel parcelH0 = h0(14, J());
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            c2295Qj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c2295Qj = iInterfaceQueryLocalInterface instanceof InterfaceC2399Sj ? (InterfaceC2399Sj) iInterfaceQueryLocalInterface : new C2295Qj(strongBinder);
        }
        parcelH0.recycle();
        return c2295Qj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final List b() {
        Parcel parcelH0 = h0(3, J());
        ArrayList arrayListF = AbstractC4135ke.f(parcelH0);
        parcelH0.recycle();
        return arrayListF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final InterfaceC2763Zj c() {
        InterfaceC2763Zj c2659Xj;
        Parcel parcelH0 = h0(5, J());
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            c2659Xj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c2659Xj = iInterfaceQueryLocalInterface instanceof InterfaceC2763Zj ? (InterfaceC2763Zj) iInterfaceQueryLocalInterface : new C2659Xj(strongBinder);
        }
        parcelH0.recycle();
        return c2659Xj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final void c2(H4.S0 s10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, s10);
        N0(32, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final String d() {
        Parcel parcelH0 = h0(7, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final String e() {
        Parcel parcelH0 = h0(10, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final void h() {
        N0(13, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final List m() {
        Parcel parcelH0 = h0(23, J());
        ArrayList arrayListF = AbstractC4135ke.f(parcelH0);
        parcelH0.recycle();
        return arrayListF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final com.google.android.gms.dynamic.a q() {
        Parcel parcelH0 = h0(19, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final InterfaceC2607Wj t() {
        InterfaceC2607Wj c2503Uj;
        Parcel parcelH0 = h0(29, J());
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            c2503Uj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c2503Uj = iInterfaceQueryLocalInterface instanceof InterfaceC2607Wj ? (InterfaceC2607Wj) iInterfaceQueryLocalInterface : new C2503Uj(strongBinder);
        }
        parcelH0.recycle();
        return c2503Uj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final InterfaceC0582a1 w() {
        Parcel parcelH0 = h0(31, J());
        InterfaceC0582a1 interfaceC0582a1Y6 = H4.Y0.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0582a1Y6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final String zze() {
        Parcel parcelH0 = h0(2, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final String zzg() {
        Parcel parcelH0 = h0(4, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final String zzi() {
        Parcel parcelH0 = h0(6, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final double zzk() {
        Parcel parcelH0 = h0(8, J());
        double d10 = parcelH0.readDouble();
        parcelH0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final String zzl() {
        Parcel parcelH0 = h0(9, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final InterfaceC0591d1 zzn() {
        Parcel parcelH0 = h0(11, J());
        InterfaceC0591d1 interfaceC0591d1Y6 = AbstractBinderC0588c1.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0591d1Y6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2401Sk
    public final com.google.android.gms.dynamic.a zzu() {
        Parcel parcelH0 = h0(18, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }
}
