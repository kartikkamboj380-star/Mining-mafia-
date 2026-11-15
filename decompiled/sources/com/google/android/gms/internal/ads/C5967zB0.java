package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5967zB0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3171cy0 f35676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f35677b;

    private C5967zB0(InterfaceC3171cy0 interfaceC3171cy0, byte[] bArr) {
        this.f35676a = interfaceC3171cy0;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f35677b = bArr;
    }

    public static InterfaceC3171cy0 b(GC0 gc0) throws GeneralSecurityException {
        byte[] bArrC;
        C5467vD0 c5467vD0C = gc0.c(AbstractC3800hy0.a());
        InterfaceC3171cy0 interfaceC3171cy0 = (InterfaceC3171cy0) C5339uC0.a().c(c5467vD0C.g(), InterfaceC3171cy0.class).a(c5467vD0C.c());
        EnumC5725xG0 enumC5725xG0E = c5467vD0C.e();
        int iOrdinal = enumC5725xG0E.ordinal();
        if (iOrdinal == 1) {
            bArrC = AbstractC2826aD0.b(gc0.b().intValue()).c();
        } else if (iOrdinal == 2) {
            bArrC = AbstractC2826aD0.a(gc0.b().intValue()).c();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(enumC5725xG0E)));
            }
            bArrC = AbstractC2826aD0.a(gc0.b().intValue()).c();
        } else {
            bArrC = AbstractC2826aD0.f26454a.c();
        }
        return new C5967zB0(interfaceC3171cy0, bArrC);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f35677b;
        if (bArr3.length == 0) {
            return this.f35676a.a(bArr, bArr2);
        }
        if (HD0.e(bArr3, bArr)) {
            return this.f35676a.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
