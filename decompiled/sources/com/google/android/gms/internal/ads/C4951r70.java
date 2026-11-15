package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4951r70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32798f;

    public C4951r70(String str, int i10, int i11, int i12, boolean z9, int i13) {
        this.f32793a = str;
        this.f32794b = i10;
        this.f32795c = i11;
        this.f32796d = i12;
        this.f32797e = z9;
        this.f32798f = i13;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        String str = this.f32793a;
        AbstractC2176Ob0.b(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i10 = this.f32794b;
        AbstractC2176Ob0.c(bundle, "cnt", i10, i10 != -2);
        bundle.putInt("gnt", this.f32795c);
        bundle.putInt("pt", this.f32796d);
        Bundle bundleA = AbstractC2176Ob0.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = AbstractC2176Ob0.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f32798f);
        bundleA2.putBoolean("active_network_metered", this.f32797e);
    }
}
