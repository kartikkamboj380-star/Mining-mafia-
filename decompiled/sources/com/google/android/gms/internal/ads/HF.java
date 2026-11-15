package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class HF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f19253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f19254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5137sb0 f19255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5974zF f19256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5004rY f19257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19258g;

    /* synthetic */ HF(GF gf, byte[] bArr) {
        this.f19252a = gf.i();
        this.f19253b = gf.j();
        this.f19254c = gf.k();
        this.f19255d = gf.l();
        this.f19256e = gf.m();
        this.f19257f = gf.n();
        this.f19258g = gf.o();
    }

    final GF a() {
        GF gf = new GF();
        gf.a(this.f19252a);
        gf.b(this.f19253b);
        gf.c(this.f19254c);
        gf.d(this.f19256e);
        gf.g(this.f19257f);
        return gf;
    }

    final C6019zb0 b() {
        return this.f19253b;
    }

    final C5137sb0 c() {
        return this.f19255d;
    }

    final Bundle d() {
        return this.f19254c;
    }

    final C5974zF e() {
        return this.f19256e;
    }

    final Context f(Context context) {
        return this.f19252a;
    }

    final C5004rY g(String str) {
        C5004rY c5004rY = this.f19257f;
        return c5004rY != null ? c5004rY : new C5004rY(str);
    }

    final int h() {
        return this.f19258g;
    }
}
