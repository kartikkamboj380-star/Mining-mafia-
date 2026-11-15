package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3201dC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long[] f27370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f27371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long[] f27372c;

    C3201dC0(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f27370a = jArr;
        this.f27371b = jArr2;
        this.f27372c = jArr3;
    }

    static C3201dC0 a(C3201dC0 c3201dC0, C3075cC0 c3075cC0) {
        C3201dC0 c3201dC1 = c3075cC0.f27063a;
        long[] jArr = c3201dC0.f27370a;
        long[] jArr2 = c3201dC1.f27370a;
        long[] jArr3 = c3075cC0.f27064b;
        AbstractC4332mC0.e(jArr, jArr2, jArr3);
        long[] jArr4 = c3201dC0.f27371b;
        long[] jArr5 = c3201dC1.f27371b;
        long[] jArr6 = c3201dC1.f27372c;
        AbstractC4332mC0.e(jArr4, jArr5, jArr6);
        AbstractC4332mC0.e(c3201dC0.f27372c, jArr6, jArr3);
        return c3201dC0;
    }

    final byte[] b() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i10 = AbstractC4332mC0.f31466e;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.f27372c;
        AbstractC4332mC0.f(jArr4, jArr14);
        AbstractC4332mC0.f(jArr13, jArr4);
        AbstractC4332mC0.f(jArr12, jArr13);
        AbstractC4332mC0.e(jArr5, jArr12, jArr14);
        AbstractC4332mC0.e(jArr6, jArr5, jArr4);
        AbstractC4332mC0.f(jArr12, jArr6);
        AbstractC4332mC0.e(jArr7, jArr12, jArr5);
        AbstractC4332mC0.f(jArr12, jArr7);
        AbstractC4332mC0.f(jArr13, jArr12);
        AbstractC4332mC0.f(jArr12, jArr13);
        AbstractC4332mC0.f(jArr13, jArr12);
        AbstractC4332mC0.f(jArr12, jArr13);
        AbstractC4332mC0.e(jArr8, jArr12, jArr7);
        AbstractC4332mC0.f(jArr12, jArr8);
        AbstractC4332mC0.f(jArr13, jArr12);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            AbstractC4332mC0.f(jArr12, jArr13);
            AbstractC4332mC0.f(jArr13, jArr12);
        }
        AbstractC4332mC0.e(jArr9, jArr13, jArr8);
        AbstractC4332mC0.f(jArr12, jArr9);
        AbstractC4332mC0.f(jArr13, jArr12);
        for (int i12 = 2; i12 < 20; i12 += 2) {
            AbstractC4332mC0.f(jArr12, jArr13);
            AbstractC4332mC0.f(jArr13, jArr12);
        }
        AbstractC4332mC0.e(jArr12, jArr13, jArr9);
        AbstractC4332mC0.f(jArr13, jArr12);
        AbstractC4332mC0.f(jArr12, jArr13);
        for (int i13 = 2; i13 < 10; i13 += 2) {
            AbstractC4332mC0.f(jArr13, jArr12);
            AbstractC4332mC0.f(jArr12, jArr13);
        }
        AbstractC4332mC0.e(jArr10, jArr12, jArr8);
        AbstractC4332mC0.f(jArr12, jArr10);
        AbstractC4332mC0.f(jArr13, jArr12);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            AbstractC4332mC0.f(jArr12, jArr13);
            AbstractC4332mC0.f(jArr13, jArr12);
        }
        AbstractC4332mC0.e(jArr11, jArr13, jArr10);
        AbstractC4332mC0.f(jArr13, jArr11);
        AbstractC4332mC0.f(jArr12, jArr13);
        for (int i15 = 2; i15 < 100; i15 += 2) {
            AbstractC4332mC0.f(jArr13, jArr12);
            AbstractC4332mC0.f(jArr12, jArr13);
        }
        AbstractC4332mC0.e(jArr13, jArr12, jArr11);
        AbstractC4332mC0.f(jArr12, jArr13);
        AbstractC4332mC0.f(jArr13, jArr12);
        for (int i16 = 2; i16 < 50; i16 += 2) {
            AbstractC4332mC0.f(jArr12, jArr13);
            AbstractC4332mC0.f(jArr13, jArr12);
        }
        AbstractC4332mC0.e(jArr12, jArr13, jArr10);
        AbstractC4332mC0.f(jArr13, jArr12);
        AbstractC4332mC0.f(jArr12, jArr13);
        AbstractC4332mC0.f(jArr13, jArr12);
        AbstractC4332mC0.f(jArr12, jArr13);
        AbstractC4332mC0.f(jArr13, jArr12);
        AbstractC4332mC0.e(jArr, jArr13, jArr6);
        AbstractC4332mC0.e(jArr2, this.f27370a, jArr);
        AbstractC4332mC0.e(jArr3, this.f27371b, jArr);
        byte[] bArrH = AbstractC4332mC0.h(jArr3);
        bArrH[31] = (byte) ((AbstractC3452fC0.f(jArr2) << 7) ^ bArrH[31]);
        return bArrH;
    }

    C3201dC0() {
        this(new long[10], new long[10], new long[10]);
    }

    C3201dC0(C3075cC0 c3075cC0) {
        this();
        a(this, c3075cC0);
    }

    C3201dC0(C3201dC0 c3201dC0) {
        this.f27370a = Arrays.copyOf(c3201dC0.f27370a, 10);
        this.f27371b = Arrays.copyOf(c3201dC0.f27371b, 10);
        this.f27372c = Arrays.copyOf(c3201dC0.f27372c, 10);
    }
}
