package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2742Yy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3802hz0 f26057a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4348mK0 f26058b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4348mK0 f26059c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f26060d = null;

    /* synthetic */ C2742Yy0(byte[] bArr) {
    }

    public final C2742Yy0 a(C3802hz0 c3802hz0) {
        this.f26057a = c3802hz0;
        return this;
    }

    public final C2742Yy0 b(C4348mK0 c4348mK0) {
        this.f26058b = c4348mK0;
        return this;
    }

    public final C2742Yy0 c(C4348mK0 c4348mK0) {
        this.f26059c = c4348mK0;
        return this;
    }

    public final C2742Yy0 d(Integer num) {
        this.f26060d = num;
        return this;
    }

    public final C2794Zy0 e() throws GeneralSecurityException {
        C4096kK0 c4096kK0B;
        C3802hz0 c3802hz0 = this.f26057a;
        if (c3802hz0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        C4348mK0 c4348mK0 = this.f26058b;
        if (c4348mK0 == null || this.f26059c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c3802hz0.c() != c4348mK0.d()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c3802hz0.d() != this.f26059c.d()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f26057a.a() && this.f26060d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f26057a.a() && this.f26060d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f26057a.g() == C3676gz0.f28773d) {
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else if (this.f26057a.g() == C3676gz0.f28772c) {
            c4096kK0B = AbstractC2826aD0.a(this.f26060d.intValue());
        } else {
            if (this.f26057a.g() != C3676gz0.f28771b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f26057a.g())));
            }
            c4096kK0B = AbstractC2826aD0.b(this.f26060d.intValue());
        }
        return new C2794Zy0(this.f26057a, this.f26058b, this.f26059c, c4096kK0B, this.f26060d, null);
    }
}
