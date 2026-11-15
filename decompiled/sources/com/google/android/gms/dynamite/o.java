package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.AbstractC6143a;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC6143a implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.a J(com.google.android.gms.dynamic.a aVar, String str, int i10, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.common.o.e(parcelZza, aVar2);
        Parcel parcelZzB = zzB(2, parcelZza);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarJ;
    }

    public final com.google.android.gms.dynamic.a h0(com.google.android.gms.dynamic.a aVar, String str, int i10, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.common.o.e(parcelZza, aVar2);
        Parcel parcelZzB = zzB(3, parcelZza);
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarJ;
    }
}
