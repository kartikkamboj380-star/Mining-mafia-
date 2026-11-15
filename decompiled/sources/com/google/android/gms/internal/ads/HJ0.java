package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class HJ0 implements IJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RJ0 f19267a;

    @Override // com.google.android.gms.internal.ads.IJ0
    public final Object k(String str) throws GeneralSecurityException {
        Iterator it = JJ0.a("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f19267a.a(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
