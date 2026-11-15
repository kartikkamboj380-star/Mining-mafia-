package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class IE0 implements InterfaceC6065zy0 {
    private IE0(InterfaceC6065zy0 interfaceC6065zy0, EnumC5725xG0 enumC5725xG0, byte[] bArr) {
    }

    public static InterfaceC6065zy0 a(GC0 gc0) throws GeneralSecurityException {
        byte[] bArrC;
        C5467vD0 c5467vD0C = gc0.c(AbstractC3800hy0.a());
        InterfaceC6065zy0 interfaceC6065zy0 = (InterfaceC6065zy0) C5339uC0.a().c(c5467vD0C.g(), InterfaceC6065zy0.class).a(c5467vD0C.c());
        EnumC5725xG0 enumC5725xG0E = c5467vD0C.e();
        int iOrdinal = enumC5725xG0E.ordinal();
        if (iOrdinal == 1) {
            bArrC = AbstractC2826aD0.b(gc0.b().intValue()).c();
        } else if (iOrdinal == 2) {
            bArrC = AbstractC2826aD0.a(gc0.b().intValue()).c();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrC = AbstractC2826aD0.a(gc0.b().intValue()).c();
        } else {
            bArrC = AbstractC2826aD0.f26454a.c();
        }
        return new IE0(interfaceC6065zy0, enumC5725xG0E, bArrC);
    }
}
