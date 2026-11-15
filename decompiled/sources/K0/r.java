package K0;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C1187b;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class r implements InterfaceC0752e, R0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f2491m = androidx.work.q.i("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1187b f2494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private U0.b f2495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f2496e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f2500i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f2498g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f2497f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Set f2501j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f2502k = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f2492a = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f2503l = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f2499h = new HashMap();

    private static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC0752e f2504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final S0.m f2505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.common.util.concurrent.p f2506c;

        a(InterfaceC0752e interfaceC0752e, S0.m mVar, com.google.common.util.concurrent.p pVar) {
            this.f2504a = interfaceC0752e;
            this.f2505b = mVar;
            this.f2506c = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f2506c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f2504a.d(this.f2505b, zBooleanValue);
        }
    }

    public r(Context context, C1187b c1187b, U0.b bVar, WorkDatabase workDatabase, List list) {
        this.f2493b = context;
        this.f2494c = c1187b;
        this.f2495d = bVar;
        this.f2496e = workDatabase;
        this.f2500i = list;
    }

    public static /* synthetic */ S0.u f(r rVar, ArrayList arrayList, String str) {
        arrayList.addAll(rVar.f2496e.k().a(str));
        return rVar.f2496e.j().j(str);
    }

    private static boolean i(String str, I i10) {
        if (i10 == null) {
            androidx.work.q.e().a(f2491m, "WorkerWrapper could not be found for " + str);
            return false;
        }
        i10.g();
        androidx.work.q.e().a(f2491m, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void m(final S0.m mVar, final boolean z9) {
        this.f2495d.a().execute(new Runnable() { // from class: K0.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f2488a.d(mVar, z9);
            }
        });
    }

    private void q() {
        synchronized (this.f2503l) {
            try {
                if (this.f2497f.isEmpty()) {
                    try {
                        this.f2493b.startService(androidx.work.impl.foreground.a.g(this.f2493b));
                    } catch (Throwable th) {
                        androidx.work.q.e().d(f2491m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f2492a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f2492a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // R0.a
    public void a(String str) {
        synchronized (this.f2503l) {
            this.f2497f.remove(str);
            q();
        }
    }

    @Override // R0.a
    public boolean b(String str) {
        boolean zContainsKey;
        synchronized (this.f2503l) {
            zContainsKey = this.f2497f.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // R0.a
    public void c(String str, androidx.work.i iVar) {
        synchronized (this.f2503l) {
            try {
                androidx.work.q.e().f(f2491m, "Moving WorkSpec (" + str + ") to the foreground");
                I i10 = (I) this.f2498g.remove(str);
                if (i10 != null) {
                    if (this.f2492a == null) {
                        PowerManager.WakeLock wakeLockB = T0.x.b(this.f2493b, "ProcessorForegroundLck");
                        this.f2492a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f2497f.put(str, i10);
                    C.b.o(this.f2493b, androidx.work.impl.foreground.a.e(this.f2493b, i10.d(), iVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.InterfaceC0752e
    public void d(S0.m mVar, boolean z9) {
        synchronized (this.f2503l) {
            try {
                I i10 = (I) this.f2498g.get(mVar.b());
                if (i10 != null && mVar.equals(i10.d())) {
                    this.f2498g.remove(mVar.b());
                }
                androidx.work.q.e().a(f2491m, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z9);
                Iterator it = this.f2502k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0752e) it.next()).d(mVar, z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(InterfaceC0752e interfaceC0752e) {
        synchronized (this.f2503l) {
            this.f2502k.add(interfaceC0752e);
        }
    }

    public S0.u h(String str) {
        synchronized (this.f2503l) {
            try {
                I i10 = (I) this.f2497f.get(str);
                if (i10 == null) {
                    i10 = (I) this.f2498g.get(str);
                }
                if (i10 == null) {
                    return null;
                }
                return i10.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f2503l) {
            zContains = this.f2501j.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z9;
        synchronized (this.f2503l) {
            try {
                z9 = this.f2498g.containsKey(str) || this.f2497f.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    public void l(InterfaceC0752e interfaceC0752e) {
        synchronized (this.f2503l) {
            this.f2502k.remove(interfaceC0752e);
        }
    }

    public boolean n(v vVar) {
        return o(vVar, null);
    }

    public boolean o(v vVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th;
        S0.m mVarA = vVar.a();
        final String strB = mVarA.b();
        final ArrayList arrayList = new ArrayList();
        S0.u uVar = (S0.u) this.f2496e.runInTransaction(new Callable() { // from class: K0.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.f(this.f2485a, arrayList, strB);
            }
        });
        if (uVar == null) {
            androidx.work.q.e().k(f2491m, "Didn't find WorkSpec for id " + mVarA);
            m(mVarA, false);
            return false;
        }
        synchronized (this.f2503l) {
            try {
                try {
                    try {
                        if (k(strB)) {
                            Set set = (Set) this.f2499h.get(strB);
                            if (((v) set.iterator().next()).a().a() == mVarA.a()) {
                                set.add(vVar);
                                androidx.work.q.e().a(f2491m, "Work " + mVarA + " is already enqueued for processing");
                            } else {
                                m(mVarA, false);
                            }
                            return false;
                        }
                        if (uVar.f() != mVarA.a()) {
                            m(mVarA, false);
                            return false;
                        }
                        I iB = new I.c(this.f2493b, this.f2494c, this.f2495d, this, this.f2496e, uVar, arrayList).d(this.f2500i).c(aVar).b();
                        com.google.common.util.concurrent.p pVarC = iB.c();
                        pVarC.e(new a(this, vVar.a(), pVarC), this.f2495d.a());
                        this.f2498g.put(strB, iB);
                        HashSet hashSet = new HashSet();
                        hashSet.add(vVar);
                        this.f2499h.put(strB, hashSet);
                        this.f2495d.b().execute(iB);
                        androidx.work.q.e().a(f2491m, getClass().getSimpleName() + ": processing " + mVarA);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    public boolean p(String str) {
        I i10;
        boolean z9;
        synchronized (this.f2503l) {
            try {
                androidx.work.q.e().a(f2491m, "Processor cancelling " + str);
                this.f2501j.add(str);
                i10 = (I) this.f2497f.remove(str);
                z9 = i10 != null;
                if (i10 == null) {
                    i10 = (I) this.f2498g.remove(str);
                }
                if (i10 != null) {
                    this.f2499h.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zI = i(str, i10);
        if (z9) {
            q();
        }
        return zI;
    }

    public boolean r(v vVar) {
        I i10;
        String strB = vVar.a().b();
        synchronized (this.f2503l) {
            try {
                androidx.work.q.e().a(f2491m, "Processor stopping foreground work " + strB);
                i10 = (I) this.f2497f.remove(strB);
                if (i10 != null) {
                    this.f2499h.remove(strB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i(strB, i10);
    }

    public boolean s(v vVar) {
        String strB = vVar.a().b();
        synchronized (this.f2503l) {
            try {
                I i10 = (I) this.f2498g.remove(strB);
                if (i10 == null) {
                    androidx.work.q.e().a(f2491m, "WorkerWrapper could not be found for " + strB);
                    return false;
                }
                Set set = (Set) this.f2499h.get(strB);
                if (set != null && set.contains(vVar)) {
                    androidx.work.q.e().a(f2491m, "Processor stopping background work " + strB);
                    this.f2499h.remove(strB);
                    return i(strB, i10);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
