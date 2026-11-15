package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3079cE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f27071a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f27072b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3205dE0 f27073c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3330eE0 f27074d = C3330eE0.f27725e;

    /* synthetic */ C3079cE0(byte[] bArr) {
    }

    public final C3079cE0 a(int i10) {
        this.f27071a = Integer.valueOf(i10);
        return this;
    }

    public final C3079cE0 b(int i10) {
        this.f27072b = Integer.valueOf(i10);
        return this;
    }

    public final C3079cE0 c(C3330eE0 c3330eE0) {
        this.f27074d = c3330eE0;
        return this;
    }

    public final C3079cE0 d(C3205dE0 c3205dE0) {
        this.f27073c = c3205dE0;
        return this;
    }

    public final C3456fE0 e() throws GeneralSecurityException {
        Integer num = this.f27071a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f27072b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f27073c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f27074d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f27071a));
        }
        Integer num2 = this.f27072b;
        int iIntValue = num2.intValue();
        C3205dE0 c3205dE0 = this.f27073c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c3205dE0 == C3205dE0.f27385b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c3205dE0 == C3205dE0.f27386c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c3205dE0 == C3205dE0.f27387d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c3205dE0 == C3205dE0.f27388e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c3205dE0 != C3205dE0.f27389f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C3456fE0(this.f27071a.intValue(), this.f27072b.intValue(), this.f27074d, this.f27073c, null);
    }
}
