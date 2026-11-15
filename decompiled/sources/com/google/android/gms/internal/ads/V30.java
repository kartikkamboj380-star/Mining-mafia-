package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class V30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f24183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f24184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f24185k;

    public V30(int i10, boolean z9, boolean z10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z11, boolean z12) {
        this.f24175a = i10;
        this.f24176b = z9;
        this.f24177c = z10;
        this.f24178d = i11;
        this.f24179e = i12;
        this.f24180f = i13;
        this.f24181g = i14;
        this.f24182h = i15;
        this.f24183i = f10;
        this.f24184j = z11;
        this.f24185k = z12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.wc)).booleanValue()) {
            bundle.putInt("muv_min", this.f24179e);
            bundle.putInt("muv_max", this.f24180f);
        }
        bundle.putFloat("android_app_volume", this.f24183i);
        bundle.putBoolean("android_app_muted", this.f24184j);
        if (this.f24185k) {
            return;
        }
        bundle.putInt("am", this.f24175a);
        bundle.putBoolean("ma", this.f24176b);
        bundle.putBoolean("sp", this.f24177c);
        bundle.putInt("muv", this.f24178d);
        bundle.putInt("rm", this.f24181g);
        bundle.putInt("riv", this.f24182h);
    }
}
