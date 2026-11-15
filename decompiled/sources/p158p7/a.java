package p158p7;

import p208u7.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f47906a;

    private a(l lVar) {
        this.f47906a = lVar;
    }

    public static a a(b bVar) {
        l lVar = (l) bVar;
        g.b(bVar, "AdSession is null");
        g.j(lVar);
        g.g(lVar);
        a aVar = new a(lVar);
        lVar.p().g(aVar);
        return aVar;
    }

    public void b() {
        g.g(this.f47906a);
        g.i(this.f47906a);
        if (!this.f47906a.m()) {
            try {
                this.f47906a.d();
            } catch (Exception unused) {
            }
        }
        if (this.f47906a.m()) {
            this.f47906a.s();
        }
    }

    public void c() {
        g.f(this.f47906a);
        g.i(this.f47906a);
        this.f47906a.t();
    }
}
