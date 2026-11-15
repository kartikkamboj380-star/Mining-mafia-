package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3062c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27022e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f27028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f27029l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f27032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f27033p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private V5 f27035r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f27037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f27038u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27023f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27024g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27025h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27026i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27027j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27030m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27031n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27034q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f27036s = Float.MAX_VALUE;

    public final int A() {
        if (this.f27022e) {
            return this.f27021d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final C3062c6 B(int i10) {
        this.f27021d = i10;
        this.f27022e = true;
        return this;
    }

    public final boolean C() {
        return this.f27022e;
    }

    public final C3062c6 D(float f10) {
        this.f27036s = f10;
        return this;
    }

    public final float E() {
        return this.f27036s;
    }

    public final C3062c6 F(C3062c6 c3062c6) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c3062c6 != null) {
            if (!this.f27020c && c3062c6.f27020c) {
                y(c3062c6.f27019b);
            }
            if (this.f27025h == -1) {
                this.f27025h = c3062c6.f27025h;
            }
            if (this.f27026i == -1) {
                this.f27026i = c3062c6.f27026i;
            }
            if (this.f27018a == null && (str = c3062c6.f27018a) != null) {
                this.f27018a = str;
            }
            if (this.f27023f == -1) {
                this.f27023f = c3062c6.f27023f;
            }
            if (this.f27024g == -1) {
                this.f27024g = c3062c6.f27024g;
            }
            if (this.f27031n == -1) {
                this.f27031n = c3062c6.f27031n;
            }
            if (this.f27032o == null && (alignment2 = c3062c6.f27032o) != null) {
                this.f27032o = alignment2;
            }
            if (this.f27033p == null && (alignment = c3062c6.f27033p) != null) {
                this.f27033p = alignment;
            }
            if (this.f27034q == -1) {
                this.f27034q = c3062c6.f27034q;
            }
            if (this.f27027j == -1) {
                this.f27027j = c3062c6.f27027j;
                this.f27028k = c3062c6.f27028k;
            }
            if (this.f27035r == null) {
                this.f27035r = c3062c6.f27035r;
            }
            if (this.f27036s == Float.MAX_VALUE) {
                this.f27036s = c3062c6.f27036s;
            }
            if (this.f27037t == null) {
                this.f27037t = c3062c6.f27037t;
            }
            if (this.f27038u == null) {
                this.f27038u = c3062c6.f27038u;
            }
            if (!this.f27022e && c3062c6.f27022e) {
                B(c3062c6.f27021d);
            }
            if (this.f27030m == -1 && (i10 = c3062c6.f27030m) != -1) {
                this.f27030m = i10;
            }
        }
        return this;
    }

    public final C3062c6 G(String str) {
        this.f27029l = str;
        return this;
    }

    public final String H() {
        return this.f27029l;
    }

    public final C3062c6 I(int i10) {
        this.f27030m = i10;
        return this;
    }

    public final int J() {
        return this.f27030m;
    }

    public final C3062c6 K(int i10) {
        this.f27031n = i10;
        return this;
    }

    public final int L() {
        return this.f27031n;
    }

    public final Layout.Alignment M() {
        return this.f27032o;
    }

    public final C3062c6 N(Layout.Alignment alignment) {
        this.f27032o = alignment;
        return this;
    }

    public final Layout.Alignment a() {
        return this.f27033p;
    }

    public final C3062c6 b(Layout.Alignment alignment) {
        this.f27033p = alignment;
        return this;
    }

    public final boolean c() {
        return this.f27034q == 1;
    }

    public final C3062c6 d(boolean z9) {
        this.f27034q = z9 ? 1 : 0;
        return this;
    }

    public final V5 e() {
        return this.f27035r;
    }

    public final C3062c6 f(V5 v10) {
        this.f27035r = v10;
        return this;
    }

    public final C3062c6 g(float f10) {
        this.f27028k = f10;
        return this;
    }

    public final C3062c6 h(int i10) {
        this.f27027j = i10;
        return this;
    }

    public final int i() {
        return this.f27027j;
    }

    public final float j() {
        return this.f27028k;
    }

    public final C3062c6 k(String str) {
        this.f27037t = str;
        return this;
    }

    public final String l() {
        return this.f27037t;
    }

    public final C3062c6 m(String str) {
        this.f27038u = str;
        return this;
    }

    public final String n() {
        return this.f27038u;
    }

    public final int o() {
        int i10 = this.f27025h;
        if (i10 == -1 && this.f27026i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f27026i == 1 ? 2 : 0);
    }

    public final boolean p() {
        return this.f27023f == 1;
    }

    public final C3062c6 q(boolean z9) {
        this.f27023f = z9 ? 1 : 0;
        return this;
    }

    public final boolean r() {
        return this.f27024g == 1;
    }

    public final C3062c6 s(boolean z9) {
        this.f27024g = z9 ? 1 : 0;
        return this;
    }

    public final C3062c6 t(boolean z9) {
        this.f27025h = z9 ? 1 : 0;
        return this;
    }

    public final C3062c6 u(boolean z9) {
        this.f27026i = z9 ? 1 : 0;
        return this;
    }

    public final String v() {
        return this.f27018a;
    }

    public final C3062c6 w(String str) {
        this.f27018a = str;
        return this;
    }

    public final int x() {
        if (this.f27020c) {
            return this.f27019b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final C3062c6 y(int i10) {
        this.f27019b = i10;
        this.f27020c = true;
        return this;
    }

    public final boolean z() {
        return this.f27020c;
    }
}
