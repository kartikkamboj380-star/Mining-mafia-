package H2;

/* JADX INFO: loaded from: classes.dex */
public class B implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static B f1123a;

    private B() {
    }

    public static synchronized B o() {
        try {
            if (f1123a == null) {
                f1123a = new B();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1123a;
    }

    @Override // H2.t
    public void a(S1.d dVar) {
    }

    @Override // H2.t
    public void b(S1.d dVar) {
    }

    @Override // H2.t
    public void c(S1.d dVar) {
    }

    @Override // H2.t
    public void d(S1.d dVar) {
    }

    @Override // H2.t
    public void e(x xVar) {
    }

    @Override // H2.t
    public void f(S1.d dVar) {
    }

    @Override // H2.t
    public void g(x xVar) {
    }

    @Override // H2.t
    public void h(S1.d dVar) {
    }

    @Override // H2.t
    public void i(S1.d dVar) {
    }

    @Override // H2.t
    public void j(S1.d dVar) {
    }

    @Override // H2.t
    public void k(S1.d dVar) {
    }

    @Override // H2.t
    public void l(S1.d dVar) {
    }

    @Override // H2.t
    public void m(S1.d dVar) {
    }

    @Override // H2.t
    public void n(S1.d dVar) {
    }
}
