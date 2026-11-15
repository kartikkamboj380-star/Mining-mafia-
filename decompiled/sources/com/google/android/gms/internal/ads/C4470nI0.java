package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4470nI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4848qI0 f31768a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4222lK0 f31769b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4222lK0 f31770c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4222lK0 f31771d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4222lK0 f31772e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4222lK0 f31773f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4222lK0 f31774g = null;

    /* synthetic */ C4470nI0(byte[] bArr) {
    }

    public final C4470nI0 a(C4848qI0 c4848qI0) {
        this.f31768a = c4848qI0;
        return this;
    }

    public final C4470nI0 b(C4222lK0 c4222lK0, C4222lK0 c4222lK1) {
        this.f31770c = c4222lK0;
        this.f31771d = c4222lK1;
        return this;
    }

    public final C4470nI0 c(C4222lK0 c4222lK0) {
        this.f31769b = c4222lK0;
        return this;
    }

    public final C4470nI0 d(C4222lK0 c4222lK0, C4222lK0 c4222lK1) {
        this.f31772e = c4222lK0;
        this.f31773f = c4222lK1;
        return this;
    }

    public final C4470nI0 e(C4222lK0 c4222lK0) {
        this.f31774g = c4222lK0;
        return this;
    }

    public final C4596oI0 f() throws GeneralSecurityException {
        C4848qI0 c4848qI0 = this.f31768a;
        if (c4848qI0 == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.f31770c == null || this.f31771d == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.f31769b == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.f31772e == null || this.f31773f == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.f31774g == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerD = c4848qI0.f().d();
        BigInteger bigIntegerE = this.f31768a.e();
        BigInteger bigIntegerB = this.f31770c.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB2 = this.f31771d.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB3 = this.f31769b.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB4 = this.f31772e.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB5 = this.f31773f.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB6 = this.f31774g.b(AbstractC3800hy0.a());
        if (!bigIntegerB.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerB2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerB.multiply(bigIntegerB2).equals(bigIntegerE)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerB.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerB2.subtract(bigInteger);
        if (!bigIntegerD.multiply(bigIntegerB3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerD.multiply(bigIntegerB4).mod(bigIntegerSubtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerD.multiply(bigIntegerB5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerB2.multiply(bigIntegerB6).mod(bigIntegerB).equals(bigInteger)) {
            return new C4596oI0(this.f31768a, this.f31770c, this.f31771d, this.f31769b, this.f31772e, this.f31773f, this.f31774g, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
