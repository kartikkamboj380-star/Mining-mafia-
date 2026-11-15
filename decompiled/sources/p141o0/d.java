package p141o0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f47140e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f47142b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f47143c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f47144d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FutureTask f47141a = new b(new a());

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            d.this.f47144d.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = d.this.b();
                Binder.flushPendingCommands();
                d.this.i(objB);
                return objB;
            } catch (Throwable th) {
                try {
                    d.this.f47143c.set(true);
                    throw th;
                } catch (Throwable th2) {
                    d.this.i(objB);
                    throw th2;
                }
            }
        }
    }

    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                d.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f47147a;

        c(Object obj) {
            this.f47147a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.d(this.f47147a);
        }
    }

    /* JADX INFO: renamed from: o0.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0487d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47149a;

        static {
            int[] iArr = new int[e.values().length];
            f47149a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47149a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    d() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (d.class) {
            try {
                if (f47140e == null) {
                    f47140e = new Handler(Looper.getMainLooper());
                }
                handler = f47140e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z9) {
        this.f47143c.set(true);
        return this.f47141a.cancel(z9);
    }

    protected abstract Object b();

    public final void c(Executor executor) {
        if (this.f47142b == e.PENDING) {
            this.f47142b = e.RUNNING;
            executor.execute(this.f47141a);
            return;
        }
        int i10 = C0487d.f47149a[this.f47142b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f47142b = e.FINISHED;
    }

    public final boolean f() {
        return this.f47143c.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    void i(Object obj) {
        e().post(new c(obj));
    }

    void j(Object obj) {
        if (this.f47144d.get()) {
            return;
        }
        i(obj);
    }
}
