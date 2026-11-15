package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class Y60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f25541a;

    public Y60(Bundle bundle) {
        this.f25541a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.f25541a;
        AF af = (AF) obj;
        if (bundle.isEmpty()) {
            return;
        }
        af.f17275a.putBundle("shared_pref", bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.f25541a;
        AF af = (AF) obj;
        if (bundle.isEmpty()) {
            return;
        }
        af.f17276b.putBundle("shared_pref", bundle);
    }
}
