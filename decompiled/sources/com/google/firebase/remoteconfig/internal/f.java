package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p176r5.AbstractC7096m;
import p176r5.InterfaceC7088e;
import p176r5.InterfaceC7089f;
import p176r5.InterfaceC7090g;
import p176r5.InterfaceC7093j;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f40566d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f40567e = new p191t0.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f40568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f40569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task f40570c = null;

    private static class b implements InterfaceC7090g, InterfaceC7089f, InterfaceC7088e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f40571a;

        private b() {
            this.f40571a = new CountDownLatch(1);
        }

        @Override // p176r5.InterfaceC7088e
        public void a() {
            this.f40571a.countDown();
        }

        public boolean b(long j10, TimeUnit timeUnit) {
            return this.f40571a.await(j10, timeUnit);
        }

        @Override // p176r5.InterfaceC7089f
        public void onFailure(Exception exc) {
            this.f40571a.countDown();
        }

        @Override // p176r5.InterfaceC7090g
        public void onSuccess(Object obj) {
            this.f40571a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f40568a = executor;
        this.f40569b = uVar;
    }

    public static /* synthetic */ Task a(f fVar, boolean z9, g gVar, Void r10) {
        if (z9) {
            fVar.k(gVar);
        } else {
            fVar.getClass();
        }
        return AbstractC7096m.f(gVar);
    }

    private static Object c(Task task, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = f40567e;
        task.f(executor, bVar);
        task.d(executor, bVar);
        task.a(executor, bVar);
        if (!bVar.b(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized f h(Executor executor, u uVar) {
        String strB;
        Map map;
        try {
            strB = uVar.b();
            map = f40566d;
            if (!map.containsKey(strB)) {
                map.put(strB, new f(executor, uVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f) map.get(strB);
    }

    private synchronized void k(g gVar) {
        this.f40570c = AbstractC7096m.f(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f40570c = AbstractC7096m.f(null);
        }
        this.f40569b.a();
    }

    public synchronized Task e() {
        try {
            Task task = this.f40570c;
            if (task == null || (task.n() && !this.f40570c.isSuccessful())) {
                Executor executor = this.f40568a;
                final u uVar = this.f40569b;
                Objects.requireNonNull(uVar);
                this.f40570c = AbstractC7096m.d(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return uVar.d();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40570c;
    }

    public g f() {
        return g(5L);
    }

    g g(long j10) {
        synchronized (this) {
            try {
                Task task = this.f40570c;
                if (task != null && task.isSuccessful()) {
                    return (g) this.f40570c.getResult();
                }
                try {
                    return (g) c(e(), j10, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task i(g gVar) {
        return j(gVar, true);
    }

    public Task j(final g gVar, final boolean z9) {
        return AbstractC7096m.d(this.f40568a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f40561a.f40569b.e(gVar);
            }
        }).o(this.f40568a, new InterfaceC7093j() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // p176r5.InterfaceC7093j
            public final Task then(Object obj) {
                return f.a(this.f40563a, z9, gVar, (Void) obj);
            }
        });
    }
}
