package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class V50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f24201a;

    public V50(Bundle bundle) {
        this.f24201a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        Bundle bundleA = AbstractC2176Ob0.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.f24201a);
        bundle.putBundle("device", bundleA);
    }
}
