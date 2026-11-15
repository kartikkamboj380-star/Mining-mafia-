package T0;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class A implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f5541g = androidx.work.q.i("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f5542a = androidx.work.impl.utils.futures.c.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f5543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final S0.u f5544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.work.p f5545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.work.j f5546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final U0.b f5547f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f5548a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f5548a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (A.this.f5542a.isCancelled()) {
                return;
            }
            try {
                androidx.work.i iVar = (androidx.work.i) this.f5548a.get();
                if (iVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + A.this.f5544c.f5395c + ") but did not provide ForegroundInfo");
                }
                androidx.work.q.e().a(A.f5541g, "Updating notification for " + A.this.f5544c.f5395c);
                A a10 = A.this;
                a10.f5542a.r(a10.f5546e.a(a10.f5543b, a10.f5545d.getId(), iVar));
            } catch (Throwable th) {
                A.this.f5542a.q(th);
            }
        }
    }

    public A(Context context, S0.u uVar, androidx.work.p pVar, androidx.work.j jVar, U0.b bVar) {
        this.f5543b = context;
        this.f5544c = uVar;
        this.f5545d = pVar;
        this.f5546e = jVar;
        this.f5547f = bVar;
    }

    public static /* synthetic */ void a(A a10, androidx.work.impl.utils.futures.c cVar) {
        if (a10.f5542a.isCancelled()) {
            cVar.cancel(true);
        } else {
            cVar.r(a10.f5545d.getForegroundInfoAsync());
        }
    }

    public com.google.common.util.concurrent.p b() {
        return this.f5542a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f5544c.f5409q || Build.VERSION.SDK_INT >= 31) {
            this.f5542a.p(null);
            return;
        }
        final androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        this.f5547f.a().execute(new Runnable() { // from class: T0.z
            @Override // java.lang.Runnable
            public final void run() {
                A.a(this.f5611a, cVarT);
            }
        });
        cVarT.e(new a(cVarT), this.f5547f.a());
    }
}
