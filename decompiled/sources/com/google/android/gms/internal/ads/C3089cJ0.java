package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3089cJ0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f27090f = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f27091g = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RSAPublicKey f27092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f27094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f27095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27096e;

    private C3089cJ0(RSAPublicKey rSAPublicKey, XH0 xh0, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3846iK0.c(rSAPublicKey.getModulus().bitLength());
        AbstractC3846iK0.d(rSAPublicKey.getPublicExponent());
        this.f27092a = rSAPublicKey;
        this.f27093b = c(xh0);
        this.f27094c = bArr;
        this.f27095d = bArr2;
        this.f27096e = provider;
    }

    static Provider b() {
        if (HD0.c()) {
            HD0.d().getClass();
        }
        return YB0.a();
    }

    public static String c(XH0 xh0) throws GeneralSecurityException {
        if (xh0 == XH0.f25176b) {
            return "SHA256withRSA";
        }
        if (xh0 == XH0.f25177c) {
            return "SHA384withRSA";
        }
        if (xh0 == XH0.f25178d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static InterfaceC1651Dy0 d(C3338eI0 c3338eI0) throws NoSuchProviderException {
        Provider providerB = b();
        if (providerB != null) {
            return e(c3338eI0, providerB);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static InterfaceC1651Dy0 e(C3338eI0 c3338eI0, Provider provider) {
        return new C3089cJ0((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(c3338eI0.e(), c3338eI0.f().d())), c3338eI0.f().f(), c3338eI0.c().c(), c3338eI0.f().e().equals(YH0.f25580d) ? f27091g : f27090f, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f27094c;
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.f27093b;
        Provider provider = this.f27096e;
        RSAPublicKey rSAPublicKey = this.f27092a;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.f27095d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
