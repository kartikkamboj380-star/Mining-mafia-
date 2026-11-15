package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6253l {
    static InterfaceC6289p a(InterfaceC6253l interfaceC6253l, InterfaceC6289p interfaceC6289p, C6157a2 c6157a2, List list) {
        if (interfaceC6253l.G0(interfaceC6289p.zzc())) {
            InterfaceC6289p interfaceC6289pQ = interfaceC6253l.Q(interfaceC6289p.zzc());
            if (interfaceC6289pQ instanceof AbstractC6235j) {
                return ((AbstractC6235j) interfaceC6289pQ).c(c6157a2, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC6289p.zzc()));
        }
        if (!"hasOwnProperty".equals(interfaceC6289p.zzc())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC6289p.zzc()));
        }
        B2.a("hasOwnProperty", 1, list);
        return interfaceC6253l.G0(c6157a2.a((InterfaceC6289p) list.get(0)).zzc()) ? InterfaceC6289p.f36805C : InterfaceC6289p.f36806D;
    }

    static Iterator i(Map map) {
        return new C6244k(map.keySet().iterator());
    }

    boolean G0(String str);

    InterfaceC6289p Q(String str);

    void d(String str, InterfaceC6289p interfaceC6289p);
}
