package p176r5;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: r5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7096m {
    public static Object a(Task task) throws InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.n()) {
            return l(task);
        }
        o oVar = new o(null);
        m(task, oVar);
        oVar.b();
        return l(task);
    }

    public static Object b(Task task, long j10, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.n()) {
            return l(task);
        }
        o oVar = new o(null);
        m(task, oVar);
        if (oVar.c(j10, timeUnit)) {
            return l(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task c(Callable callable) {
        return d(AbstractC7095l.f48300a, callable);
    }

    public static Task d(Executor executor, Callable callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        L l10 = new L();
        executor.execute(new M(l10, callable));
        return l10;
    }

    public static Task e(Exception exc) {
        L l10 = new L();
        l10.s(exc);
        return l10;
    }

    public static Task f(Object obj) {
        L l10 = new L();
        l10.q(obj);
        return l10;
    }

    public static Task g(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return f(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        L l10 = new L();
        q qVar = new q(collection.size(), l10);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            m((Task) it2.next(), qVar);
        }
        return l10;
    }

    public static Task h(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? f(null) : g(Arrays.asList(taskArr));
    }

    public static Task i(Collection collection) {
        return j(AbstractC7095l.f48300a, collection);
    }

    public static Task j(Executor executor, Collection collection) {
        return (collection == null || collection.isEmpty()) ? f(Collections.EMPTY_LIST) : g(collection).j(executor, new N(collection));
    }

    public static Task k(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? f(Collections.EMPTY_LIST) : i(Arrays.asList(taskArr));
    }

    private static Object l(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void m(Task task, p pVar) {
        Executor executor = AbstractC7095l.f48301b;
        task.f(executor, pVar);
        task.d(executor, pVar);
        task.a(executor, pVar);
    }
}
