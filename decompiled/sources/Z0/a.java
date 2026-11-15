package Z0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f7101b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f7102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f7103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f7104e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f7105a = new b();

    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f7102c = iAvailableProcessors;
        f7103d = iAvailableProcessors + 1;
        f7104e = (iAvailableProcessors * 2) + 1;
    }

    private a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z9) {
        threadPoolExecutor.allowCoreThreadTimeOut(z9);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f7103d, f7104e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f7101b.f7105a;
    }
}
