package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class WH0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigInteger f24743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigInteger f24744f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f24745a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f24746b = ZH0.f26142e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private XH0 f24747c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private YH0 f24748d = YH0.f25581e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f24743e = bigIntegerValueOf;
        f24744f = bigIntegerValueOf.pow(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    /* synthetic */ WH0(byte[] bArr) {
    }

    public final WH0 a(int i10) {
        this.f24745a = Integer.valueOf(i10);
        return this;
    }

    public final WH0 b(BigInteger bigInteger) {
        this.f24746b = bigInteger;
        return this;
    }

    public final WH0 c(YH0 yh0) {
        this.f24748d = yh0;
        return this;
    }

    public final WH0 d(XH0 xh0) {
        this.f24747c = xh0;
        return this;
    }

    public final ZH0 e() throws GeneralSecurityException {
        Integer num = this.f24745a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f24746b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f24747c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f24748d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f24745a));
        }
        BigInteger bigInteger = this.f24746b;
        int iCompareTo = bigInteger.compareTo(ZH0.f26142e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f24743e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f24744f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new ZH0(this.f24745a.intValue(), this.f24746b, this.f24748d, this.f24747c, null);
    }
}
