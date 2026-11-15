package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0588c1;
import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1890Io extends AbstractC3885ie implements IInterface {
    C1890Io(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final void B2(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(16, parcelJ);
    }

    public final double H1() {
        Parcel parcelH0 = h0(7, J());
        double d10 = parcelH0.readDouble();
        parcelH0.recycle();
        return d10;
    }

    public final void R(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(11, parcelJ);
    }

    public final com.google.android.gms.dynamic.a S3() {
        Parcel parcelH0 = h0(20, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    public final String Z1() {
        Parcel parcelH0 = h0(8, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    public final InterfaceC0591d1 Z2() {
        Parcel parcelH0 = h0(17, J());
        InterfaceC0591d1 interfaceC0591d1Y6 = AbstractBinderC0588c1.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0591d1Y6;
    }

    public final boolean a() {
        Parcel parcelH0 = h0(14, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    public final List b() {
        Parcel parcelH0 = h0(3, J());
        ArrayList arrayListF = AbstractC4135ke.f(parcelH0);
        parcelH0.recycle();
        return arrayListF;
    }

    public final com.google.android.gms.dynamic.a b4() {
        Parcel parcelH0 = h0(21, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    public final InterfaceC2763Zj c() {
        Parcel parcelH0 = h0(5, J());
        InterfaceC2763Zj interfaceC2763ZjY6 = AbstractBinderC2711Yj.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC2763ZjY6;
    }

    public final void e() {
        N0(10, J());
    }

    public final void g1(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(12, parcelJ);
    }

    public final boolean h() {
        Parcel parcelH0 = h0(13, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    public final Bundle i2() {
        Parcel parcelH0 = h0(15, J());
        Bundle bundle = (Bundle) AbstractC4135ke.b(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle;
    }

    public final void t4(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, aVar2);
        AbstractC4135ke.e(parcelJ, aVar3);
        N0(22, parcelJ);
    }

    public final InterfaceC2399Sj x3() {
        Parcel parcelH0 = h0(19, J());
        InterfaceC2399Sj interfaceC2399SjY6 = AbstractBinderC2347Rj.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC2399SjY6;
    }

    public final String zze() {
        Parcel parcelH0 = h0(2, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    public final String zzg() {
        Parcel parcelH0 = h0(4, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    public final String zzi() {
        Parcel parcelH0 = h0(6, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    public final String zzl() {
        Parcel parcelH0 = h0(9, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    public final com.google.android.gms.dynamic.a zzu() {
        Parcel parcelH0 = h0(18, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }
}
