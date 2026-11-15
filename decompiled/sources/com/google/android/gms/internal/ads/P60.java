package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class P60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f22046e;

    public P60(String str, String str2, String str3, String str4, Long l10) {
        this.f22042a = str;
        this.f22043b = str2;
        this.f22044c = str3;
        this.f22045d = str4;
        this.f22046e = l10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        AbstractC2176Ob0.e(bundle, "gmp_app_id", this.f22042a);
        AbstractC2176Ob0.e(bundle, "fbs_aiid", this.f22043b);
        AbstractC2176Ob0.e(bundle, "fbs_aeid", this.f22044c);
        AbstractC2176Ob0.e(bundle, "apm_id_origin", this.f22045d);
        Long l10 = this.f22046e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AbstractC2176Ob0.e(((AF) obj).f17276b, "fbs_aeid", this.f22044c);
    }
}
