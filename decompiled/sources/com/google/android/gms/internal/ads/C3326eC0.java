package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3326eC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C3201dC0 f27714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f27715b;

    C3326eC0(C3201dC0 c3201dC0, long[] jArr) {
        this.f27714a = c3201dC0;
        this.f27715b = jArr;
    }

    static /* synthetic */ C3326eC0 a(C3326eC0 c3326eC0, C3075cC0 c3075cC0) {
        b(c3326eC0, c3075cC0);
        return c3326eC0;
    }

    private static C3326eC0 b(C3326eC0 c3326eC0, C3075cC0 c3075cC0) {
        C3201dC0 c3201dC0 = c3075cC0.f27063a;
        C3201dC0 c3201dC1 = c3326eC0.f27714a;
        long[] jArr = c3201dC1.f27370a;
        long[] jArr2 = c3201dC0.f27370a;
        long[] jArr3 = c3075cC0.f27064b;
        AbstractC4332mC0.e(jArr, jArr2, jArr3);
        long[] jArr4 = c3201dC1.f27371b;
        long[] jArr5 = c3201dC0.f27371b;
        long[] jArr6 = c3201dC0.f27372c;
        AbstractC4332mC0.e(jArr4, jArr5, jArr6);
        AbstractC4332mC0.e(c3201dC1.f27372c, jArr6, jArr3);
        AbstractC4332mC0.e(c3326eC0.f27715b, jArr2, jArr5);
        return c3326eC0;
    }

    C3326eC0() {
        this(new C3201dC0(), new long[10]);
    }

    C3326eC0(C3075cC0 c3075cC0) {
        this();
        b(this, c3075cC0);
    }
}
