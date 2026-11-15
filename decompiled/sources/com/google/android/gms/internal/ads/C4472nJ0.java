package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4472nJ0 extends ThreadLocal {
    C4472nJ0() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) JJ0.f19825b.b("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
