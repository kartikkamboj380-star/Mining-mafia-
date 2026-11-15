package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC6351w {
    protected D() {
        this.f36930a.add(M.AND);
        this.f36930a.add(M.NOT);
        this.f36930a.add(M.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6351w
    public final InterfaceC6289p a(String str, C6157a2 c6157a2, List list) {
        M m10 = M.ADD;
        int iOrdinal = B2.e(str).ordinal();
        if (iOrdinal == 1) {
            B2.a(M.AND.name(), 2, list);
            InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(0));
            return interfaceC6289pA.zze().booleanValue() ? c6157a2.a((InterfaceC6289p) list.get(1)) : interfaceC6289pA;
        }
        if (iOrdinal == 47) {
            B2.a(M.NOT.name(), 1, list);
            return new C6208g(Boolean.valueOf(!c6157a2.a((InterfaceC6289p) list.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        B2.a(M.OR.name(), 2, list);
        InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(0));
        return !interfaceC6289pA2.zze().booleanValue() ? c6157a2.a((InterfaceC6289p) list.get(1)) : interfaceC6289pA2;
    }
}
