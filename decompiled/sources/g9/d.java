package g9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f44440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f44443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f44444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44445f;

    public d(e taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f44440a = taskRunner;
        this.f44441b = name;
        this.f44444e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (d9.e.f43193h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f44440a) {
            try {
                if (b()) {
                    this.f44440a.h(this);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f44443d;
        if (aVar != null) {
            Intrinsics.c(aVar);
            if (aVar.a()) {
                this.f44445f = true;
            }
        }
        boolean z9 = false;
        for (int size = this.f44444e.size() - 1; -1 < size; size--) {
            if (((a) this.f44444e.get(size)).a()) {
                a aVar2 = (a) this.f44444e.get(size);
                if (e.f44446h.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.f44444e.remove(size);
                z9 = true;
            }
        }
        return z9;
    }

    public final a c() {
        return this.f44443d;
    }

    public final boolean d() {
        return this.f44445f;
    }

    public final List e() {
        return this.f44444e;
    }

    public final String f() {
        return this.f44441b;
    }

    public final boolean g() {
        return this.f44442c;
    }

    public final e h() {
        return this.f44440a;
    }

    public final void i(a task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f44440a) {
            if (!this.f44442c) {
                if (k(task, j10, false)) {
                    this.f44440a.h(this);
                }
                Unit unit = Unit.f45918a;
            } else if (task.a()) {
                if (e.f44446h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f44446h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long j10, boolean z9) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        long jNanoTime = this.f44440a.g().nanoTime();
        long j11 = jNanoTime + j10;
        int iIndexOf = this.f44444e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                if (e.f44446h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f44444e.remove(iIndexOf);
        }
        task.g(j11);
        if (e.f44446h.a().isLoggable(Level.FINE)) {
            if (z9) {
                str = "run again after " + b.b(j11 - jNanoTime);
            } else {
                str = "scheduled after " + b.b(j11 - jNanoTime);
            }
            b.c(task, this, str);
        }
        Iterator it = this.f44444e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).c() - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f44444e.size();
        }
        this.f44444e.add(size, task);
        return size == 0;
    }

    public final void l(a aVar) {
        this.f44443d = aVar;
    }

    public final void m(boolean z9) {
        this.f44445f = z9;
    }

    public final void n() {
        if (d9.e.f43193h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f44440a) {
            try {
                this.f44442c = true;
                if (b()) {
                    this.f44440a.h(this);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f44441b;
    }
}
