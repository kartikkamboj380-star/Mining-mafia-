package T0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f5566e = androidx.work.q.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.y f5567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f5568b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f5569c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f5570d = new Object();

    public interface a {
        void a(S0.m mVar);
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D f5571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final S0.m f5572b;

        b(D d10, S0.m mVar) {
            this.f5571a = d10;
            this.f5572b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5571a.f5570d) {
                try {
                    if (((b) this.f5571a.f5568b.remove(this.f5572b)) != null) {
                        a aVar = (a) this.f5571a.f5569c.remove(this.f5572b);
                        if (aVar != null) {
                            aVar.a(this.f5572b);
                        }
                    } else {
                        androidx.work.q.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f5572b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public D(androidx.work.y yVar) {
        this.f5567a = yVar;
    }

    public void a(S0.m mVar, long j10, a aVar) {
        synchronized (this.f5570d) {
            androidx.work.q.e().a(f5566e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f5568b.put(mVar, bVar);
            this.f5569c.put(mVar, aVar);
            this.f5567a.b(j10, bVar);
        }
    }

    public void b(S0.m mVar) {
        synchronized (this.f5570d) {
            try {
                if (((b) this.f5568b.remove(mVar)) != null) {
                    androidx.work.q.e().a(f5566e, "Stopping timer for " + mVar);
                    this.f5569c.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
