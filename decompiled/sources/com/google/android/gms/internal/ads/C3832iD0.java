package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3832iD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f29311a = new HashMap();

    public final C3832iD0 a(C4096kK0 c4096kK0, Object obj) throws GeneralSecurityException {
        List list;
        if (c4096kK0.d() != 0 && c4096kK0.d() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.f29311a;
        if (map.containsKey(c4096kK0)) {
            list = (List) map.get(c4096kK0);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(c4096kK0, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final C4082kD0 b() {
        return new C4082kD0(this.f29311a, null);
    }
}
