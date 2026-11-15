package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f9479a = 100;

    f0() {
    }

    private final void l(Object obj, X x10, int i10) {
        while (x10.A() != Integer.MAX_VALUE && m(obj, x10, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC1110f abstractC1110f);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, X x10, int i10) throws C1125v {
        int iK = x10.k();
        int iA = k0.a(iK);
        int iB = k0.b(iK);
        if (iB == 0) {
            e(obj, iA, x10.H());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, x10.a());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, x10.o());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1125v.e();
            }
            a(obj, iA, x10.u());
            return true;
        }
        Object objN = n();
        int iC = k0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f9479a) {
            throw C1125v.i();
        }
        l(objN, x10, i11);
        if (iC != x10.k()) {
            throw C1125v.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(X x10);

    abstract Object r(Object obj);

    abstract void s(Object obj, l0 l0Var);

    abstract void t(Object obj, l0 l0Var);
}
