package p023c2;

import Z1.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    c(Object obj, g gVar, a.c cVar, Throwable th) {
        super(obj, gVar, cVar, th, true);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f11811a) {
                    super.finalize();
                    return;
                }
                Object objF = this.f11812b.f();
                a.K("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f11812b)), objF == null ? null : objF.getClass().getName());
                this.f11812b.d();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p023c2.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p023c2.a
    /* JADX INFO: renamed from: h */
    public a clone() {
        return this;
    }
}
