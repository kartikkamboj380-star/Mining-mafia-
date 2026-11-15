package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class T60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23441h;

    T60(boolean z9, boolean z10, String str, boolean z11, int i10, int i11, int i12, String str2) {
        this.f23434a = z9;
        this.f23435b = z10;
        this.f23436c = str;
        this.f23437d = z11;
        this.f23438e = i10;
        this.f23439f = i11;
        this.f23440g = i12;
        this.f23441h = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        bundle.putString("js", this.f23436c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) H4.B.c().d(AbstractC3892ii.f29534D4));
        bundle.putInt("target_api", this.f23438e);
        bundle.putInt("dv", this.f23439f);
        bundle.putInt("lv", this.f23440g);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29686S6)).booleanValue()) {
            String str = this.f23441h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleA = AbstractC2176Ob0.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) AbstractC4145kj.f30866g.e()).booleanValue());
        bundleA.putBoolean("instant_app", this.f23434a);
        bundleA.putBoolean("lite", this.f23435b);
        bundleA.putBoolean("is_privileged_process", this.f23437d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = AbstractC2176Ob0.a(bundleA, "build_meta");
        bundleA2.putString("cl", "839961582");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AF) obj).f17276b;
        bundle.putString("js", this.f23436c);
        bundle.putInt("target_api", this.f23438e);
    }
}
