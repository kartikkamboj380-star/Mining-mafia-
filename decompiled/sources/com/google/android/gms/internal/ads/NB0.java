package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class NB0 extends ThreadLocal {
    NB0() {
    }

    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) JJ0.f19825b.b("AES/GCM-SIV/NoPadding");
            if (C3450fB0.b(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
