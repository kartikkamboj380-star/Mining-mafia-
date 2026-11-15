package H4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A extends B4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1214a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B4.d f1215b;

    @Override // B4.d
    public final void i() {
        synchronized (this.f1214a) {
            try {
                B4.d dVar = this.f1215b;
                if (dVar != null) {
                    dVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B4.d
    public void j(B4.k kVar) {
        synchronized (this.f1214a) {
            try {
                B4.d dVar = this.f1215b;
                if (dVar != null) {
                    dVar.j(kVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B4.d
    public final void k() {
        synchronized (this.f1214a) {
            try {
                B4.d dVar = this.f1215b;
                if (dVar != null) {
                    dVar.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B4.d
    public void m() {
        synchronized (this.f1214a) {
            try {
                B4.d dVar = this.f1215b;
                if (dVar != null) {
                    dVar.m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B4.d
    public final void o() {
        synchronized (this.f1214a) {
            try {
                B4.d dVar = this.f1215b;
                if (dVar != null) {
                    dVar.o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B4.d
    public final void onAdClicked() {
        synchronized (this.f1214a) {
            try {
                B4.d dVar = this.f1215b;
                if (dVar != null) {
                    dVar.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(B4.d dVar) {
        synchronized (this.f1214a) {
            this.f1215b = dVar;
        }
    }
}
