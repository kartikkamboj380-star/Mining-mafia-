package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC6170b6 f36489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f36490b = 0;

    static {
        int i10 = N5.f36424d;
        f36489a = new C6188d6();
    }

    static int A(List list) {
        return list.size() * 4;
    }

    static int B(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (P4.E(i10 << 3) + 4);
    }

    static int C(List list) {
        return list.size() * 8;
    }

    static int D(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (P4.E(i10 << 3) + 8);
    }

    static int E(int i10, Object obj, Q5 q10) {
        return P4.E(i10 << 3) + P4.d((F5) obj, q10);
    }

    public static AbstractC6170b6 a() {
        return f36489a;
    }

    static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void c(U4 u10, Object obj, Object obj2) {
        p070h.w.a(obj2);
        throw null;
    }

    static void d(AbstractC6170b6 abstractC6170b6, Object obj, Object obj2) {
        AbstractC6205f5 abstractC6205f5 = (AbstractC6205f5) obj;
        C6179c6 c6179c6C = abstractC6205f5.zzc;
        C6179c6 c6179c6 = ((AbstractC6205f5) obj2).zzc;
        if (!C6179c6.a().equals(c6179c6)) {
            if (C6179c6.a().equals(c6179c6C)) {
                c6179c6C = C6179c6.c(c6179c6C, c6179c6);
            } else {
                c6179c6C.k(c6179c6);
            }
        }
        abstractC6205f5.zzc = c6179c6C;
    }

    static Object e(Object obj, int i10, int i11, Object obj2, AbstractC6170b6 abstractC6170b6) {
        if (obj2 == null) {
            obj2 = abstractC6170b6.a(obj);
        }
        ((C6179c6) obj2).j(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.zzC(i10, list, z9);
    }

    public static void g(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.r(i10, list, z9);
    }

    public static void h(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.zzy(i10, list, z9);
    }

    public static void i(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.o(i10, list, z9);
    }

    public static void j(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.b(i10, list, z9);
    }

    public static void k(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.zzA(i10, list, z9);
    }

    public static void l(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.f(i10, list, z9);
    }

    public static void m(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.y(i10, list, z9);
    }

    public static void n(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.q(i10, list, z9);
    }

    public static void o(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.zzK(i10, list, z9);
    }

    public static void p(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.v(i10, list, z9);
    }

    public static void q(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.zzI(i10, list, z9);
    }

    public static void r(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.x(i10, list, z9);
    }

    public static void s(int i10, List list, InterfaceC6287o6 interfaceC6287o6, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6287o6.zzE(i10, list, z9);
    }

    static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6330t5)) {
            int iA = 0;
            while (i10 < size) {
                iA += P4.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += P4.a(c6330t5.G(i10));
            i10++;
        }
        return iA2;
    }

    static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6330t5)) {
            int iA = 0;
            while (i10 < size) {
                iA += P4.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += P4.a(c6330t5.G(i10));
            i10++;
        }
        return iA2;
    }

    static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6330t5)) {
            int iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += P4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iA;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        int iA2 = 0;
        while (i10 < size) {
            long jG = c6330t5.G(i10);
            iA2 += P4.a((jG >> 63) ^ (jG + jG));
            i10++;
        }
        return iA2;
    }

    static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6214g5)) {
            int iA = 0;
            while (i10 < size) {
                iA += P4.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += P4.a(c6214g5.d(i10));
            i10++;
        }
        return iA2;
    }

    static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6214g5)) {
            int iA = 0;
            while (i10 < size) {
                iA += P4.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += P4.a(c6214g5.d(i10));
            i10++;
        }
        return iA2;
    }

    static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6214g5)) {
            int iE = 0;
            while (i10 < size) {
                iE += P4.E(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iE;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        int iE2 = 0;
        while (i10 < size) {
            iE2 += P4.E(c6214g5.d(i10));
            i10++;
        }
        return iE2;
    }

    static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6214g5)) {
            int iE = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iE += P4.E((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iE;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        int iE2 = 0;
        while (i10 < size) {
            int iD = c6214g5.d(i10);
            iE2 += P4.E((iD >> 31) ^ (iD + iD));
            i10++;
        }
        return iE2;
    }
}
