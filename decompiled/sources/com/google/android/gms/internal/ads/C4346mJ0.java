package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4346mJ0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f31485g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f31486h = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RSAPublicKey f31487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PSSParameterSpec f31489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f31490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f31491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f31492f;

    private C4346mJ0(RSAPublicKey rSAPublicKey, C4092kI0 c4092kI0, C4092kI0 c4092kI1, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!c4092kI0.equals(c4092kI1)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3846iK0.c(rSAPublicKey.getModulus().bitLength());
        AbstractC3846iK0.d(rSAPublicKey.getPublicExponent());
        this.f31487a = rSAPublicKey;
        this.f31488b = c(c4092kI0);
        this.f31489c = d(c4092kI0, c4092kI1, i10);
        this.f31490d = bArr;
        this.f31491e = bArr2;
        this.f31492f = provider;
    }

    static Provider b() {
        if (!HD0.c() || HD0.d().intValue() > 23) {
            return YB0.a();
        }
        return null;
    }

    static String c(C4092kI0 c4092kI0) {
        if (c4092kI0 == C4092kI0.f30743b) {
            return "SHA256withRSA/PSS";
        }
        if (c4092kI0 == C4092kI0.f30744c) {
            return "SHA384withRSA/PSS";
        }
        if (c4092kI0 == C4092kI0.f30745d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(c4092kI0)));
    }

    static PSSParameterSpec d(C4092kI0 c4092kI0, C4092kI0 c4092kI1, int i10) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        C4092kI0 c4092kI2 = C4092kI0.f30743b;
        if (c4092kI0 == c4092kI2) {
            str = "SHA-256";
        } else if (c4092kI0 == C4092kI0.f30744c) {
            str = "SHA-384";
        } else {
            if (c4092kI0 != C4092kI0.f30745d) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(c4092kI0)));
            }
            str = "SHA-512";
        }
        if (c4092kI1 == c4092kI2) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (c4092kI1 == C4092kI0.f30744c) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (c4092kI1 != C4092kI0.f30745d) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(c4092kI1)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i10, 1);
    }

    public static InterfaceC1651Dy0 e(C4848qI0 c4848qI0) throws NoSuchProviderException {
        Provider providerB = b();
        if (providerB == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerB).generatePublic(new RSAPublicKeySpec(c4848qI0.e(), c4848qI0.f().d()));
        C4344mI0 c4344mI0F = c4848qI0.f();
        return new C4346mJ0(rSAPublicKey, c4344mI0F.f(), c4344mI0F.g(), c4344mI0F.h(), c4848qI0.c().c(), c4848qI0.f().e().equals(C4218lI0.f31240d) ? f31486h : f31485g, providerB);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f31490d;
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.f31488b;
        Provider provider = this.f31492f;
        RSAPublicKey rSAPublicKey = this.f31487a;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.f31489c);
        signature.update(bArr2);
        byte[] bArr4 = this.f31491e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
