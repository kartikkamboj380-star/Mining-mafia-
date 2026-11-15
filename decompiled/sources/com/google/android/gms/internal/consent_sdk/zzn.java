package com.google.android.gms.internal.consent_sdk;

import W5.a;
import W5.d;
import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    final zzcl zzc(Activity activity, d dVar) {
        a aVarA = dVar.a();
        if (aVarA == null) {
            aVarA = new a.C0109a(this.zza).b();
        }
        return zzp.zza(new zzp(this, activity, aVarA, dVar, null));
    }
}
