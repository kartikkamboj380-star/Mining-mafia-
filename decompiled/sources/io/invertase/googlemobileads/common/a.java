package io.invertase.googlemobileads.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p109k8.k;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f45289e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RejectedExecutionHandler f45293d = new RejectedExecutionHandler() { // from class: k8.o
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            this.f45714a.h(runnable, threadPoolExecutor);
        }
    };

    a(String str) {
        this.f45290a = str;
        k kVarC = k.c();
        this.f45291b = kVarC.b("android_task_executor_maximum_pool_size", 1);
        this.f45292c = kVarC.b("android_task_executor_keep_alive_seconds", 3);
    }

    private ExecutorService e(boolean z9) {
        if (z9) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f45291b, this.f45292c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f45293d);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        f().execute(runnable);
    }

    public ExecutorService b() {
        return c(this.f45291b <= 1, "");
    }

    public ExecutorService c(boolean z9, String str) {
        String strD = d(z9, str);
        Map map = f45289e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(strD);
                if (executorService != null) {
                    return executorService;
                }
                ExecutorService executorServiceE = e(z9);
                map.put(strD, executorServiceE);
                return executorServiceE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(boolean z9, String str) {
        if (z9) {
            return this.f45290a + "TransactionalExecutor" + str;
        }
        return this.f45290a + "Executor" + str;
    }

    public ExecutorService f() {
        return c(true, "");
    }

    public ExecutorService g(String str) {
        if (this.f45291b == 0) {
            str = "";
        }
        return c(true, str);
    }

    public void i(String str) {
        Map map = f45289e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Map map = f45289e;
        synchronized (map) {
            try {
                ArrayList arrayList = new ArrayList(map.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    if (str.startsWith(this.f45290a)) {
                        i(str);
                    } else {
                        f45289e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
