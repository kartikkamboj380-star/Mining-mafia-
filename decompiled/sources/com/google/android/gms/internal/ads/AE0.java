package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class AE0 implements RD0 {
    private AE0(JD0 jd0, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            jd0.c().c();
            jd0.f();
            new SecretKeySpec(jd0.e().c(AbstractC3800hy0.a()), "AES");
        } catch (NoSuchAlgorithmException e10) {
            throw new GeneralSecurityException("AES-CMAC not available.", e10);
        }
    }

    public static RD0 a(JD0 jd0, Provider provider) {
        return new AE0(jd0, provider);
    }
}
