package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class BE0 implements RD0 {
    public BE0(JD0 jd0) {
    }

    public static RD0 a(JD0 jd0) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerA = YB0.a();
        if (providerA != null) {
            try {
                return AE0.a(jd0, providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new BE0(jd0);
    }
}
