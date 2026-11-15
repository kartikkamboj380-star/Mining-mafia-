package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3926iz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4934qz0 f30260a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4348mK0 f30261b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f30262c = null;

    /* synthetic */ C3926iz0(byte[] bArr) {
    }

    public final C3926iz0 a(C4934qz0 c4934qz0) {
        this.f30260a = c4934qz0;
        return this;
    }

    public final C3926iz0 b(C4348mK0 c4348mK0) {
        this.f30261b = c4348mK0;
        return this;
    }

    public final C3926iz0 c(Integer num) {
        this.f30262c = num;
        return this;
    }

    public final C4052jz0 d() throws GeneralSecurityException {
        C4348mK0 c4348mK0;
        C4096kK0 c4096kK0B;
        C4934qz0 c4934qz0 = this.f30260a;
        if (c4934qz0 == null || (c4348mK0 = this.f30261b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c4934qz0.c() != c4348mK0.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c4934qz0.a() && this.f30262c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f30260a.a() && this.f30262c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f30260a.e() == C4808pz0.f32530d) {
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else if (this.f30260a.e() == C4808pz0.f32529c) {
            c4096kK0B = AbstractC2826aD0.a(this.f30262c.intValue());
        } else {
            if (this.f30260a.e() != C4808pz0.f32528b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f30260a.e())));
            }
            c4096kK0B = AbstractC2826aD0.b(this.f30262c.intValue());
        }
        return new C4052jz0(this.f30260a, this.f30261b, c4096kK0B, this.f30262c, null);
    }
}
