package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class HI0 implements InterfaceC1599Cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19263a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19264b = {0};

    private HI0(ECPrivateKey eCPrivateKey, SJ0 sj0, BJ0 bj0, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        AbstractC3720hK0.a(sj0);
    }

    public static InterfaceC1599Cy0 b(C3840iH0 c3840iH0) {
        Provider providerA = YB0.a();
        return new HI0((ECPrivateKey) (providerA != null ? KeyFactory.getInstance("EC", providerA) : (KeyFactory) JJ0.f19830g.b("EC")).generatePrivate(new ECPrivateKeySpec(c3840iH0.g().b(AbstractC3800hy0.a()), CJ0.b((AJ0) II0.f19511k.b(c3840iH0.e().d())))), (SJ0) II0.f19509i.b(c3840iH0.e().e()), (BJ0) II0.f19510j.b(c3840iH0.e().c()), c3840iH0.f().c().c(), c3840iH0.e().f().equals(C3462fH0.f28235d) ? f19264b : f19263a, providerA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599Cy0
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
