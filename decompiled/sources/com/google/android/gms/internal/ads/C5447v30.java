package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5447v30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33980b;

    public C5447v30(String str, boolean z9) {
        this.f33979a = str;
        this.f33980b = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.f33979a;
        AF af = (AF) obj;
        if (str != null) {
            Bundle bundleA = AbstractC2176Ob0.a(af.f17275a, "pii");
            bundleA.putString("afai", str);
            bundleA.putBoolean("is_afai_lat", this.f33980b);
        }
    }
}
