package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p136n5.C7065a;
import p136n5.InterfaceC7068d;
import p136n5.InterfaceC7071g;
import p136n5.InterfaceC7074j;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6522e2 extends com.google.android.gms.internal.measurement.N implements InterfaceC7068d {
    C6522e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p136n5.InterfaceC7068d
    public final void G2(v6 v6Var, B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, v6Var);
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(2, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final List J1(String str, String str2, String str3) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(null);
        parcelH0.writeString(str2);
        parcelH0.writeString(str3);
        Parcel parcelJ = J(17, parcelH0);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C6551i.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p136n5.InterfaceC7068d
    public final void K3(B6 b10, p136n5.J j10, InterfaceC7074j interfaceC7074j) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        com.google.android.gms.internal.measurement.P.c(parcelH0, j10);
        com.google.android.gms.internal.measurement.P.d(parcelH0, interfaceC7074j);
        N0(29, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void N5(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(4, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final List Q0(String str, String str2, String str3, boolean z9) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(null);
        parcelH0.writeString(str2);
        parcelH0.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.P.f36442b;
        parcelH0.writeInt(z9 ? 1 : 0);
        Parcel parcelJ = J(15, parcelH0);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(v6.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p136n5.InterfaceC7068d
    public final void V5(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(27, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void W0(C6551i c6551i, B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, c6551i);
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(12, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void Y1(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(25, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final List Y5(String str, String str2, boolean z9, B6 b10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.P.f36442b;
        parcelH0.writeInt(z9 ? 1 : 0);
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        Parcel parcelJ = J(14, parcelH0);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(v6.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p136n5.InterfaceC7068d
    public final void h1(B6 b10, Bundle bundle, InterfaceC7071g interfaceC7071g) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        com.google.android.gms.internal.measurement.P.c(parcelH0, bundle);
        com.google.android.gms.internal.measurement.P.d(parcelH0, interfaceC7071g);
        N0(31, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final List h6(String str, String str2, B6 b10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        Parcel parcelJ = J(16, parcelH0);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C6551i.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p136n5.InterfaceC7068d
    public final void i5(B6 b10, C6535g c6535g) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        com.google.android.gms.internal.measurement.P.c(parcelH0, c6535g);
        N0(30, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void l2(G g10, B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, g10);
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(1, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void m2(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(6, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void o4(long j10, String str, String str2, String str3) {
        Parcel parcelH0 = h0();
        parcelH0.writeLong(j10);
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        parcelH0.writeString(str3);
        N0(10, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void p2(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(26, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void p4(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(18, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final void r6(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(20, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final C7065a s5(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        Parcel parcelJ = J(21, parcelH0);
        C7065a c7065a = (C7065a) com.google.android.gms.internal.measurement.P.b(parcelJ, C7065a.CREATOR);
        parcelJ.recycle();
        return c7065a;
    }

    @Override // p136n5.InterfaceC7068d
    public final String t3(B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        Parcel parcelJ = J(11, parcelH0);
        String string = parcelJ.readString();
        parcelJ.recycle();
        return string;
    }

    @Override // p136n5.InterfaceC7068d
    public final void t5(Bundle bundle, B6 b10) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, bundle);
        com.google.android.gms.internal.measurement.P.c(parcelH0, b10);
        N0(19, parcelH0);
    }

    @Override // p136n5.InterfaceC7068d
    public final byte[] w2(G g10, String str) {
        Parcel parcelH0 = h0();
        com.google.android.gms.internal.measurement.P.c(parcelH0, g10);
        parcelH0.writeString(str);
        Parcel parcelJ = J(9, parcelH0);
        byte[] bArrCreateByteArray = parcelJ.createByteArray();
        parcelJ.recycle();
        return bArrCreateByteArray;
    }
}
