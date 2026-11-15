package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6376z extends AbstractC6351w {
    protected C6376z() {
        this.f36930a.add(M.APPLY);
        this.f36930a.add(M.BLOCK);
        this.f36930a.add(M.BREAK);
        this.f36930a.add(M.CASE);
        this.f36930a.add(M.DEFAULT);
        this.f36930a.add(M.CONTINUE);
        this.f36930a.add(M.DEFINE_FUNCTION);
        this.f36930a.add(M.FN);
        this.f36930a.add(M.IF);
        this.f36930a.add(M.QUOTE);
        this.f36930a.add(M.RETURN);
        this.f36930a.add(M.SWITCH);
        this.f36930a.add(M.TERNARY);
    }

    private static InterfaceC6289p c(C6157a2 c6157a2, List list) {
        B2.b(M.FN.name(), 2, list);
        InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(0));
        InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(1));
        if (!(interfaceC6289pA2 instanceof C6199f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC6289pA2.getClass().getCanonicalName()));
        }
        List listJ = ((C6199f) interfaceC6289pA2).j();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C6280o(interfaceC6289pA.zzc(), listJ, arrayList, c6157a2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6351w
    public final InterfaceC6289p a(String str, C6157a2 c6157a2, List list) {
        M m10 = M.ADD;
        int iOrdinal = B2.e(str).ordinal();
        if (iOrdinal == 2) {
            B2.a(M.APPLY.name(), 3, list);
            InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(0));
            String strZzc = c6157a2.a((InterfaceC6289p) list.get(1)).zzc();
            InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(2));
            if (!(interfaceC6289pA2 instanceof C6199f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC6289pA2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return interfaceC6289pA.e(strZzc, c6157a2, ((C6199f) interfaceC6289pA2).j());
        }
        if (iOrdinal == 15) {
            B2.a(M.BREAK.name(), 0, list);
            return InterfaceC6289p.f36810z;
        }
        if (iOrdinal == 25) {
            return c(c6157a2, list);
        }
        if (iOrdinal == 41) {
            B2.b(M.IF.name(), 2, list);
            InterfaceC6289p interfaceC6289pA3 = c6157a2.a((InterfaceC6289p) list.get(0));
            InterfaceC6289p interfaceC6289pA4 = c6157a2.a((InterfaceC6289p) list.get(1));
            InterfaceC6289p interfaceC6289pA5 = list.size() > 2 ? c6157a2.a((InterfaceC6289p) list.get(2)) : null;
            InterfaceC6289p interfaceC6289p = InterfaceC6289p.f36808x;
            InterfaceC6289p interfaceC6289pB = interfaceC6289pA3.zze().booleanValue() ? c6157a2.b((C6199f) interfaceC6289pA4) : interfaceC6289pA5 != null ? c6157a2.b((C6199f) interfaceC6289pA5) : interfaceC6289p;
            return true != (interfaceC6289pB instanceof C6217h) ? interfaceC6289p : interfaceC6289pB;
        }
        if (iOrdinal == 54) {
            return new C6199f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC6289p.f36804B;
            }
            B2.a(M.RETURN.name(), 1, list);
            return new C6217h("return", c6157a2.a((InterfaceC6289p) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                B2.b(M.DEFINE_FUNCTION.name(), 2, list);
                C6280o c6280o = (C6280o) c(c6157a2, list);
                if (c6280o.f() == null) {
                    c6157a2.e("", c6280o);
                    return c6280o;
                }
                c6157a2.e(c6280o.f(), c6280o);
                return c6280o;
            }
            if (iOrdinal == 60) {
                B2.a(M.SWITCH.name(), 3, list);
                InterfaceC6289p interfaceC6289pA6 = c6157a2.a((InterfaceC6289p) list.get(0));
                InterfaceC6289p interfaceC6289pA7 = c6157a2.a((InterfaceC6289p) list.get(1));
                InterfaceC6289p interfaceC6289pA8 = c6157a2.a((InterfaceC6289p) list.get(2));
                if (!(interfaceC6289pA7 instanceof C6199f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC6289pA8 instanceof C6199f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C6199f c6199f = (C6199f) interfaceC6289pA7;
                C6199f c6199f2 = (C6199f) interfaceC6289pA8;
                boolean z9 = false;
                for (int i10 = 0; i10 < c6199f.l(); i10++) {
                    if (z9 || interfaceC6289pA6.equals(c6157a2.a(c6199f.o(i10)))) {
                        InterfaceC6289p interfaceC6289pA9 = c6157a2.a(c6199f2.o(i10));
                        if (interfaceC6289pA9 instanceof C6217h) {
                            return ((C6217h) interfaceC6289pA9).c().equals("break") ? InterfaceC6289p.f36808x : interfaceC6289pA9;
                        }
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                if (c6199f.l() + 1 == c6199f2.l()) {
                    InterfaceC6289p interfaceC6289pA10 = c6157a2.a(c6199f2.o(c6199f.l()));
                    if (interfaceC6289pA10 instanceof C6217h) {
                        String strC = ((C6217h) interfaceC6289pA10).c();
                        if (strC.equals("return") || strC.equals("continue")) {
                            return interfaceC6289pA10;
                        }
                    }
                }
                return InterfaceC6289p.f36808x;
            }
            if (iOrdinal == 61) {
                B2.a(M.TERNARY.name(), 3, list);
                return c6157a2.a((InterfaceC6289p) list.get(0)).zze().booleanValue() ? c6157a2.a((InterfaceC6289p) list.get(1)) : c6157a2.a((InterfaceC6289p) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return c6157a2.c().b(new C6199f(list));
                case 12:
                    B2.a(M.BREAK.name(), 0, list);
                    return InterfaceC6289p.f36803A;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC6289p.f36808x;
        }
        InterfaceC6289p interfaceC6289pA11 = c6157a2.a((InterfaceC6289p) list.get(0));
        return interfaceC6289pA11 instanceof C6199f ? c6157a2.b((C6199f) interfaceC6289pA11) : InterfaceC6289p.f36808x;
    }
}
