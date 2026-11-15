package u9;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Runnable, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f50007a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f50008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f50009c;

    b(c cVar) {
        this.f50008b = cVar;
    }

    @Override // u9.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f50007a.a(jVarA);
                if (!this.f50009c) {
                    this.f50009c = true;
                    this.f50008b.e().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    j jVarC = this.f50007a.c(1000);
                    if (jVarC == null) {
                        synchronized (this) {
                            jVarC = this.f50007a.b();
                            if (jVarC == null) {
                                this.f50009c = false;
                                this.f50009c = false;
                                return;
                            }
                        }
                    }
                    this.f50008b.h(jVarC);
                } catch (InterruptedException e10) {
                    this.f50008b.f().a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e10);
                    this.f50009c = false;
                    return;
                }
            } catch (Throwable th) {
                this.f50009c = false;
                throw th;
            }
        }
    }
}
