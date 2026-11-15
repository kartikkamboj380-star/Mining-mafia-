package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4682oz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f32233a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f32234b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f32235c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4808pz0 f32236d = C4808pz0.f32530d;

    /* synthetic */ C4682oz0(byte[] bArr) {
    }

    public final C4682oz0 a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f32233a = Integer.valueOf(i10);
        return this;
    }

    public final C4682oz0 b(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.f32234b = Integer.valueOf(i10);
        return this;
    }

    public final C4682oz0 c(int i10) {
        this.f32235c = 16;
        return this;
    }

    public final C4682oz0 d(C4808pz0 c4808pz0) {
        this.f32236d = c4808pz0;
        return this;
    }

    public final C4934qz0 e() throws GeneralSecurityException {
        Integer num = this.f32233a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f32234b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f32236d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f32235c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f32234b.intValue();
        this.f32235c.getClass();
        return new C4934qz0(iIntValue, iIntValue2, 16, this.f32236d, null);
    }
}
