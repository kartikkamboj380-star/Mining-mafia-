package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class RI0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f22784e = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PublicKey f22785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f22786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f22787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f22788d;

    private RI0(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f22785a = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(AbstractC5479vJ0.a(f22784e, bArr)));
        this.f22786b = bArr2;
        this.f22787c = bArr3;
        this.f22788d = provider;
    }

    public static InterfaceC1651Dy0 b(C5727xH0 c5727xH0) throws GeneralSecurityException {
        Provider providerA = YB0.a();
        if (providerA == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (UB0.a(1)) {
            return new RI0(c5727xH0.e().c(), c5727xH0.c().c(), c5727xH0.f().c().equals(C4720pH0.f32353d) ? new byte[]{0} : new byte[0], providerA);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f22786b;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new GeneralSecurityException(String.format("Invalid signature length: %s", 64));
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Provider provider = this.f22788d;
        PublicKey publicKey = this.f22785a;
        Signature signature = Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.f22787c);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
