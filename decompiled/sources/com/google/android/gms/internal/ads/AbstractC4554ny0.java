package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ny0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4554ny0 {
    static final C3334eG0 a(AbstractC1495Ay0 abstractC1495Ay0) {
        try {
            return ((C5593wD0) ZC0.a().k(null, C5593wD0.class)).d();
        } catch (GeneralSecurityException e10) {
            throw new GD0("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }

    public static final AbstractC1495Ay0 b(AbstractC1495Ay0 abstractC1495Ay0) {
        return abstractC1495Ay0 != null ? abstractC1495Ay0 : AbstractC1807Gy0.b(a(null).i());
    }
}
