package c9;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f12221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f12222d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12219a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12220b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f12223e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f12224f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f12225g = new ArrayDeque();

    private final h9.e.a e(String str) {
        for (h9.e.a aVar : this.f12224f) {
            if (Intrinsics.b(aVar.d(), str)) {
                return aVar;
            }
        }
        for (h9.e.a aVar2 : this.f12223e) {
            if (Intrinsics.b(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void f(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f12221c;
            Unit unit = Unit.f45918a;
        }
        if (i() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean i() {
        int i10;
        boolean z9;
        if (d9.e.f43193h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f12223e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    h9.e.a asyncCall = (h9.e.a) it.next();
                    if (this.f12224f.size() >= this.f12219a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.f12220b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f12224f.add(asyncCall);
                    }
                }
                z9 = l() > 0;
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((h9.e.a) arrayList.get(i10)).a(d());
        }
        return z9;
    }

    public final ExecutorService a() {
        return d();
    }

    public final void b(h9.e.a call) {
        h9.e.a aVarE;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f12223e.add(call);
                if (!call.b().o() && (aVarE = e(call.d())) != null) {
                    call.e(aVarE);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
    }

    public final synchronized void c(h9.e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f12225g.add(call);
    }

    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        try {
            if (this.f12222d == null) {
                this.f12222d = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), d9.e.N(d9.e.f43194i + " Dispatcher", false));
            }
            executorService = this.f12222d;
            Intrinsics.c(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void g(h9.e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.c().decrementAndGet();
        f(this.f12224f, call);
    }

    public final void h(h9.e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        f(this.f12225g, call);
    }

    public final synchronized List j() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f12223e;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayDeque, 10));
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((h9.e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized List k() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f12225g;
            ArrayDeque arrayDeque2 = this.f12224f;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayDeque2, 10));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((h9.e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.k0(arrayDeque, arrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int l() {
        return this.f12224f.size() + this.f12225g.size();
    }
}
