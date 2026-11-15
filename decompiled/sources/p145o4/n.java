package p145o4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f47256a;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f47257a;

        a(Runnable runnable) {
            this.f47257a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f47257a.run();
            } catch (Exception e10) {
                p185s4.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    n(Executor executor) {
        this.f47256a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f47256a.execute(new a(runnable));
    }
}
