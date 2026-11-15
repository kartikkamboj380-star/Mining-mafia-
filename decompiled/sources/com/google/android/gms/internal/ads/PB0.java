package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PB0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f22058a = new NB0();

    public static InterfaceC3171cy0 b(C1549Bz0 c1549Bz0) {
        return C3450fB0.c(c1549Bz0, OB0.f21490a);
    }

    static /* synthetic */ Cipher c() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) f22058a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }
}
