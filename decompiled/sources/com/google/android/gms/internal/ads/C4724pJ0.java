package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4724pJ0 extends ThreadLocal {
    C4724pJ0() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) JJ0.f19825b.b("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
