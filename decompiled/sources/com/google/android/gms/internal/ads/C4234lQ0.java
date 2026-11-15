package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4234lQ0 extends AbstractC3229dQ0 {
    static {
        C3858iQ0.a(Collections.EMPTY_MAP);
    }

    /* synthetic */ C4234lQ0(Map map, AbstractC3982jQ0 abstractC3982jQ0) {
        super(map);
    }

    public static C4108kQ0 b(int i10) {
        return new C4108kQ0(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapC = AbstractC3354eQ0.c(a().size());
        for (Map.Entry entry : a().entrySet()) {
            linkedHashMapC.put(entry.getKey(), ((InterfaceC4864qQ0) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }
}
