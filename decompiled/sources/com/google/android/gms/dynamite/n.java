package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.AbstractC6143a;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends AbstractC6143a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final com.google.android.gms.dynamic.a H1(com.google.android.gms.dynamic.a aVar, String str, boolean z9, long j10) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z9 ? 1 : 0);
        parcelZza.writeLong(j10);
        Parcel parcelZzB = zzB(7, parcelZza);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarJ;
    }

    public final com.google.android.gms.dynamic.a J(com.google.android.gms.dynamic.a aVar, String str, int i10) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        Parcel parcelZzB = zzB(2, parcelZza);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarJ;
    }

    public final com.google.android.gms.dynamic.a N0(com.google.android.gms.dynamic.a aVar, String str, int i10) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        Parcel parcelZzB = zzB(4, parcelZza);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarJ;
    }

    public final com.google.android.gms.dynamic.a Z1(com.google.android.gms.dynamic.a aVar, String str, int i10, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.common.o.e(parcelZza, aVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarJ;
    }

    public final int h0(com.google.android.gms.dynamic.a aVar, String str, boolean z9) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z9 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int t1(com.google.android.gms.dynamic.a aVar, String str, boolean z9) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z9 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int zzi() {
        Parcel parcelZzB = zzB(6, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }
}
