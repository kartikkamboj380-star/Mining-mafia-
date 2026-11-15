package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5059rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C6067zz0 f33058a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4348mK0 f33059b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f33060c = null;

    /* synthetic */ C5059rz0(byte[] bArr) {
    }

    public final C5059rz0 a(C6067zz0 c6067zz0) {
        this.f33058a = c6067zz0;
        return this;
    }

    public final C5059rz0 b(C4348mK0 c4348mK0) {
        this.f33059b = c4348mK0;
        return this;
    }

    public final C5059rz0 c(Integer num) {
        this.f33060c = num;
        return this;
    }

    public final C5185sz0 d() throws GeneralSecurityException {
        C4348mK0 c4348mK0;
        C4096kK0 c4096kK0B;
        C6067zz0 c6067zz0 = this.f33058a;
        if (c6067zz0 == null || (c4348mK0 = this.f33059b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c6067zz0.c() != c4348mK0.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c6067zz0.a() && this.f33060c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f33058a.a() && this.f33060c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f33058a.d() == C5941yz0.f35595d) {
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else if (this.f33058a.d() == C5941yz0.f35594c) {
            c4096kK0B = AbstractC2826aD0.a(this.f33060c.intValue());
        } else {
            if (this.f33058a.d() != C5941yz0.f35593b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f33058a.d())));
            }
            c4096kK0B = AbstractC2826aD0.b(this.f33060c.intValue());
        }
        return new C5185sz0(this.f33058a, this.f33059b, c4096kK0B, this.f33060c, null);
    }
}
