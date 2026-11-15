package K0;

/* JADX INFO: loaded from: classes.dex */
public class o implements androidx.work.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.z f2483c = new androidx.lifecycle.z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f2484d = androidx.work.impl.utils.futures.c.t();

    public o() {
        a(androidx.work.t.f11426b);
    }

    public void a(androidx.work.t.b bVar) {
        this.f2483c.l(bVar);
        if (bVar instanceof androidx.work.t.b.c) {
            this.f2484d.p((androidx.work.t.b.c) bVar);
        } else if (bVar instanceof androidx.work.t.b.a) {
            this.f2484d.q(((androidx.work.t.b.a) bVar).a());
        }
    }
}
