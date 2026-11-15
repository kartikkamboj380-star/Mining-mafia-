package p127m6;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p176r5.AbstractC7096m;
import p176r5.InterfaceC7086c;

/* JADX INFO: loaded from: classes3.dex */
public class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f46423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f46424b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task f46425c = AbstractC7096m.f(null);

    e(ExecutorService executorService) {
        this.f46423a = executorService;
    }

    public static /* synthetic */ Task a(Runnable runnable, Task task) {
        runnable.run();
        return AbstractC7096m.f(null);
    }

    public static /* synthetic */ Task b(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public ExecutorService c() {
        return this.f46423a;
    }

    public Task d(final Runnable runnable) {
        Task taskJ;
        synchronized (this.f46424b) {
            taskJ = this.f46425c.j(this.f46423a, new InterfaceC7086c() { // from class: m6.d
                @Override // p176r5.InterfaceC7086c
                public final Object a(Task task) {
                    return e.a(runnable, task);
                }
            });
            this.f46425c = taskJ;
        }
        return taskJ;
    }

    public Task e(final Callable callable) {
        Task taskJ;
        synchronized (this.f46424b) {
            taskJ = this.f46425c.j(this.f46423a, new InterfaceC7086c() { // from class: m6.c
                @Override // p176r5.InterfaceC7086c
                public final Object a(Task task) {
                    return e.b(callable, task);
                }
            });
            this.f46425c = taskJ;
        }
        return taskJ;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f46423a.execute(runnable);
    }
}
