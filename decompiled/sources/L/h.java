package L;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3028b;

        /* JADX INFO: renamed from: L.h$a$a, reason: collision with other inner class name */
        private static class C0041a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f3029a;

            C0041a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f3029a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3029a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f3027a = str;
            this.f3028b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0041a(runnable, this.f3027a, this.f3028b);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable f3030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private N.a f3031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f3032c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ N.a f3033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f3034b;

            a(N.a aVar, Object obj) {
                this.f3033a = aVar;
                this.f3034b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3033a.accept(this.f3034b);
            }
        }

        b(Handler handler, Callable callable, N.a aVar) {
            this.f3030a = callable;
            this.f3031b = aVar;
            this.f3032c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f3030a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f3032c.post(new a(this.f3031b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, N.a aVar) {
        executor.execute(new b(L.b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
