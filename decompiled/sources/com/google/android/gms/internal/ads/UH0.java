package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class UH0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4082kD0 f23976a;

    public UH0(C4082kD0 c4082kD0, KC0 kc0) {
        this.f23976a = c4082kD0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f23976a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((TH0) it.next()).f23467a.a(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
