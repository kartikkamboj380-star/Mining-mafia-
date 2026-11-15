package W1;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c implements RunnableFuture, ScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f6544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask f6545b;

    public c(Handler handler, Callable callable) {
        this.f6544a = handler;
        this.f6545b = new FutureTask(callable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return this.f6545b.cancel(z9);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f6545b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6545b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f6545b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f6545b.run();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f6545b.get(j10, timeUnit);
    }

    public c(Handler handler, Runnable runnable, Object obj) {
        this.f6544a = handler;
        this.f6545b = new FutureTask(runnable, obj);
    }
}
