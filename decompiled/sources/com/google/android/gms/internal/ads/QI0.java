package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class QI0 implements InterfaceC1599Cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f22338a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    private QI0(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(AbstractC5479vJ0.a(f22338a, bArr)));
    }

    public static InterfaceC1599Cy0 b(C4971rH0 c4971rH0) throws NoSuchProviderException {
        Provider providerA = YB0.a();
        if (providerA != null) {
            return new QI0(c4971rH0.g().c(AbstractC3800hy0.a()), c4971rH0.f().c().c(), c4971rH0.e().c().equals(C4720pH0.f32353d) ? new byte[]{0} : new byte[0], providerA);
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599Cy0
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
