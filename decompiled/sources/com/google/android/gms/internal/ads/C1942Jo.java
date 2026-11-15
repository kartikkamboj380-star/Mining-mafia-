package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0588c1;
import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1942Jo extends AbstractC3885ie implements IInterface {
    C1942Jo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final InterfaceC2399Sj B2() {
        Parcel parcelH0 = h0(19, J());
        InterfaceC2399Sj interfaceC2399SjY6 = AbstractBinderC2347Rj.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC2399SjY6;
    }

    public final void H1(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(10, parcelJ);
    }

    public final void X1(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(14, parcelJ);
    }

    public final Bundle Z1() {
        Parcel parcelH0 = h0(13, J());
        Bundle bundle = (Bundle) AbstractC4135ke.b(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle;
    }

    public final void Z2(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, aVar2);
        AbstractC4135ke.e(parcelJ, aVar3);
        N0(22, parcelJ);
    }

    public final List b() {
        Parcel parcelH0 = h0(3, J());
        ArrayList arrayListF = AbstractC4135ke.f(parcelH0);
        parcelH0.recycle();
        return arrayListF;
    }

    public final InterfaceC2763Zj c() {
        Parcel parcelH0 = h0(5, J());
        InterfaceC2763Zj interfaceC2763ZjY6 = AbstractBinderC2711Yj.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC2763ZjY6;
    }

    public final String d() {
        Parcel parcelH0 = h0(7, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    public final InterfaceC0591d1 i2() {
        Parcel parcelH0 = h0(16, J());
        InterfaceC0591d1 interfaceC0591d1Y6 = AbstractBinderC0588c1.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0591d1Y6;
    }

    public final com.google.android.gms.dynamic.a l() {
        Parcel parcelH0 = h0(15, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }

    public final void o6(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(9, parcelJ);
    }

    public final com.google.android.gms.dynamic.a q() {
        Parcel parcelH0 = h0(21, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
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

    public final void zzk() {
        N0(8, J());
    }

    public final boolean zzn() {
        Parcel parcelH0 = h0(11, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    public final boolean zzo() {
        Parcel parcelH0 = h0(12, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    public final com.google.android.gms.dynamic.a zzu() {
        Parcel parcelH0 = h0(20, J());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return aVarJ;
    }
}
