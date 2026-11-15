package L0;

import S0.u;
import androidx.work.q;
import androidx.work.y;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f3036d = q.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f3037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f3038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f3039c = new HashMap();

    /* JADX INFO: renamed from: L0.a$a, reason: collision with other inner class name */
    class RunnableC0042a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f3040a;

        RunnableC0042a(u uVar) {
            this.f3040a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.e().a(a.f3036d, "Scheduling work " + this.f3040a.f5393a);
            a.this.f3037a.a(this.f3040a);
        }
    }

    public a(b bVar, y yVar) {
        this.f3037a = bVar;
        this.f3038b = yVar;
    }

    public void a(u uVar) {
        Runnable runnable = (Runnable) this.f3039c.remove(uVar.f5393a);
        if (runnable != null) {
            this.f3038b.a(runnable);
        }
        RunnableC0042a runnableC0042a = new RunnableC0042a(uVar);
        this.f3039c.put(uVar.f5393a, runnableC0042a);
        this.f3038b.b(uVar.c() - System.currentTimeMillis(), runnableC0042a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f3039c.remove(str);
        if (runnable != null) {
            this.f3038b.a(runnable);
        }
    }
}
