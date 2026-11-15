package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5815xz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f35196a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f35197b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f35198c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5941yz0 f35199d = C5941yz0.f35595d;

    /* synthetic */ C5815xz0(byte[] bArr) {
    }

    public final C5815xz0 a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f35196a = Integer.valueOf(i10);
        return this;
    }

    public final C5815xz0 b(int i10) {
        this.f35197b = 12;
        return this;
    }

    public final C5815xz0 c(int i10) {
        this.f35198c = 16;
        return this;
    }

    public final C5815xz0 d(C5941yz0 c5941yz0) {
        this.f35199d = c5941yz0;
        return this;
    }

    public final C6067zz0 e() throws GeneralSecurityException {
        Integer num = this.f35196a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f35199d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f35197b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f35198c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f35197b.getClass();
        this.f35198c.getClass();
        return new C6067zz0(iIntValue, 12, 16, this.f35199d, null);
    }
}
