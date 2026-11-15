package com.google.android.gms.internal.consent_sdk;

import W5.b;
import W5.e;
import W5.f;

/* JADX INFO: loaded from: classes2.dex */
final class zzbc implements f.b, f.a {
    private final f.b zza;
    private final f.a zzb;

    /* synthetic */ zzbc(f.b bVar, f.a aVar, zzbd zzbdVar) {
        this.zza = bVar;
        this.zzb = aVar;
    }

    @Override // W5.f.a
    public final void onConsentFormLoadFailure(e eVar) {
        this.zzb.onConsentFormLoadFailure(eVar);
    }

    @Override // W5.f.b
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
