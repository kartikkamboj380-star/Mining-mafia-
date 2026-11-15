package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5857yJ0 implements InterfaceC1599Cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f35327a;

    private C5857yJ0(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrB = AbstractC3452fC0.b(bArr);
        this.f35327a = bArrB;
        AbstractC3452fC0.a(bArrB);
    }

    public static InterfaceC1599Cy0 b(C4971rH0 c4971rH0) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return QI0.b(c4971rH0);
        } catch (GeneralSecurityException unused) {
            return new C5857yJ0(c4971rH0.g().c(AbstractC3800hy0.a()), c4971rH0.f().c().c(), c4971rH0.e().c().equals(C4720pH0.f32353d) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599Cy0
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
