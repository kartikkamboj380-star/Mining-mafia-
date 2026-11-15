package p057f6;

import D6.a;
import D6.b;
import D6.c;
import D6.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class u implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f43728a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f43729b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f43730c;

    u(Executor executor) {
        this.f43730c = executor;
    }

    private synchronized Set g(a aVar) {
        Map map;
        try {
            map = (Map) this.f43728a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    @Override // D6.d
    public synchronized void a(Class cls, b bVar) {
        D.b(cls);
        D.b(bVar);
        if (this.f43728a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f43728a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f43728a.remove(cls);
            }
        }
    }

    @Override // D6.c
    public void b(final a aVar) {
        D.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f43729b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : g(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: f6.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.d
    public synchronized void c(Class cls, Executor executor, b bVar) {
        try {
            D.b(cls);
            D.b(bVar);
            D.b(executor);
            if (!this.f43728a.containsKey(cls)) {
                this.f43728a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f43728a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D6.d
    public void d(Class cls, b bVar) {
        c(cls, this.f43730c, bVar);
    }

    void f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f43729b;
                if (queue != null) {
                    this.f43729b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                b((a) it.next());
            }
        }
    }
}
