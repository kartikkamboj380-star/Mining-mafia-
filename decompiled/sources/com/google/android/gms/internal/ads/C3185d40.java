package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3185d40 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f27324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27325b;

    public C3185d40(double d10, boolean z9) {
        this.f27324a = d10;
        this.f27325b = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        Bundle bundleA = AbstractC2176Ob0.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = AbstractC2176Ob0.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f27325b);
        bundleA2.putDouble("battery_level", this.f27324a);
    }
}
