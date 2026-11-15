package p140o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f47105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f47106d = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f47107e = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f47108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f47109b;

    private c() {
        d dVar = new d();
        this.f47109b = dVar;
        this.f47108a = dVar;
    }

    public static Executor f() {
        return f47107e;
    }

    public static c g() {
        if (f47105c != null) {
            return f47105c;
        }
        synchronized (c.class) {
            try {
                if (f47105c == null) {
                    f47105c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f47105c;
    }

    @Override // p140o.e
    public void a(Runnable runnable) {
        this.f47108a.a(runnable);
    }

    @Override // p140o.e
    public boolean b() {
        return this.f47108a.b();
    }

    @Override // p140o.e
    public void c(Runnable runnable) {
        this.f47108a.c(runnable);
    }
}
