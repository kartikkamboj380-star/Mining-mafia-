package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3192d8 extends AbstractC3317e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f27341b;

    public C3192d8(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f27341b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f27341b;
    }
}
