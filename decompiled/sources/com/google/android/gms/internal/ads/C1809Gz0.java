package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1809Gz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f19168a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1861Hz0 f19169b = C1861Hz0.f19427d;

    /* synthetic */ C1809Gz0(byte[] bArr) {
    }

    public final C1809Gz0 a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f19168a = Integer.valueOf(i10);
        return this;
    }

    public final C1809Gz0 b(C1861Hz0 c1861Hz0) {
        this.f19169b = c1861Hz0;
        return this;
    }

    public final C1913Iz0 c() throws GeneralSecurityException {
        Integer num = this.f19168a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f19169b != null) {
            return new C1913Iz0(num.intValue(), this.f19169b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
