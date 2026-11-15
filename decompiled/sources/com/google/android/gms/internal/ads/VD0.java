package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class VD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3456fE0 f24226a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4348mK0 f24227b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f24228c = null;

    /* synthetic */ VD0(byte[] bArr) {
    }

    public final VD0 a(C3456fE0 c3456fE0) {
        this.f24226a = c3456fE0;
        return this;
    }

    public final VD0 b(C4348mK0 c4348mK0) {
        this.f24227b = c4348mK0;
        return this;
    }

    public final VD0 c(Integer num) {
        this.f24228c = num;
        return this;
    }

    public final WD0 d() throws GeneralSecurityException {
        C4348mK0 c4348mK0;
        C4096kK0 c4096kK0A;
        C3456fE0 c3456fE0 = this.f24226a;
        if (c3456fE0 == null || (c4348mK0 = this.f24227b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c3456fE0.c() != c4348mK0.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c3456fE0.a() && this.f24228c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f24226a.a() && this.f24228c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f24226a.f() == C3330eE0.f27725e) {
            c4096kK0A = AbstractC2826aD0.f26454a;
        } else if (this.f24226a.f() == C3330eE0.f27724d || this.f24226a.f() == C3330eE0.f27723c) {
            c4096kK0A = AbstractC2826aD0.a(this.f24228c.intValue());
        } else {
            if (this.f24226a.f() != C3330eE0.f27722b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f24226a.f())));
            }
            c4096kK0A = AbstractC2826aD0.b(this.f24228c.intValue());
        }
        return new WD0(this.f24226a, this.f24227b, c4096kK0A, this.f24228c, null);
    }
}
