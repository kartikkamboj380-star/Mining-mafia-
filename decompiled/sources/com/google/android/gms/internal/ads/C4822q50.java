package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4822q50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f32565c;

    /* synthetic */ C4822q50(String str, String str2, Bundle bundle, byte[] bArr) {
        this.f32563a = str;
        this.f32564b = str2;
        this.f32565c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        bundle.putString("consent_string", this.f32563a);
        bundle.putString("fc_consent", this.f32564b);
        Bundle bundle2 = this.f32565c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
