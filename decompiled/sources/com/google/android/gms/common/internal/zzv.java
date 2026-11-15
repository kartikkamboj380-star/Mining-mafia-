package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.AbstractC6143a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv extends AbstractC6143a implements zzx {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final com.google.android.gms.dynamic.a zzd() {
        Parcel parcelZzB = zzB(1, zza());
        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarJ;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        Parcel parcelZzB = zzB(2, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }
}
