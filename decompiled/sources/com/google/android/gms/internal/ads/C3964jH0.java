package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3964jH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3588gH0 f30384a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ECPoint f30385b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f30386c = null;

    /* synthetic */ C3964jH0(byte[] bArr) {
    }

    public final C3964jH0 a(C3588gH0 c3588gH0) {
        this.f30384a = c3588gH0;
        return this;
    }

    public final C3964jH0 b(ECPoint eCPoint) {
        this.f30385b = eCPoint;
        return this;
    }

    public final C3964jH0 c(Integer num) {
        this.f30386c = num;
        return this;
    }

    public final C4090kH0 d() throws GeneralSecurityException {
        C4096kK0 c4096kK0A;
        C3588gH0 c3588gH0 = this.f30384a;
        if (c3588gH0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.f30385b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        AbstractC3954jC0.a(eCPoint, c3588gH0.d().a().getCurve());
        if (this.f30384a.a() && this.f30386c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f30384a.a() && this.f30386c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f30384a.f() == C3462fH0.f28236e) {
            c4096kK0A = AbstractC2826aD0.f26454a;
        } else if (this.f30384a.f() == C3462fH0.f28235d || this.f30384a.f() == C3462fH0.f28234c) {
            c4096kK0A = AbstractC2826aD0.a(this.f30386c.intValue());
        } else {
            if (this.f30384a.f() != C3462fH0.f28233b) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.f30384a.f().toString()));
            }
            c4096kK0A = AbstractC2826aD0.b(this.f30386c.intValue());
        }
        return new C4090kH0(this.f30384a, this.f30385b, c4096kK0A, this.f30386c, null);
    }
}
