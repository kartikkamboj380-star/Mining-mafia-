package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.AbstractC6143a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzy extends AbstractC6143a implements IGmsCallbacks {
    zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i10, IBinder iBinder, Bundle bundle) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.o.c(parcelZza, bundle);
        zzD(1, parcelZza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i10, Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i10, IBinder iBinder, zzj zzjVar) {
        throw null;
    }
}
