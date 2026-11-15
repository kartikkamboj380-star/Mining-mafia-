package u9;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f50062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f50063b;

    k() {
    }

    synchronized void a(j jVar) {
        try {
            if (jVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            j jVar2 = this.f50063b;
            if (jVar2 != null) {
                jVar2.f50061c = jVar;
                this.f50063b = jVar;
            } else {
                if (this.f50062a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f50063b = jVar;
                this.f50062a = jVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized j b() {
        j jVar;
        jVar = this.f50062a;
        if (jVar != null) {
            j jVar2 = jVar.f50061c;
            this.f50062a = jVar2;
            if (jVar2 == null) {
                this.f50063b = null;
            }
        }
        return jVar;
    }

    synchronized j c(int i10) {
        try {
            if (this.f50062a == null) {
                wait(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b();
    }
}
