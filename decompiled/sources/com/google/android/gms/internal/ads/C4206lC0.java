package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4206lC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31229b;

    /* synthetic */ C4206lC0(Map map, Map map2, byte[] bArr) {
        this.f31228a = map;
        this.f31229b = map2;
    }

    public static C4080kC0 a() {
        return new C4080kC0(null);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r10 = (Enum) this.f31229b.get(obj);
        if (r10 != null) {
            return r10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r10) throws GeneralSecurityException {
        Object obj = this.f31228a.get(r10);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r10)));
    }
}
