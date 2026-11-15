package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4220lJ0 implements InterfaceC1599Cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f31243a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f31244b = {0};

    private C4220lJ0(RSAPrivateCrtKey rSAPrivateCrtKey, C4092kI0 c4092kI0, C4092kI0 c4092kI1, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3846iK0.c(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3846iK0.d(rSAPrivateCrtKey.getPublicExponent());
        C4346mJ0.c(c4092kI0);
        C4346mJ0.d(c4092kI0, c4092kI1, i10);
    }

    public static InterfaceC1599Cy0 b(C4596oI0 c4596oI0) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerB = C4346mJ0.b();
        if (providerB == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerB);
        C4344mI0 c4344mI0E = c4596oI0.e();
        return new C4220lJ0((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c4596oI0.f().e(), c4344mI0E.d(), c4596oI0.i().b(AbstractC3800hy0.a()), c4596oI0.g().b(AbstractC3800hy0.a()), c4596oI0.h().b(AbstractC3800hy0.a()), c4596oI0.j().b(AbstractC3800hy0.a()), c4596oI0.k().b(AbstractC3800hy0.a()), c4596oI0.l().b(AbstractC3800hy0.a()))), c4344mI0E.f(), c4344mI0E.g(), c4344mI0E.h(), c4596oI0.f().c().c(), c4344mI0E.e().equals(C4218lI0.f31240d) ? f31244b : f31243a, providerB);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599Cy0
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
