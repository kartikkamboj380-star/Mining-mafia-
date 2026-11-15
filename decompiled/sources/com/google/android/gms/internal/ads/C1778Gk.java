package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1778Gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2495Uf f19125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f19127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f19128e;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C1778Gk(C2495Uf c2495Uf, boolean z9, int[] iArr, boolean[] zArr) {
        int i10 = c2495Uf.f24070a;
        this.f19124a = i10;
        AbstractC2418Ss0.a(i10 == iArr.length && i10 == zArr.length);
        this.f19125b = c2495Uf;
        this.f19126c = z9 && i10 > 1;
        this.f19127d = (int[]) iArr.clone();
        this.f19128e = (boolean[]) zArr.clone();
    }

    public final JY0 a(int i10) {
        return this.f19125b.a(i10);
    }

    public final boolean b() {
        for (boolean z9 : this.f19128e) {
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(int i10) {
        return this.f19128e[i10];
    }

    public final int d() {
        return this.f19125b.f24072c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1778Gk.class == obj.getClass()) {
            C1778Gk c1778Gk = (C1778Gk) obj;
            if (this.f19126c == c1778Gk.f19126c && this.f19125b.equals(c1778Gk.f19125b) && Arrays.equals(this.f19127d, c1778Gk.f19127d) && Arrays.equals(this.f19128e, c1778Gk.f19128e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f19125b.hashCode() * 31) + (this.f19126c ? 1 : 0)) * 31) + Arrays.hashCode(this.f19127d)) * 31) + Arrays.hashCode(this.f19128e);
    }
}
