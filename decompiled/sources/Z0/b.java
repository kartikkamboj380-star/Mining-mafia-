package Z0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f7106d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f7107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f7108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f7109c;

    /* JADX INFO: renamed from: Z0.b$b, reason: collision with other inner class name */
    private static class ExecutorC0126b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ThreadLocal f7110a;

        private ExecutorC0126b() {
            this.f7110a = new ThreadLocal();
        }

        private int a() {
            Integer num = (Integer) this.f7110a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f7110a.remove();
                return iIntValue;
            }
            this.f7110a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        private int b() {
            Integer num = (Integer) this.f7110a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f7110a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private b() {
        this.f7107a = !c() ? Executors.newCachedThreadPool() : Z0.a.b();
        this.f7108b = Executors.newSingleThreadScheduledExecutor();
        this.f7109c = new ExecutorC0126b();
    }

    public static ExecutorService a() {
        return f7106d.f7107a;
    }

    static Executor b() {
        return f7106d.f7109c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
