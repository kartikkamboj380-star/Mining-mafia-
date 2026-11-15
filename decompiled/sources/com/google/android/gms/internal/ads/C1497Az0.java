package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Az0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1497Az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1913Iz0 f17441a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4348mK0 f17442b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f17443c = null;

    /* synthetic */ C1497Az0(byte[] bArr) {
    }

    public final C1497Az0 a(C1913Iz0 c1913Iz0) {
        this.f17441a = c1913Iz0;
        return this;
    }

    public final C1497Az0 b(C4348mK0 c4348mK0) {
        this.f17442b = c4348mK0;
        return this;
    }

    public final C1497Az0 c(Integer num) {
        this.f17443c = num;
        return this;
    }

    public final C1549Bz0 d() throws GeneralSecurityException {
        C4348mK0 c4348mK0;
        C4096kK0 c4096kK0B;
        C1913Iz0 c1913Iz0 = this.f17441a;
        if (c1913Iz0 == null || (c4348mK0 = this.f17442b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c1913Iz0.c() != c4348mK0.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c1913Iz0.a() && this.f17443c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f17441a.a() && this.f17443c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f17441a.d() == C1861Hz0.f19427d) {
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else if (this.f17441a.d() == C1861Hz0.f19426c) {
            c4096kK0B = AbstractC2826aD0.a(this.f17443c.intValue());
        } else {
            if (this.f17441a.d() != C1861Hz0.f19425b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f17441a.d())));
            }
            c4096kK0B = AbstractC2826aD0.b(this.f17443c.intValue());
        }
        return new C1549Bz0(this.f17441a, this.f17442b, c4096kK0B, this.f17443c, null);
    }
}
