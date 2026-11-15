package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2960bH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3336eH0 f26774a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3085cH0 f26775b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3211dH0 f26776c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3462fH0 f26777d = C3462fH0.f28236e;

    /* synthetic */ C2960bH0(byte[] bArr) {
    }

    public final C2960bH0 a(C3336eH0 c3336eH0) {
        this.f26774a = c3336eH0;
        return this;
    }

    public final C2960bH0 b(C3085cH0 c3085cH0) {
        this.f26775b = c3085cH0;
        return this;
    }

    public final C2960bH0 c(C3211dH0 c3211dH0) {
        this.f26776c = c3211dH0;
        return this;
    }

    public final C2960bH0 d(C3462fH0 c3462fH0) {
        this.f26777d = c3462fH0;
        return this;
    }

    public final C3588gH0 e() throws GeneralSecurityException {
        C3336eH0 c3336eH0 = this.f26774a;
        if (c3336eH0 == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        C3085cH0 c3085cH0 = this.f26775b;
        if (c3085cH0 == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        C3211dH0 c3211dH0 = this.f26776c;
        if (c3211dH0 == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        C3462fH0 c3462fH0 = this.f26777d;
        if (c3462fH0 == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (c3085cH0 == C3085cH0.f27077c && c3211dH0 != C3211dH0.f27393b) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (c3085cH0 == C3085cH0.f27078d && c3211dH0 != C3211dH0.f27394c && c3211dH0 != C3211dH0.f27395d) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (c3085cH0 != C3085cH0.f27079e || c3211dH0 == C3211dH0.f27395d) {
            return new C3588gH0(c3336eH0, c3085cH0, c3211dH0, c3462fH0, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
