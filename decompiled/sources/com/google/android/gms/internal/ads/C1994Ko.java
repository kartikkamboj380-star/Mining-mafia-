package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0588c1;
import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1994Ko extends AbstractC3885ie implements InterfaceC2097Mo {
    C1994Ko(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void B4(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(22, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final com.google.android.gms.dynamic.a a() {
        Parcel parcelH0 = h0(14, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final List b() {
        Parcel parcelH0 = h0(3, J());
        ArrayList arrayListF = AbstractC4135ke.f(parcelH0);
        parcelH0.recycle();
        return arrayListF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final InterfaceC2763Zj c() {
        Parcel parcelH0 = h0(5, J());
        InterfaceC2763Zj interfaceC2763ZjY6 = AbstractBinderC2711Yj.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC2763ZjY6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String d() {
        Parcel parcelH0 = h0(7, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String e() {
        Parcel parcelH0 = h0(10, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final Bundle f() {
        Parcel parcelH0 = h0(16, J());
        Bundle bundle = (Bundle) AbstractC4135ke.b(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final boolean g() {
        Parcel parcelH0 = h0(17, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final com.google.android.gms.dynamic.a h() {
        Parcel parcelH0 = h0(13, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void i1(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, aVar2);
        AbstractC4135ke.e(parcelJ, aVar3);
        N0(21, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final com.google.android.gms.dynamic.a l() {
        Parcel parcelH0 = h0(15, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final float m() {
        Parcel parcelH0 = h0(23, J());
        float f10 = parcelH0.readFloat();
        parcelH0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void q() {
        N0(19, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final float s() {
        Parcel parcelH0 = h0(24, J());
        float f10 = parcelH0.readFloat();
        parcelH0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final float y() {
        Parcel parcelH0 = h0(25, J());
        float f10 = parcelH0.readFloat();
        parcelH0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void y0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(20, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void z() {
        N0(26, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zze() {
        Parcel parcelH0 = h0(2, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zzg() {
        Parcel parcelH0 = h0(4, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zzi() {
        Parcel parcelH0 = h0(6, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final double zzk() {
        Parcel parcelH0 = h0(8, J());
        double d10 = parcelH0.readDouble();
        parcelH0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zzl() {
        Parcel parcelH0 = h0(9, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final InterfaceC0591d1 zzn() {
        Parcel parcelH0 = h0(11, J());
        InterfaceC0591d1 interfaceC0591d1Y6 = AbstractBinderC0588c1.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0591d1Y6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final InterfaceC2399Sj zzo() {
        Parcel parcelH0 = h0(12, J());
        InterfaceC2399Sj interfaceC2399SjY6 = AbstractBinderC2347Rj.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC2399SjY6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final boolean zzu() {
        Parcel parcelH0 = h0(18, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }
}
