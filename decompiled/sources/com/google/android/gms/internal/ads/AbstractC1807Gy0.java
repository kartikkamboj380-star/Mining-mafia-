package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1807Gy0 {
    public static byte[] a(AbstractC1495Ay0 abstractC1495Ay0) {
        return ((C5593wD0) ZC0.a().k(abstractC1495Ay0, C5593wD0.class)).d().i();
    }

    public static AbstractC1495Ay0 b(byte[] bArr) {
        try {
            C3334eG0 c3334eG0G0 = C3334eG0.g0(bArr, HL0.a());
            ZC0 zc0A = ZC0.a();
            C5593wD0 c5593wD0C = C5593wD0.c(c3334eG0G0);
            return !zc0A.i(c5593wD0C) ? new HC0(c5593wD0C) : zc0A.j(c5593wD0C);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
