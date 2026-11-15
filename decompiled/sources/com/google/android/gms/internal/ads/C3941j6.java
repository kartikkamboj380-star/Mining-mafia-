package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3941j6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30305f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30307h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f30313n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30300a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30301b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f30302c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30303d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30304e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30306g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30308i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30309j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f30310k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f30311l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30312m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30314o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f30315p = false;

    private static int a(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public final boolean A() {
        return this.f30315p;
    }

    public final void b(String str) {
        this.f30300a = str;
    }

    public final void c(String str) {
        this.f30301b = str;
    }

    public final void d(String[] strArr) {
        this.f30302c = new HashSet(Arrays.asList(strArr));
    }

    public final void e(String str) {
        this.f30303d = str;
    }

    public final int f(String str, String str2, Set set, String str3) {
        if (this.f30300a.isEmpty() && this.f30301b.isEmpty() && this.f30302c.isEmpty() && this.f30303d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f30300a, str, 1073741824), this.f30301b, str2, 2), this.f30303d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f30302c)) {
            return 0;
        }
        return iA + (this.f30302c.size() * 4);
    }

    public final int g() {
        int i10 = this.f30310k;
        if (i10 == -1 && this.f30311l == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f30311l == 1 ? 2 : 0);
    }

    public final boolean h() {
        return this.f30309j == 1;
    }

    public final C3941j6 i(boolean z9) {
        this.f30309j = 1;
        return this;
    }

    public final C3941j6 j(boolean z9) {
        this.f30310k = 1;
        return this;
    }

    public final C3941j6 k(boolean z9) {
        this.f30311l = 1;
        return this;
    }

    public final String l() {
        return this.f30304e;
    }

    public final C3941j6 m(String str) {
        this.f30304e = AbstractC1483As0.a(str);
        return this;
    }

    public final int n() {
        if (this.f30306g) {
            return this.f30305f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final C3941j6 o(int i10) {
        this.f30305f = i10;
        this.f30306g = true;
        return this;
    }

    public final boolean p() {
        return this.f30306g;
    }

    public final int q() {
        if (this.f30308i) {
            return this.f30307h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final C3941j6 r(int i10) {
        this.f30307h = i10;
        this.f30308i = true;
        return this;
    }

    public final boolean s() {
        return this.f30308i;
    }

    public final C3941j6 t(float f10) {
        this.f30313n = f10;
        return this;
    }

    public final C3941j6 u(int i10) {
        this.f30312m = i10;
        return this;
    }

    public final int v() {
        return this.f30312m;
    }

    public final float w() {
        return this.f30313n;
    }

    public final C3941j6 x(int i10) {
        this.f30314o = i10;
        return this;
    }

    public final int y() {
        return this.f30314o;
    }

    public final C3941j6 z(boolean z9) {
        this.f30315p = z9;
        return this;
    }
}
