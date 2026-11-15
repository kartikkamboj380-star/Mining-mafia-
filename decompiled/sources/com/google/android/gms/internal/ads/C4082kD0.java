package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4082kD0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4096kK0 f30728b = C4096kK0.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30729a;

    public final Iterable a(byte[] bArr) {
        Map map = this.f30729a;
        List list = (List) map.get(f30728b);
        List list2 = bArr.length >= 5 ? (List) map.get(C4096kK0.b(bArr, 0, 5)) : null;
        if (list == null && list2 == null) {
            return new ArrayList();
        }
        if (list == null) {
            return list2;
        }
        return list2 == null ? list : new C3706hD0(this, list2, list);
    }
}
