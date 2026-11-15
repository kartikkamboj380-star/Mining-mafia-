package p117l6;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p087i6.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H {

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f46105b;

        /* JADX INFO: renamed from: l6.H$a$a, reason: collision with other inner class name */
        class C0467a extends AbstractRunnableC7043d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f46106a;

            C0467a(Runnable runnable) {
                this.f46106a = runnable;
            }

            @Override // p117l6.AbstractRunnableC7043d
            public void a() {
                this.f46106a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f46104a = str;
            this.f46105b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0467a(runnable));
            threadNewThread.setName(this.f46104a + this.f46105b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends AbstractRunnableC7043d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f46109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f46110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f46111d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f46108a = str;
            this.f46109b = executorService;
            this.f46110c = j10;
            this.f46111d = timeUnit;
        }

        @Override // p117l6.AbstractRunnableC7043d
        public void a() {
            try {
                g.f().b("Executing shutdown hook for " + this.f46108a);
                this.f46109b.shutdown();
                if (this.f46109b.awaitTermination(this.f46110c, this.f46111d)) {
                    return;
                }
                g.f().b(this.f46108a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f46109b.shutdownNow();
            } catch (InterruptedException unused) {
                g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f46108a));
                this.f46109b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
