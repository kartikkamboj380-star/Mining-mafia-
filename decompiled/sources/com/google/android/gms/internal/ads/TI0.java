package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class TI0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1651Dy0 f23469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f23470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f23471c;

    private TI0(InterfaceC1651Dy0 interfaceC1651Dy0, byte[] bArr, byte[] bArr2) {
        this.f23469a = interfaceC1651Dy0;
        this.f23470b = bArr;
        this.f23471c = bArr2;
    }

    public static InterfaceC1651Dy0 b(GC0 gc0) {
        C5467vD0 c5467vD0C = gc0.c(AbstractC3800hy0.a());
        return new TI0((InterfaceC1651Dy0) C5339uC0.a().c(c5467vD0C.g(), InterfaceC1651Dy0.class).a(c5467vD0C.c()), c(c5467vD0C), d(c5467vD0C));
    }

    static byte[] c(C5467vD0 c5467vD0) throws GeneralSecurityException {
        int iOrdinal = c5467vD0.e().ordinal();
        if (iOrdinal == 1) {
            return AbstractC2826aD0.b(c5467vD0.f().intValue()).c();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return AbstractC2826aD0.f26454a.c();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return AbstractC2826aD0.a(c5467vD0.f().intValue()).c();
    }

    static byte[] d(C5467vD0 c5467vD0) {
        return c5467vD0.e().equals(EnumC5725xG0.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f23470b;
        int length = bArr3.length;
        if (length == 0 && this.f23471c.length == 0) {
            this.f23469a.a(bArr, bArr2);
            return;
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.f23471c;
        if (bArr4.length != 0) {
            bArr2 = AbstractC5479vJ0.a(bArr2, bArr4);
        }
        this.f23469a.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
