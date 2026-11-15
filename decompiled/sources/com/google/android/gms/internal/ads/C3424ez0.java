package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ez0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3424ez0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f28114a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f28115b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f28116c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f28117d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3550fz0 f28118e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3676gz0 f28119f = C3676gz0.f28773d;

    /* synthetic */ C3424ez0(byte[] bArr) {
    }

    public final C3424ez0 a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f28114a = Integer.valueOf(i10);
        return this;
    }

    public final C3424ez0 b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
        }
        this.f28115b = Integer.valueOf(i10);
        return this;
    }

    public final C3424ez0 c(int i10) throws GeneralSecurityException {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
        }
        this.f28116c = Integer.valueOf(i10);
        return this;
    }

    public final C3424ez0 d(int i10) throws GeneralSecurityException {
        if (i10 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
        }
        this.f28117d = Integer.valueOf(i10);
        return this;
    }

    public final C3424ez0 e(C3676gz0 c3676gz0) {
        this.f28119f = c3676gz0;
        return this;
    }

    public final C3424ez0 f(C3550fz0 c3550fz0) {
        this.f28118e = c3550fz0;
        return this;
    }

    public final C3802hz0 g() throws GeneralSecurityException {
        if (this.f28114a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f28115b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f28116c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f28117d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f28118e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f28119f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        C3550fz0 c3550fz0 = this.f28118e;
        if (c3550fz0 == C3550fz0.f28520b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c3550fz0 == C3550fz0.f28521c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c3550fz0 == C3550fz0.f28522d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c3550fz0 == C3550fz0.f28523e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c3550fz0 != C3550fz0.f28524f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C3802hz0(this.f28114a.intValue(), this.f28115b.intValue(), this.f28116c.intValue(), this.f28117d.intValue(), this.f28119f, this.f28118e, null);
    }
}
