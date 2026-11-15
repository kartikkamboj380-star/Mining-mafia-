package L0;

import K0.C;
import K0.InterfaceC0752e;
import K0.t;
import K0.v;
import K0.w;
import O0.c;
import O0.d;
import O0.e;
import Q0.n;
import S0.m;
import S0.u;
import S0.x;
import T0.r;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.A;
import androidx.work.C1187b;
import androidx.work.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements t, c, InterfaceC0752e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f3042j = q.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f3044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f3045c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f3047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3048f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Boolean f3051i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f3046d = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f3050h = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f3049g = new Object();

    public b(Context context, C1187b c1187b, n nVar, C c10) {
        this.f3043a = context;
        this.f3044b = c10;
        this.f3045c = new e(nVar, this);
        this.f3047e = new a(this, c1187b.k());
    }

    private void g() {
        this.f3051i = Boolean.valueOf(r.b(this.f3043a, this.f3044b.o()));
    }

    private void h() {
        if (this.f3048f) {
            return;
        }
        this.f3044b.s().g(this);
        this.f3048f = true;
    }

    private void i(m mVar) {
        synchronized (this.f3049g) {
            try {
                for (u uVar : this.f3046d) {
                    if (x.a(uVar).equals(mVar)) {
                        q.e().a(f3042j, "Stopping tracking for " + mVar);
                        this.f3046d.remove(uVar);
                        this.f3045c.a(this.f3046d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.t
    public void a(u... uVarArr) {
        if (this.f3051i == null) {
            g();
        }
        if (!this.f3051i.booleanValue()) {
            q.e().f(f3042j, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f3050h.a(x.a(uVar))) {
                long jC = uVar.c();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (uVar.f5394b == A.ENQUEUED) {
                    if (jCurrentTimeMillis < jC) {
                        a aVar = this.f3047e;
                        if (aVar != null) {
                            aVar.a(uVar);
                        }
                    } else if (uVar.h()) {
                        if (uVar.f5402j.h()) {
                            q.e().a(f3042j, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (uVar.f5402j.e()) {
                            q.e().a(f3042j, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f5393a);
                        }
                    } else if (!this.f3050h.a(x.a(uVar))) {
                        q.e().a(f3042j, "Starting work for " + uVar.f5393a);
                        this.f3044b.B(this.f3050h.e(uVar));
                    }
                }
            }
        }
        synchronized (this.f3049g) {
            try {
                if (!hashSet.isEmpty()) {
                    q.e().a(f3042j, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f3046d.addAll(hashSet);
                    this.f3045c.a(this.f3046d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O0.c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVarA = x.a((u) it.next());
            q.e().a(f3042j, "Constraints not met: Cancelling work ID " + mVarA);
            v vVarB = this.f3050h.b(mVarA);
            if (vVarB != null) {
                this.f3044b.E(vVarB);
            }
        }
    }

    @Override // K0.t
    public void c(String str) {
        if (this.f3051i == null) {
            g();
        }
        if (!this.f3051i.booleanValue()) {
            q.e().f(f3042j, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        q.e().a(f3042j, "Cancelling work ID " + str);
        a aVar = this.f3047e;
        if (aVar != null) {
            aVar.b(str);
        }
        Iterator it = this.f3050h.c(str).iterator();
        while (it.hasNext()) {
            this.f3044b.E((v) it.next());
        }
    }

    @Override // K0.InterfaceC0752e
    public void d(m mVar, boolean z9) {
        this.f3050h.b(mVar);
        i(mVar);
    }

    @Override // K0.t
    public boolean e() {
        return false;
    }

    @Override // O0.c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVarA = x.a((u) it.next());
            if (!this.f3050h.a(mVarA)) {
                q.e().a(f3042j, "Constraints met: Scheduling work ID " + mVarA);
                this.f3044b.B(this.f3050h.d(mVarA));
            }
        }
    }
}
