package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class ID0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private QD0 f19498a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4348mK0 f19499b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f19500c = null;

    /* synthetic */ ID0(byte[] bArr) {
    }

    public final ID0 a(QD0 qd0) {
        this.f19498a = qd0;
        return this;
    }

    public final ID0 b(C4348mK0 c4348mK0) {
        this.f19499b = c4348mK0;
        return this;
    }

    public final ID0 c(Integer num) {
        this.f19500c = num;
        return this;
    }

    public final JD0 d() throws GeneralSecurityException {
        C4348mK0 c4348mK0;
        C4096kK0 c4096kK0A;
        QD0 qd0 = this.f19498a;
        if (qd0 == null || (c4348mK0 = this.f19499b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qd0.c() != c4348mK0.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (qd0.a() && this.f19500c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f19498a.a() && this.f19500c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f19498a.f() == PD0.f22068e) {
            c4096kK0A = AbstractC2826aD0.f26454a;
        } else if (this.f19498a.f() == PD0.f22067d || this.f19498a.f() == PD0.f22066c) {
            c4096kK0A = AbstractC2826aD0.a(this.f19500c.intValue());
        } else {
            if (this.f19498a.f() != PD0.f22065b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f19498a.f())));
            }
            c4096kK0A = AbstractC2826aD0.b(this.f19500c.intValue());
        }
        return new JD0(this.f19498a, this.f19499b, c4096kK0A, this.f19500c, null);
    }
}
