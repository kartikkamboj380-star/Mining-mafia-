package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2836aI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3338eI0 f26468a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4222lK0 f26469b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4222lK0 f26470c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4222lK0 f26471d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4222lK0 f26472e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4222lK0 f26473f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4222lK0 f26474g = null;

    /* synthetic */ C2836aI0(byte[] bArr) {
    }

    public final C2836aI0 a(C3338eI0 c3338eI0) {
        this.f26468a = c3338eI0;
        return this;
    }

    public final C2836aI0 b(C4222lK0 c4222lK0, C4222lK0 c4222lK1) {
        this.f26470c = c4222lK0;
        this.f26471d = c4222lK1;
        return this;
    }

    public final C2836aI0 c(C4222lK0 c4222lK0) {
        this.f26469b = c4222lK0;
        return this;
    }

    public final C2836aI0 d(C4222lK0 c4222lK0, C4222lK0 c4222lK1) {
        this.f26472e = c4222lK0;
        this.f26473f = c4222lK1;
        return this;
    }

    public final C2836aI0 e(C4222lK0 c4222lK0) {
        this.f26474g = c4222lK0;
        return this;
    }

    public final C3087cI0 f() throws GeneralSecurityException {
        C3338eI0 c3338eI0 = this.f26468a;
        if (c3338eI0 == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.f26470c == null || this.f26471d == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.f26469b == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.f26472e == null || this.f26473f == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.f26474g == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerD = c3338eI0.f().d();
        BigInteger bigIntegerE = this.f26468a.e();
        BigInteger bigIntegerB = this.f26470c.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB2 = this.f26471d.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB3 = this.f26469b.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB4 = this.f26472e.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB5 = this.f26473f.b(AbstractC3800hy0.a());
        BigInteger bigIntegerB6 = this.f26474g.b(AbstractC3800hy0.a());
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
            return new C3087cI0(this.f26468a, this.f26470c, this.f26471d, this.f26469b, this.f26472e, this.f26473f, this.f26474g, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
