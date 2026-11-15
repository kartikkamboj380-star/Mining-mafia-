package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3213dI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ZH0 f27398a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f27399b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f27400c = null;

    /* synthetic */ C3213dI0(byte[] bArr) {
    }

    public final C3213dI0 a(ZH0 zh0) {
        this.f27398a = zh0;
        return this;
    }

    public final C3213dI0 b(BigInteger bigInteger) {
        this.f27399b = bigInteger;
        return this;
    }

    public final C3213dI0 c(Integer num) {
        this.f27400c = num;
        return this;
    }

    public final C3338eI0 d() throws GeneralSecurityException {
        C4096kK0 c4096kK0A;
        if (this.f27398a == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.f27399b;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iC = this.f27398a.c();
        if (iBitLength != iC) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iC).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(iC);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.f27398a.a() && this.f27400c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f27398a.a() && this.f27400c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f27398a.e() == YH0.f25581e) {
            c4096kK0A = AbstractC2826aD0.f26454a;
        } else if (this.f27398a.e() == YH0.f25580d || this.f27398a.e() == YH0.f25579c) {
            c4096kK0A = AbstractC2826aD0.a(this.f27400c.intValue());
        } else {
            if (this.f27398a.e() != YH0.f25578b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.f27398a.e())));
            }
            c4096kK0A = AbstractC2826aD0.b(this.f27400c.intValue());
        }
        return new C3338eI0(this.f27398a, this.f27399b, c4096kK0A, this.f27400c, null);
    }
}
