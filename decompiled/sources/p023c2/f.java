package p023c2;

import Y1.k;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {
    private f(h hVar, a.c cVar, Throwable th) {
        super(hVar, cVar, th);
    }

    @Override // p023c2.a
    /* JADX INFO: renamed from: h */
    public a clone() {
        k.i(R());
        return new f(this.f11812b, this.f11813c, this.f11814d);
    }

    f(Object obj, g gVar, a.c cVar, Throwable th) {
        super(obj, gVar, cVar, th, false);
    }
}
