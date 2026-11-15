package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5983zJ0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4096kK0 f35688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f35689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f35690c;

    private C5983zJ0(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!UB0.a(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f35688a = C4096kK0.a(bArr);
        this.f35689b = bArr2;
        this.f35690c = bArr3;
        AbstractC3452fC0.d();
    }

    public static InterfaceC1651Dy0 b(C5727xH0 c5727xH0) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return RI0.b(c5727xH0);
        } catch (GeneralSecurityException unused) {
            return new C5983zJ0(c5727xH0.e().c(), c5727xH0.c().c(), c5727xH0.f().c().equals(C4720pH0.f32353d) ? new byte[]{0} : new byte[0]);
        }
    }

    private final void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!AbstractC3452fC0.c(bArr2, bArr, this.f35688a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f35689b;
        int length = bArr3.length;
        if (length == 0 && this.f35690c.length == 0) {
            c(bArr, bArr2);
        } else {
            if (!HD0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.f35690c;
            if (bArr4.length != 0) {
                bArr2 = AbstractC5479vJ0.a(bArr2, bArr4);
            }
            c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
