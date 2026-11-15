package N6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N6.a f3669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile N6.a f3670b;

    /* JADX INFO: renamed from: N6.b$b, reason: collision with other inner class name */
    private static class C0064b implements N6.a {
        private C0064b() {
        }

        @Override // N6.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0064b c0064b = new C0064b();
        f3669a = c0064b;
        f3670b = c0064b;
    }

    public static N6.a a() {
        return f3670b;
    }
}
