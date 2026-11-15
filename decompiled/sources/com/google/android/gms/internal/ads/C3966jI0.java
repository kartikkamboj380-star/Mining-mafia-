package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3966jI0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f30388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigInteger f30389h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f30390a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f30391b = C4344mI0.f31477g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4092kI0 f30392c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4092kI0 f30393d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f30394e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4218lI0 f30395f = C4218lI0.f31241e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f30388g = bigIntegerValueOf;
        f30389h = bigIntegerValueOf.pow(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    /* synthetic */ C3966jI0(byte[] bArr) {
    }

    public final C3966jI0 a(int i10) {
        this.f30390a = Integer.valueOf(i10);
        return this;
    }

    public final C3966jI0 b(BigInteger bigInteger) {
        this.f30391b = bigInteger;
        return this;
    }

    public final C3966jI0 c(C4218lI0 c4218lI0) {
        this.f30395f = c4218lI0;
        return this;
    }

    public final C3966jI0 d(C4092kI0 c4092kI0) {
        this.f30392c = c4092kI0;
        return this;
    }

    public final C3966jI0 e(C4092kI0 c4092kI0) {
        this.f30393d = c4092kI0;
        return this;
    }

    public final C3966jI0 f(int i10) throws GeneralSecurityException {
        if (i10 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i10)));
        }
        this.f30394e = Integer.valueOf(i10);
        return this;
    }

    public final C4344mI0 g() throws GeneralSecurityException {
        Integer num = this.f30390a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f30391b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f30392c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f30393d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f30395f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f30394e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f30390a, 2048));
        }
        if (this.f30392c != this.f30393d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f30391b;
        int iCompareTo = bigInteger.compareTo(C4344mI0.f31477g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f30388g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f30389h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C4344mI0(this.f30390a.intValue(), this.f30391b, this.f30395f, this.f30392c, this.f30393d, this.f30394e.intValue(), null);
    }
}
