package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5201t60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f33322a;

    public C5201t60(Bundle bundle) {
        this.f33322a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.f33322a;
        AF af = (AF) obj;
        if (bundle != null) {
            af.f17275a.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.f33322a;
        AF af = (AF) obj;
        if (bundle != null) {
            af.f17276b.putAll(bundle);
        }
    }
}
