package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class W7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TreeMap f36535a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TreeMap f36536b = new TreeMap();

    private static final int c(C6157a2 c6157a2, C6280o c6280o, InterfaceC6289p interfaceC6289p) {
        InterfaceC6289p interfaceC6289pC = c6280o.c(c6157a2, Collections.singletonList(interfaceC6289p));
        if (interfaceC6289pC instanceof C6226i) {
            return B2.g(interfaceC6289pC.zzd().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, C6280o c6280o, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f36536b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f36535a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c6280o);
    }

    public final void b(C6157a2 c6157a2, C6172c c6172c) {
        C4 c10 = new C4(c6172c);
        TreeMap treeMap = this.f36535a;
        for (Integer num : treeMap.keySet()) {
            C6163b c6163bClone = c6172c.c().clone();
            int iC = c(c6157a2, (C6280o) treeMap.get(num), c10);
            if (iC == 2 || iC == -1) {
                c6172c.d(c6163bClone);
            }
        }
        TreeMap treeMap2 = this.f36536b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(c6157a2, (C6280o) treeMap2.get((Integer) it.next()), c10);
        }
    }
}
