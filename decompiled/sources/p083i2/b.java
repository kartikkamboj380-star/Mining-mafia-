package p083i2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {
    @Override // p083i2.e
    public void b(c cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    @Override // p083i2.e
    public void c(c cVar) {
        boolean zC = cVar.c();
        try {
            f(cVar);
        } finally {
            if (zC) {
                cVar.close();
            }
        }
    }

    protected abstract void e(c cVar);

    protected abstract void f(c cVar);

    @Override // p083i2.e
    public void a(c cVar) {
    }

    @Override // p083i2.e
    public void d(c cVar) {
    }
}
