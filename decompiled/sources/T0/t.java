package T0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class t implements U0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f5596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f5597c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f5595a = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f5598d = new Object();

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t f5599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f5600b;

        a(t tVar, Runnable runnable) {
            this.f5599a = tVar;
            this.f5600b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5600b.run();
                synchronized (this.f5599a.f5598d) {
                    this.f5599a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f5599a.f5598d) {
                    this.f5599a.a();
                    throw th;
                }
            }
        }
    }

    public t(Executor executor) {
        this.f5596b = executor;
    }

    @Override // U0.a
    public boolean I0() {
        boolean z9;
        synchronized (this.f5598d) {
            z9 = !this.f5595a.isEmpty();
        }
        return z9;
    }

    void a() {
        Runnable runnable = (Runnable) this.f5595a.poll();
        this.f5597c = runnable;
        if (runnable != null) {
            this.f5596b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f5598d) {
            try {
                this.f5595a.add(new a(this, runnable));
                if (this.f5597c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
