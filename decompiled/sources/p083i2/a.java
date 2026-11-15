package p083i2;

import Y1.k;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p083i2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f45030a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f45033d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f45034e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f45035f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45032c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f45031b = d.IN_PROGRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue f45036g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: i2.a$a, reason: collision with other inner class name */
    class RunnableC0439a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f45037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f45038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f45039c;

        RunnableC0439a(boolean z9, e eVar, boolean z10) {
            this.f45037a = z9;
            this.f45038b = eVar;
            this.f45039c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f45037a) {
                this.f45038b.b(a.this);
            } else if (this.f45039c) {
                this.f45038b.a(a.this);
            } else {
                this.f45038b.c(a.this);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f45041a;

        b(e eVar) {
            this.f45041a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45041a.d(a.this);
        }
    }

    public interface c {
    }

    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected a() {
    }

    public static c i() {
        return null;
    }

    private void m() {
        boolean zJ = j();
        boolean zW = w();
        for (Pair pair : this.f45036g) {
            l((e) pair.first, (Executor) pair.second, zJ, zW);
        }
    }

    private synchronized boolean r(Throwable th, Map map) {
        if (!this.f45032c && this.f45031b == d.IN_PROGRESS) {
            this.f45031b = d.FAILURE;
            this.f45034e = th;
            this.f45030a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean t(float f10) {
        if (!this.f45032c && this.f45031b == d.IN_PROGRESS) {
            if (f10 < this.f45035f) {
                return false;
            }
            this.f45035f = f10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    private boolean v(Object obj, boolean z9) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f45032c && this.f45031b == d.IN_PROGRESS) {
                            if (z9) {
                                this.f45031b = d.SUCCESS;
                                this.f45035f = 1.0f;
                            }
                            Object obj4 = this.f45033d;
                            if (obj4 != obj) {
                                try {
                                    this.f45033d = obj;
                                    obj2 = obj4;
                                } catch (Throwable th) {
                                    th = th;
                                    obj3 = obj4;
                                    throw th;
                                }
                            } else {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                h(obj2);
                            }
                            return true;
                        }
                        if (obj != null) {
                            h(obj);
                        }
                        return false;
                    } catch (Throwable th2) {
                        obj3 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (obj3 != null) {
                h(obj3);
            }
            throw th4;
        }
    }

    private synchronized boolean w() {
        return k() && !c();
    }

    @Override // p083i2.c
    public synchronized Object a() {
        return this.f45033d;
    }

    @Override // p083i2.c
    public synchronized boolean b() {
        return this.f45033d != null;
    }

    @Override // p083i2.c
    public synchronized boolean c() {
        return this.f45031b != d.IN_PROGRESS;
    }

    @Override // p083i2.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f45032c) {
                    return false;
                }
                this.f45032c = true;
                Object obj = this.f45033d;
                this.f45033d = null;
                if (obj != null) {
                    h(obj);
                }
                if (!c()) {
                    m();
                }
                synchronized (this) {
                    this.f45036g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p083i2.c
    public synchronized Throwable d() {
        return this.f45034e;
    }

    @Override // p083i2.c
    public void e(e eVar, Executor executor) {
        k.g(eVar);
        k.g(executor);
        synchronized (this) {
            try {
                if (this.f45032c) {
                    return;
                }
                if (this.f45031b == d.IN_PROGRESS) {
                    this.f45036g.add(Pair.create(eVar, executor));
                }
                boolean z9 = b() || c() || w();
                if (z9) {
                    l(eVar, executor, j(), w());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p083i2.c
    public synchronized float f() {
        return this.f45035f;
    }

    @Override // p083i2.c
    public boolean g() {
        return false;
    }

    @Override // p083i2.c
    public Map getExtras() {
        return this.f45030a;
    }

    public synchronized boolean j() {
        return this.f45031b == d.FAILURE;
    }

    public synchronized boolean k() {
        return this.f45032c;
    }

    protected void l(e eVar, Executor executor, boolean z9, boolean z10) {
        RunnableC0439a runnableC0439a = new RunnableC0439a(z9, eVar, z10);
        i();
        executor.execute(runnableC0439a);
    }

    protected void n() {
        for (Pair pair : this.f45036g) {
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void o(Map map) {
        this.f45030a = map;
    }

    protected boolean p(Throwable th) {
        return q(th, null);
    }

    protected boolean q(Throwable th, Map map) {
        boolean zR = r(th, map);
        if (zR) {
            m();
        }
        return zR;
    }

    protected boolean s(float f10) {
        boolean zT = t(f10);
        if (zT) {
            n();
        }
        return zT;
    }

    protected boolean u(Object obj, boolean z9, Map map) {
        o(map);
        boolean zV = v(obj, z9);
        if (zV) {
            m();
        }
        return zV;
    }

    protected void h(Object obj) {
    }
}
