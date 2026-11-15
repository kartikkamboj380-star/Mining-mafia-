package s9;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r9.C7105h;
import r9.C7108k;
import r9.T;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C7108k f49361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C7108k f49362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C7108k f49363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C7108k f49364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C7108k f49365e;

    static {
        C7108k.a aVar = C7108k.f48467d;
        f49361a = aVar.g("/");
        f49362b = aVar.g("\\");
        f49363c = aVar.g("/\\");
        f49364d = aVar.g(".");
        f49365e = aVar.g("..");
    }

    public static final T j(T t10, T child, boolean z9) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.o() != null) {
            return child;
        }
        C7108k c7108kM = m(t10);
        if (c7108kM == null && (c7108kM = m(child)) == null) {
            c7108kM = s(T.f48392c);
        }
        C7105h c7105h = new C7105h();
        c7105h.F(t10.d());
        if (c7105h.size() > 0) {
            c7105h.F(c7108kM);
        }
        c7105h.F(child.d());
        return q(c7105h, z9);
    }

    public static final T k(String str, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return q(new C7105h().I(str), z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(T t10) {
        int iV = C7108k.v(t10.d(), f49361a, 0, 2, null);
        return iV != -1 ? iV : C7108k.v(t10.d(), f49362b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7108k m(T t10) {
        C7108k c7108kD = t10.d();
        C7108k c7108k = f49361a;
        if (C7108k.q(c7108kD, c7108k, 0, 2, null) != -1) {
            return c7108k;
        }
        C7108k c7108kD2 = t10.d();
        C7108k c7108k2 = f49362b;
        if (C7108k.q(c7108kD2, c7108k2, 0, 2, null) != -1) {
            return c7108k2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(T t10) {
        return t10.d().h(f49365e) && (t10.d().E() == 2 || t10.d().y(t10.d().E() + (-3), f49361a, 0, 1) || t10.d().y(t10.d().E() + (-3), f49362b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(T t10) {
        if (t10.d().E() == 0) {
            return -1;
        }
        if (t10.d().i(0) == 47) {
            return 1;
        }
        if (t10.d().i(0) == 92) {
            if (t10.d().E() <= 2 || t10.d().i(1) != 92) {
                return 1;
            }
            int iO = t10.d().o(f49362b, 2);
            return iO == -1 ? t10.d().E() : iO;
        }
        if (t10.d().E() > 2 && t10.d().i(1) == 58 && t10.d().i(2) == 92) {
            char cI = (char) t10.d().i(0);
            if ('a' <= cI && cI < '{') {
                return 3;
            }
            if ('A' <= cI && cI < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(C7105h c7105h, C7108k c7108k) {
        if (!Intrinsics.b(c7108k, f49362b) || c7105h.size() < 2 || c7105h.V(1L) != 58) {
            return false;
        }
        char cV = (char) c7105h.V(0L);
        if ('a' > cV || cV >= '{') {
            return 'A' <= cV && cV < '[';
        }
        return true;
    }

    public static final T q(C7105h c7105h, boolean z9) throws EOFException {
        C7108k c7108k;
        C7108k c7108kQ0;
        Intrinsics.checkNotNullParameter(c7105h, "<this>");
        C7105h c7105h2 = new C7105h();
        C7108k c7108kR = null;
        int i10 = 0;
        while (true) {
            if (!c7105h.m0(0L, f49361a)) {
                c7108k = f49362b;
                if (!c7105h.m0(0L, c7108k)) {
                    break;
                }
            }
            byte b10 = c7105h.readByte();
            if (c7108kR == null) {
                c7108kR = r(b10);
            }
            i10++;
        }
        boolean z10 = i10 >= 2 && Intrinsics.b(c7108kR, c7108k);
        if (z10) {
            Intrinsics.c(c7108kR);
            c7105h2.F(c7108kR);
            c7105h2.F(c7108kR);
        } else if (i10 > 0) {
            Intrinsics.c(c7108kR);
            c7105h2.F(c7108kR);
        } else {
            long jA0 = c7105h.a0(f49363c);
            if (c7108kR == null) {
                c7108kR = jA0 == -1 ? s(T.f48392c) : r(c7105h.V(jA0));
            }
            if (p(c7105h, c7108kR)) {
                if (jA0 == 2) {
                    c7105h2.W0(c7105h, 3L);
                } else {
                    c7105h2.W0(c7105h, 2L);
                }
            }
        }
        boolean z11 = c7105h2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c7105h.x0()) {
            long jA1 = c7105h.a0(f49363c);
            if (jA1 == -1) {
                c7108kQ0 = c7105h.l1();
            } else {
                c7108kQ0 = c7105h.q0(jA1);
                c7105h.readByte();
            }
            C7108k c7108k2 = f49365e;
            if (Intrinsics.b(c7108kQ0, c7108k2)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z9 || (!z11 && (arrayList.isEmpty() || Intrinsics.b(CollectionsKt.g0(arrayList), c7108k2)))) {
                        arrayList.add(c7108kQ0);
                    } else if (!z10 || arrayList.size() != 1) {
                        CollectionsKt.D(arrayList);
                    }
                }
            } else if (!Intrinsics.b(c7108kQ0, f49364d) && !Intrinsics.b(c7108kQ0, C7108k.f48468e)) {
                arrayList.add(c7108kQ0);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c7105h2.F(c7108kR);
            }
            c7105h2.F((C7108k) arrayList.get(i11));
        }
        if (c7105h2.size() == 0) {
            c7105h2.F(f49364d);
        }
        return new T(c7105h2.l1());
    }

    private static final C7108k r(byte b10) {
        if (b10 == 47) {
            return f49361a;
        }
        if (b10 == 92) {
            return f49362b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7108k s(String str) {
        if (Intrinsics.b(str, "/")) {
            return f49361a;
        }
        if (Intrinsics.b(str, "\\")) {
            return f49362b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
