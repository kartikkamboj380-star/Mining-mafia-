package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzp;
import com.google.android.gms.internal.common.AbstractC6143a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab extends AbstractC6143a implements zzad {
    zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zze(com.google.android.gms.common.zzt zztVar, com.google.android.gms.dynamic.a aVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.c(parcelZza, zztVar);
        com.google.android.gms.internal.common.o.e(parcelZza, aVar);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean zA = com.google.android.gms.internal.common.o.a(parcelZzB);
        parcelZzB.recycle();
        return zA;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final com.google.android.gms.common.zzr zzf(zzp zzpVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.c(parcelZza, zzpVar);
        Parcel parcelZzB = zzB(6, parcelZza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.o.b(parcelZzB, com.google.android.gms.common.zzr.CREATOR);
        parcelZzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzg() {
        Parcel parcelZzB = zzB(7, zza());
        boolean zA = com.google.android.gms.internal.common.o.a(parcelZzB);
        parcelZzB.recycle();
        return zA;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final com.google.android.gms.common.zzr zzh(zzp zzpVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.o.c(parcelZza, zzpVar);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.o.b(parcelZzB, com.google.android.gms.common.zzr.CREATOR);
        parcelZzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzi() {
        Parcel parcelZzB = zzB(9, zza());
        boolean zA = com.google.android.gms.internal.common.o.a(parcelZzB);
        parcelZzB.recycle();
        return zA;
    }
}
