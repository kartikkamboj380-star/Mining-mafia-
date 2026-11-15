package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2638Wy0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4082kD0 f25031a;

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f25031a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                byte[] bArrA = ((C2534Uy0) it.next()).f24144a.a(bArr, bArr2);
                int length = bArr.length;
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
