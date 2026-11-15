package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3714hH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4090kH0 f28893a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4222lK0 f28894b = null;

    /* synthetic */ C3714hH0(byte[] bArr) {
    }

    public final C3714hH0 a(C4090kH0 c4090kH0) {
        this.f28893a = c4090kH0;
        return this;
    }

    public final C3714hH0 b(C4222lK0 c4222lK0) {
        this.f28894b = c4222lK0;
        return this;
    }

    public final C3840iH0 c() throws GeneralSecurityException {
        C4090kH0 c4090kH0 = this.f28893a;
        if (c4090kH0 == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        C4222lK0 c4222lK0 = this.f28894b;
        if (c4222lK0 == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigIntegerB = c4222lK0.b(AbstractC3800hy0.a());
        ECPoint eCPointE = c4090kH0.e();
        C3085cH0 c3085cH0D = c4090kH0.f().d();
        BigInteger order = c3085cH0D.a().getOrder();
        if (bigIntegerB.signum() <= 0 || bigIntegerB.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (AbstractC3954jC0.d(bigIntegerB, c3085cH0D.a()).equals(eCPointE)) {
            return new C3840iH0(this.f28893a, this.f28894b, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }
}
