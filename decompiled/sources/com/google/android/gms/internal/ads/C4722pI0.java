package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4722pI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4344mI0 f32357a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f32358b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f32359c = null;

    /* synthetic */ C4722pI0(byte[] bArr) {
    }

    public final C4722pI0 a(C4344mI0 c4344mI0) {
        this.f32357a = c4344mI0;
        return this;
    }

    public final C4722pI0 b(BigInteger bigInteger) {
        this.f32358b = bigInteger;
        return this;
    }

    public final C4722pI0 c(Integer num) {
        this.f32359c = num;
        return this;
    }

    public final C4848qI0 d() throws GeneralSecurityException {
        C4096kK0 c4096kK0A;
        if (this.f32357a == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.f32358b;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iC = this.f32357a.c();
        if (iBitLength != iC) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iC).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(iC);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.f32357a.a() && this.f32359c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f32357a.a() && this.f32359c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f32357a.e() == C4218lI0.f31241e) {
            c4096kK0A = AbstractC2826aD0.f26454a;
        } else if (this.f32357a.e() == C4218lI0.f31240d || this.f32357a.e() == C4218lI0.f31239c) {
            c4096kK0A = AbstractC2826aD0.a(this.f32359c.intValue());
        } else {
            if (this.f32357a.e() != C4218lI0.f31238b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.f32357a.e())));
            }
            c4096kK0A = AbstractC2826aD0.b(this.f32359c.intValue());
        }
        return new C4848qI0(this.f32357a, this.f32358b, c4096kK0A, this.f32359c, null);
    }
}
