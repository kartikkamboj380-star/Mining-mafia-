package B4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {
    public static f a(int i10, int i11, String str) {
        return new f(i10, i11, str);
    }

    public static f b(int i10, int i11) {
        f fVar = new f(i10, i11);
        fVar.k(true);
        fVar.l(i11);
        return fVar;
    }

    public static f c(int i10, int i11) {
        f fVar = new f(i10, i11);
        fVar.o(true);
        fVar.q(i11);
        return fVar;
    }

    public static boolean d(f fVar) {
        return fVar.n();
    }

    public static int e(f fVar) {
        return fVar.p();
    }

    public static boolean f(f fVar) {
        return fVar.i();
    }

    public static boolean g(f fVar) {
        return fVar.j();
    }

    public static int h(f fVar) {
        return fVar.m();
    }
}
