package Z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f7111i = Z0.b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f7112j = Z0.b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f7113k = Z0.a.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static f f7114l = new f((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static f f7115m = new f(Boolean.TRUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static f f7116n = new f(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static f f7117o = new f(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f7121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f7122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f7124g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7118a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f7125h = new ArrayList();

    class a implements Z0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f7126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z0.d f7127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f7128c;

        a(g gVar, Z0.d dVar, Executor executor, Z0.c cVar) {
            this.f7126a = gVar;
            this.f7127b = dVar;
            this.f7128c = executor;
        }

        @Override // Z0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(f fVar) {
            f.d(this.f7126a, this.f7127b, fVar, this.f7128c, null);
            return null;
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f7130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z0.d f7131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f7132c;

        b(Z0.c cVar, g gVar, Z0.d dVar, f fVar) {
            this.f7130a = gVar;
            this.f7131b = dVar;
            this.f7132c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7130a.d(this.f7131b.a(this.f7132c));
            } catch (CancellationException unused) {
                this.f7130a.b();
            } catch (Exception e10) {
                this.f7130a.c(e10);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f7133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f7134b;

        c(Z0.c cVar, g gVar, Callable callable) {
            this.f7133a = gVar;
            this.f7134b = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7133a.d(this.f7134b.call());
            } catch (CancellationException unused) {
                this.f7133a.b();
            } catch (Exception e10) {
                this.f7133a.c(e10);
            }
        }
    }

    public interface d {
    }

    f() {
    }

    public static f b(Callable callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static f c(Callable callable, Executor executor, Z0.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(g gVar, Z0.d dVar, f fVar, Executor executor, Z0.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
    }

    public static f g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static f h(Object obj) {
        if (obj == null) {
            return f7114l;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f7115m : f7116n;
        }
        g gVar = new g();
        gVar.d(obj);
        return gVar.a();
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f7118a) {
            Iterator it = this.f7125h.iterator();
            while (it.hasNext()) {
                try {
                    ((Z0.d) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f7125h = null;
        }
    }

    public f e(Z0.d dVar) {
        return f(dVar, f7112j, null);
    }

    public f f(Z0.d dVar, Executor executor, Z0.c cVar) throws Throwable {
        Z0.d dVar2;
        Executor executor2;
        Z0.c cVar2;
        g gVar = new g();
        synchronized (this.f7118a) {
            try {
                try {
                    boolean zM = m();
                    if (zM) {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                    } else {
                        dVar2 = dVar;
                        executor2 = executor;
                        cVar2 = cVar;
                        this.f7125h.add(new a(gVar, dVar2, executor2, cVar2));
                    }
                    if (zM) {
                        d(gVar, dVar2, this, executor2, cVar2);
                    }
                    return gVar.a();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f7118a) {
            try {
                if (this.f7122e != null) {
                    this.f7123f = true;
                }
                exc = this.f7122e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f7118a) {
            obj = this.f7121d;
        }
        return obj;
    }

    public boolean l() {
        boolean z9;
        synchronized (this.f7118a) {
            z9 = this.f7120c;
        }
        return z9;
    }

    public boolean m() {
        boolean z9;
        synchronized (this.f7118a) {
            z9 = this.f7119b;
        }
        return z9;
    }

    public boolean n() {
        boolean z9;
        synchronized (this.f7118a) {
            z9 = i() != null;
        }
        return z9;
    }

    boolean p() {
        synchronized (this.f7118a) {
            try {
                if (this.f7119b) {
                    return false;
                }
                this.f7119b = true;
                this.f7120c = true;
                this.f7118a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(Exception exc) {
        synchronized (this.f7118a) {
            try {
                if (this.f7119b) {
                    return false;
                }
                this.f7119b = true;
                this.f7122e = exc;
                this.f7123f = false;
                this.f7118a.notifyAll();
                o();
                if (!this.f7123f) {
                    k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean r(Object obj) {
        synchronized (this.f7118a) {
            try {
                if (this.f7119b) {
                    return false;
                }
                this.f7119b = true;
                this.f7121d = obj;
                this.f7118a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private f(Object obj) {
        r(obj);
    }

    private f(boolean z9) {
        if (z9) {
            p();
        } else {
            r(null);
        }
    }
}
