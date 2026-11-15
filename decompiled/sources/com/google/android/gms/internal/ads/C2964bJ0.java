package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2964bJ0 implements InterfaceC1599Cy0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f26781g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f26782h = {0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f26783i = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RSAPrivateCrtKey f26784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f26786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f26787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1651Dy0 f26788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Provider f26789f;

    private C2964bJ0(RSAPrivateCrtKey rSAPrivateCrtKey, XH0 xh0, byte[] bArr, byte[] bArr2, InterfaceC1651Dy0 interfaceC1651Dy0, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (xh0 != XH0.f25176b && xh0 != XH0.f25177c && xh0 != XH0.f25178d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(xh0)));
        }
        AbstractC3846iK0.c(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3846iK0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f26784a = rSAPrivateCrtKey;
        this.f26785b = C3089cJ0.c(xh0);
        this.f26786c = bArr;
        this.f26787d = bArr2;
        this.f26788e = interfaceC1651Dy0;
        this.f26789f = provider;
    }

    public static InterfaceC1599Cy0 b(C3087cI0 c3087cI0) {
        Provider providerB = C3089cJ0.b();
        C2964bJ0 c2964bJ0 = new C2964bJ0((RSAPrivateCrtKey) (providerB != null ? KeyFactory.getInstance("RSA", providerB) : (KeyFactory) JJ0.f19830g.b("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(c3087cI0.f().e(), c3087cI0.e().d(), c3087cI0.i().b(AbstractC3800hy0.a()), c3087cI0.g().b(AbstractC3800hy0.a()), c3087cI0.h().b(AbstractC3800hy0.a()), c3087cI0.j().b(AbstractC3800hy0.a()), c3087cI0.k().b(AbstractC3800hy0.a()), c3087cI0.l().b(AbstractC3800hy0.a()))), c3087cI0.e().f(), c3087cI0.f().c().c(), c3087cI0.e().e().equals(YH0.f25580d) ? f26782h : f26781g, providerB != null ? C3089cJ0.e(c3087cI0.f(), providerB) : AbstractC2966bK0.b(c3087cI0.f()), providerB);
        c2964bJ0.a(f26783i);
        return c2964bJ0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599Cy0
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        Signature signature;
        Provider provider = this.f26789f;
        if (provider != null) {
            signature = Signature.getInstance(this.f26785b, provider);
        } else {
            signature = (Signature) JJ0.f19827d.b(this.f26785b);
        }
        signature.initSign(this.f26784a);
        signature.update(bArr);
        byte[] bArr2 = this.f26787d;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.f26786c;
        if (bArr3.length > 0) {
            bArrSign = AbstractC5479vJ0.a(bArr3, bArrSign);
        }
        try {
            this.f26788e.a(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("RSA signature computation error", e10);
        }
    }
}
