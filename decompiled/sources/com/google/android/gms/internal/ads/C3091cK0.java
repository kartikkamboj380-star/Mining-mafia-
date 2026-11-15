package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3091cK0 implements InterfaceC1599Cy0 {
    /* synthetic */ C3091cK0(RSAPrivateCrtKey rSAPrivateCrtKey, SJ0 sj0, SJ0 sj1, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (VB0.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3846iK0.b(sj0);
        if (!sj0.equals(sj1)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3846iK0.c(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3846iK0.d(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599Cy0
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
