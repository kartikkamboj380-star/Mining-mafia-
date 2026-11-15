package K0;

import T0.AbstractRunnableC0961b;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.C1187b;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class C extends androidx.work.B {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f2404k = androidx.work.q.i("WorkManagerImpl");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static C f2405l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static C f2406m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f2407n = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1187b f2409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkDatabase f2410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private U0.b f2411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f2412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f2413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private T0.q f2414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f2416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Q0.n f2417j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public C(Context context, C1187b c1187b, U0.b bVar) {
        this(context, c1187b, bVar, context.getResources().getBoolean(androidx.work.x.f11432a));
    }

    public static void i(Context context, C1187b c1187b) {
        synchronized (f2407n) {
            try {
                C c10 = f2405l;
                if (c10 != null && f2406m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f2406m == null) {
                        f2406m = new C(applicationContext, c1187b, new U0.c(c1187b.m()));
                    }
                    f2405l = f2406m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C p() {
        synchronized (f2407n) {
            try {
                C c10 = f2405l;
                if (c10 != null) {
                    return c10;
                }
                return f2406m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C q(Context context) {
        C cP;
        synchronized (f2407n) {
            try {
                cP = p();
                if (cP == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cP;
    }

    private void x(Context context, C1187b c1187b, U0.b bVar, WorkDatabase workDatabase, List list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2408a = applicationContext;
        this.f2409b = c1187b;
        this.f2411d = bVar;
        this.f2410c = workDatabase;
        this.f2412e = list;
        this.f2413f = rVar;
        this.f2414g = new T0.q(workDatabase);
        this.f2415h = false;
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f2411d.c(new ForceStopRunnable(applicationContext, this));
    }

    public void A(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f2407n) {
            try {
                this.f2416i = pendingResult;
                if (this.f2415h) {
                    pendingResult.finish();
                    this.f2416i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(v vVar) {
        C(vVar, null);
    }

    public void C(v vVar, WorkerParameters.a aVar) {
        this.f2411d.c(new T0.u(this, vVar, aVar));
    }

    public void D(S0.m mVar) {
        this.f2411d.c(new T0.v(this, new v(mVar), true));
    }

    public void E(v vVar) {
        this.f2411d.c(new T0.v(this, vVar, false));
    }

    @Override // androidx.work.B
    public androidx.work.t a(String str) {
        AbstractRunnableC0961b abstractRunnableC0961bD = AbstractRunnableC0961b.d(str, this);
        this.f2411d.c(abstractRunnableC0961bD);
        return abstractRunnableC0961bD.e();
    }

    @Override // androidx.work.B
    public androidx.work.t b(String str) {
        AbstractRunnableC0961b abstractRunnableC0961bC = AbstractRunnableC0961b.c(str, this, true);
        this.f2411d.c(abstractRunnableC0961bC);
        return abstractRunnableC0961bC.e();
    }

    @Override // androidx.work.B
    public androidx.work.t d(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new x(this, list).a();
    }

    @Override // androidx.work.B
    public androidx.work.t e(String str, androidx.work.g gVar, androidx.work.v vVar) {
        return gVar == androidx.work.g.UPDATE ? G.c(this, str, vVar) : m(str, gVar, vVar).a();
    }

    @Override // androidx.work.B
    public androidx.work.t g(String str, androidx.work.h hVar, List list) {
        return new x(this, str, hVar, list).a();
    }

    @Override // androidx.work.B
    public androidx.work.t j() {
        T0.s sVar = new T0.s(this);
        this.f2411d.c(sVar);
        return sVar.a();
    }

    public androidx.work.t k(UUID uuid) {
        AbstractRunnableC0961b abstractRunnableC0961bB = AbstractRunnableC0961b.b(uuid, this);
        this.f2411d.c(abstractRunnableC0961bB);
        return abstractRunnableC0961bB.e();
    }

    public List l(Context context, C1187b c1187b, Q0.n nVar) {
        return Arrays.asList(u.a(context, this), new L0.b(context, c1187b, nVar, this));
    }

    public x m(String str, androidx.work.g gVar, androidx.work.v vVar) {
        return new x(this, str, gVar == androidx.work.g.KEEP ? androidx.work.h.KEEP : androidx.work.h.REPLACE, Collections.singletonList(vVar));
    }

    public Context n() {
        return this.f2408a;
    }

    public C1187b o() {
        return this.f2409b;
    }

    public T0.q r() {
        return this.f2414g;
    }

    public r s() {
        return this.f2413f;
    }

    public List t() {
        return this.f2412e;
    }

    public Q0.n u() {
        return this.f2417j;
    }

    public WorkDatabase v() {
        return this.f2410c;
    }

    public U0.b w() {
        return this.f2411d;
    }

    public void y() {
        synchronized (f2407n) {
            try {
                this.f2415h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f2416i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f2416i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        N0.g.b(n());
        v().j().o();
        u.b(o(), v(), t());
    }

    public C(Context context, C1187b c1187b, U0.b bVar, boolean z9) {
        this(context, c1187b, bVar, WorkDatabase.d(context.getApplicationContext(), bVar.b(), z9));
    }

    public C(Context context, C1187b c1187b, U0.b bVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        androidx.work.q.h(new androidx.work.q.a(c1187b.j()));
        Q0.n nVar = new Q0.n(applicationContext, bVar);
        this.f2417j = nVar;
        List listL = l(applicationContext, c1187b, nVar);
        x(context, c1187b, bVar, workDatabase, listL, new r(context, c1187b, bVar, workDatabase, listL));
    }
}
