package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class GF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C6019zb0 f19011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f19012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5137sb0 f19013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C5974zF f19014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C5004rY f19015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19016g = 0;

    public final GF a(Context context) {
        this.f19010a = context;
        return this;
    }

    public final GF b(C6019zb0 c6019zb0) {
        this.f19011b = c6019zb0;
        return this;
    }

    public final GF c(Bundle bundle) {
        this.f19012c = bundle;
        return this;
    }

    public final GF d(C5974zF c5974zF) {
        this.f19014e = c5974zF;
        return this;
    }

    public final HF e() {
        return new HF(this, null);
    }

    public final GF f(C5137sb0 c5137sb0) {
        this.f19013d = c5137sb0;
        return this;
    }

    public final GF g(C5004rY c5004rY) {
        this.f19015f = c5004rY;
        return this;
    }

    public final GF h(int i10) {
        this.f19016g = i10;
        return this;
    }

    final /* synthetic */ Context i() {
        return this.f19010a;
    }

    final /* synthetic */ C6019zb0 j() {
        return this.f19011b;
    }

    final /* synthetic */ Bundle k() {
        return this.f19012c;
    }

    final /* synthetic */ C5137sb0 l() {
        return this.f19013d;
    }

    final /* synthetic */ C5974zF m() {
        return this.f19014e;
    }

    final /* synthetic */ C5004rY n() {
        return this.f19015f;
    }

    final /* synthetic */ int o() {
        return this.f19016g;
    }
}
