package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class QE0 implements LE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Key f22333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f22334b;

    private QE0(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f22333a = new SecretKeySpec(bArr, "AES");
        this.f22334b = provider;
    }

    public static LE0 b(JE0 je0) throws GeneralSecurityException {
        Provider providerA = YB0.a();
        if (providerA == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerA);
        return new QE0(je0.d().c(AbstractC3800hy0.a()), providerA);
    }

    @Override // com.google.android.gms.internal.ads.LE0
    public final byte[] a(byte[] bArr, int i10) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = this.f22334b;
        Key key = this.f22333a;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i10 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i10);
    }
}
