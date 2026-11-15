package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3830iC0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C3830iC0 f29306d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BigInteger f29307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final BigInteger f29308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final BigInteger f29309c;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        f29306d = new C3830iC0(bigInteger, bigInteger, BigInteger.ZERO);
    }

    C3830iC0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f29307a = bigInteger;
        this.f29308b = bigInteger2;
        this.f29309c = bigInteger3;
    }

    final boolean a() {
        return this.f29309c.equals(BigInteger.ZERO);
    }
}
