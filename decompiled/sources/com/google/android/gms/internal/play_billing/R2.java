package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class R2 extends W2 implements T2 {
    R2(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void I2(int i10, String str, Bundle bundle, InterfaceC6476x0 interfaceC6476x0) {
        Parcel parcelJ = J();
        parcelJ.writeInt(21);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(interfaceC6476x0);
        t1(1501, parcelJ);
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle L2(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        parcelJ.writeString(null);
        Y2.c(parcelJ, bundle);
        Parcel parcelH0 = h0(8, parcelJ);
        Bundle bundle2 = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle P4(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelJ = J();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        parcelJ.writeString(null);
        Parcel parcelH0 = h0(3, parcelJ);
        Bundle bundle = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle Q2(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Y2.c(parcelJ, bundle);
        Parcel parcelH0 = h0(2, parcelJ);
        Bundle bundle2 = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle U1(int i10, String str, String str2, String str3) {
        Parcel parcelJ = J();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        Parcel parcelH0 = h0(4, parcelJ);
        Bundle bundle = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void U5(int i10, String str, Bundle bundle, V2 v10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(12);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(v10);
        N0(1201, parcelJ);
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle X3(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Y2.c(parcelJ, bundle);
        Y2.c(parcelJ, bundle2);
        Parcel parcelH0 = h0(901, parcelJ);
        Bundle bundle3 = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final int X5(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Y2.c(parcelJ, bundle);
        Parcel parcelH0 = h0(10, parcelJ);
        int i11 = parcelH0.readInt();
        parcelH0.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final int a1(int i10, String str, String str2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Parcel parcelH0 = h0(5, parcelJ);
        int i11 = parcelH0.readInt();
        parcelH0.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle d4(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(9);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Y2.c(parcelJ, bundle);
        Parcel parcelH0 = h0(12, parcelJ);
        Bundle bundle2 = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final int j4(int i10, String str, String str2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Parcel parcelH0 = h0(1, parcelJ);
        int i11 = parcelH0.readInt();
        parcelH0.recycle();
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void k2(int i10, String str, Bundle bundle, M2 m10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(22);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(m10);
        t1(1901, parcelJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void m4(int i10, String str, Bundle bundle, InterfaceC6462t2 interfaceC6462t2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(21);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(interfaceC6462t2);
        t1(1601, parcelJ);
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle n4(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(6);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        Y2.c(parcelJ, bundle);
        Parcel parcelH0 = h0(9, parcelJ);
        Bundle bundle2 = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void o3(int i10, String str, Bundle bundle, O2 o10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(21);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(o10);
        t1(1401, parcelJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void p5(int i10, String str, Bundle bundle, K2 k10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(18);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(k10);
        N0(1301, parcelJ);
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle q6(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(9);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Y2.c(parcelJ, bundle);
        Parcel parcelH0 = h0(902, parcelJ);
        Bundle bundle2 = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.T2
    public final Bundle r3(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        Y2.c(parcelJ, bundle);
        Parcel parcelH0 = h0(11, parcelJ);
        Bundle bundle2 = (Bundle) Y2.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void v2(int i10, String str, Bundle bundle, Q2 q10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(22);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(q10);
        t1(1701, parcelJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T2
    public final void w4(int i10, String str, Bundle bundle, InterfaceC6457s1 interfaceC6457s1) {
        Parcel parcelJ = J();
        parcelJ.writeInt(22);
        parcelJ.writeString(str);
        Y2.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(interfaceC6457s1);
        t1(1801, parcelJ);
    }
}
