package W1;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f6543a;

    public b(Handler handler) {
        this.f6543a = handler;
    }

    public boolean a() {
        return Thread.currentThread() == this.f6543a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c newTaskFor(Runnable runnable, Object obj) {
        return new c(this.f6543a, runnable, obj);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        p131n0.d.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6543a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c newTaskFor(Callable callable) {
        return new c(this.f6543a, callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarNewTaskFor = newTaskFor(runnable, null);
        this.f6543a.postDelayed(cVarNewTaskFor, timeUnit.toMillis(j10));
        return cVarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable, Object obj) {
        runnable.getClass();
        c cVarNewTaskFor = newTaskFor(runnable, obj);
        execute(cVarNewTaskFor);
        return cVarNewTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Callable callable) {
        callable.getClass();
        c cVarNewTaskFor = newTaskFor(callable);
        execute(cVarNewTaskFor);
        return cVarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        c cVarNewTaskFor = newTaskFor(callable);
        this.f6543a.postDelayed(cVarNewTaskFor, timeUnit.toMillis(j10));
        return cVarNewTaskFor;
    }
}
