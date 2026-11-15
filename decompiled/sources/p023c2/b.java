package p023c2;

import Y1.k;
import Z1.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private b(h hVar, a.c cVar, Throwable th) {
        super(hVar, cVar, th);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f11811a) {
                    super.finalize();
                    return;
                }
                Object objF = this.f11812b.f();
                a.K("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f11812b)), objF == null ? null : objF.getClass().getName());
                a.c cVar = this.f11813c;
                if (cVar != null) {
                    cVar.a(this.f11812b, this.f11814d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p023c2.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a clone() {
        k.i(R());
        return new b(this.f11812b, this.f11813c, this.f11814d != null ? new Throwable() : null);
    }

    b(Object obj, g gVar, a.c cVar, Throwable th) {
        super(obj, gVar, cVar, th, true);
    }
}
