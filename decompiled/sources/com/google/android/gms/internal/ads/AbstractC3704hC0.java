package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3704hC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long[] f28876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long[] f28877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long[] f28878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C2824aC0[][] f28879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final C2824aC0[] f28880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigInteger f28881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f28882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigInteger f28883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BigInteger f28884i;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f28881f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f28882g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f28883h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f28884i = bigIntegerModPow;
        C3578gC0 c3578gC0 = new C3578gC0(null);
        c3578gC0.d(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerC = c3578gC0.c();
        BigInteger bigIntegerMultiply = bigIntegerC.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerC.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        c3578gC0.b(bigIntegerModPow2);
        f28876a = AbstractC4332mC0.g(b(bigIntegerMod));
        f28877b = AbstractC4332mC0.g(b(bigIntegerMod2));
        f28878c = AbstractC4332mC0.g(b(bigIntegerModPow));
        f28879d = (C2824aC0[][]) Array.newInstance((Class<?>) C2824aC0.class, 32, 8);
        C3578gC0 c3578gC0A = c3578gC0;
        for (int i10 = 0; i10 < 32; i10++) {
            C3578gC0 c3578gC0A2 = c3578gC0A;
            for (int i11 = 0; i11 < 8; i11++) {
                f28879d[i10][i11] = c(c3578gC0A2);
                c3578gC0A2 = a(c3578gC0A2, c3578gC0A);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                c3578gC0A = a(c3578gC0A, c3578gC0A);
            }
        }
        C3578gC0 c3578gC0A3 = a(c3578gC0, c3578gC0);
        f28880e = new C2824aC0[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f28880e[i13] = c(c3578gC0);
            c3578gC0 = a(c3578gC0, c3578gC0A3);
        }
    }

    private static C3578gC0 a(C3578gC0 c3578gC0, C3578gC0 c3578gC1) {
        C3578gC0 c3578gC2 = new C3578gC0(null);
        BigInteger bigIntegerMultiply = f28882g.multiply(c3578gC0.a().multiply(c3578gC1.a()).multiply(c3578gC0.c()).multiply(c3578gC1.c()));
        BigInteger bigInteger = f28881f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = c3578gC0.a().multiply(c3578gC1.c()).add(c3578gC1.a().multiply(c3578gC0.c()));
        BigInteger bigInteger2 = BigInteger.ONE;
        c3578gC2.b(bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        c3578gC2.d(c3578gC0.c().multiply(c3578gC1.c()).add(c3578gC0.a().multiply(c3578gC1.a())).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return c3578gC2;
    }

    private static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }

    private static C2824aC0 c(C3578gC0 c3578gC0) {
        BigInteger bigIntegerAdd = c3578gC0.c().add(c3578gC0.a());
        BigInteger bigInteger = f28881f;
        return new C2824aC0(AbstractC4332mC0.g(b(bigIntegerAdd.mod(bigInteger))), AbstractC4332mC0.g(b(c3578gC0.c().subtract(c3578gC0.a()).mod(bigInteger))), AbstractC4332mC0.g(b(f28883h.multiply(c3578gC0.a()).multiply(c3578gC0.c()).mod(bigInteger))));
    }
}
