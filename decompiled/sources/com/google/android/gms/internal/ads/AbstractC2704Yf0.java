package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import H4.InterfaceC0593e0;
import H4.InterfaceC0599g0;
import K4.AbstractC0786o0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2704Yf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ClientApi f25661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f25662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f25663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final C2592Wb0 f25664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected H4.S1 f25665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final C4516nf0 f25666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected AtomicBoolean f25667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0593e0 f25668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected InterfaceC0599g0 f25669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Queue f25670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C5775xf0 f25671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f25672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AtomicBoolean f25673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f25674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C4890qd0 f25675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicBoolean f25676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AtomicBoolean f25677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1561Cf0 f25678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Clock f25679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C1925Jf0 f25680t;

    public AbstractC2704Yf0(ClientApi clientApi, Context context, int i10, C2592Wb0 c2592Wb0, H4.S1 s10, InterfaceC0593e0 interfaceC0593e0, ScheduledExecutorService scheduledExecutorService, C4890qd0 c4890qd0, C5775xf0 c5775xf0, Clock clock) {
        this("none", clientApi, context, i10, c2592Wb0, s10, scheduledExecutorService, c4890qd0, c5775xf0, clock, null);
        this.f25668h = interfaceC0593e0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized void b(Object obj) {
        try {
            this.f25673m.set(false);
            if (obj != null) {
                this.f25671k.a();
                this.f25677q.set(true);
                p(obj);
            }
            if (obj == null || this.f25666f == null) {
                q(obj == null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final synchronized void c(Throwable th) {
        try {
            this.f25673m.set(false);
            if ((th instanceof C4642of0) && ((C4642of0) th).a() == 0) {
                throw null;
            }
            q(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(H4.Z0 z9) {
        try {
            if (this.f25676p.get()) {
                K4.F0.f2598l.post(new RunnableC2288Qf0(this, z9));
            }
            this.f25673m.set(false);
            int i10 = z9.f1252a;
            if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
                q(true);
                return;
            }
            H4.S1 s10 = this.f25665e;
            int i11 = s10.f1243b;
            String str = s10.f1242a;
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 26 + String.valueOf(str).length() + 61);
            sb.append("Preloading ");
            sb.append(i11);
            sb.append(", for adUnitId:");
            sb.append(str);
            sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String string = sb.toString();
            int i12 = AbstractC0786o0.f2696b;
            L4.p.e(string);
            this.f25667g.set(false);
            C4516nf0 c4516nf0 = this.f25666f;
            if (c4516nf0 != null) {
                c4516nf0.a(this);
            }
            C1873If0 c1873If0 = new C1873If0(this.f25665e.f1242a, M());
            c1873If0.a(this.f25672l);
            this.f25678r.k(this.f25679s.currentTimeMillis(), new C1925Jf0(c1873If0, null), z9, this.f25665e.f1245d, N(), h());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void p(Object obj) {
        try {
            InterfaceC0582a1 interfaceC0582a1A = A(obj);
            double dC6 = !(interfaceC0582a1A instanceof RF) ? 0.0d : ((RF) interfaceC0582a1A).C6();
            InterfaceC0582a1 interfaceC0582a1A2 = A(obj);
            int iD6 = interfaceC0582a1A2 instanceof RF ? ((RF) interfaceC0582a1A2).D6() : 2;
            Clock clock = this.f25679s;
            C2029Lf0 c2029Lf0 = new C2029Lf0(obj, clock, dC6, iD6);
            this.f25670j.add(c2029Lf0);
            InterfaceC0582a1 interfaceC0582a1A3 = A(obj);
            long jCurrentTimeMillis = clock.currentTimeMillis();
            if (this.f25676p.get()) {
                K4.F0.f2598l.post(new RunnableC2184Of0(this, interfaceC0582a1A3));
            }
            ScheduledExecutorService scheduledExecutorService = this.f25674n;
            scheduledExecutorService.execute(new RunnableC2236Pf0(this, jCurrentTimeMillis, interfaceC0582a1A3));
            if (this.f25666f != null) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29539E)).booleanValue()) {
                    this.f25675o.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Vf0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f24334a.a();
                        }
                    }, c2029Lf0.c(), TimeUnit.MILLISECONDS);
                    return;
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.Uf0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f24075a.X();
                        }
                    }, c2029Lf0.c(), TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29539E)).booleanValue()) {
                this.f25675o.a(new RunnableC2132Nf0(this), c2029Lf0.c(), TimeUnit.MILLISECONDS);
            } else {
                scheduledExecutorService.schedule(new RunnableC2132Nf0(this), c2029Lf0.c(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void q(boolean z9) {
        try {
            C4516nf0 c4516nf0 = this.f25666f;
            if (c4516nf0 != null) {
                if (z9) {
                    this.f25671k.c();
                }
                c4516nf0.a(this);
            } else {
                C5775xf0 c5775xf0 = this.f25671k;
                if (c5775xf0.e()) {
                    return;
                }
                if (z9) {
                    c5775xf0.c();
                }
                this.f25674n.schedule(new RunnableC2132Nf0(this), c5775xf0.b(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void a() {
        Iterator it = this.f25670j.iterator();
        while (it.hasNext()) {
            if (((C2029Lf0) it.next()).b()) {
                it.remove();
                C4516nf0 c4516nf0 = this.f25666f;
                if (c4516nf0 != null) {
                    c4516nf0.a(this);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final synchronized void e(H4.Z0 z9) {
        InterfaceC0599g0 interfaceC0599g0 = this.f25669i;
        if (interfaceC0599g0 != null) {
            try {
                interfaceC0599g0.H2(this.f25672l, z9);
            } catch (RemoteException unused) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.f("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0028, please report this as an issue */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final synchronized void f(InterfaceC0582a1 interfaceC0582a1) {
        InterfaceC0599g0 interfaceC0599g0;
        InterfaceC0593e0 interfaceC0593e0 = this.f25668h;
        if (interfaceC0593e0 == null) {
            interfaceC0599g0 = this.f25669i;
            if (interfaceC0599g0 != null) {
                interfaceC0599g0.O3(this.f25672l, interfaceC0582a1);
                return;
            }
            return;
        }
        try {
            interfaceC0593e0.S5(this.f25665e);
        } catch (RemoteException unused) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("Failed to call onAdsAvailable");
        }
        interfaceC0599g0 = this.f25669i;
        if (interfaceC0599g0 != null) {
            try {
                interfaceC0599g0.O3(this.f25672l, interfaceC0582a1);
                return;
            } catch (RemoteException unused2) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.f("Failed to call onAdPreloaded");
                return;
            }
        }
        return;
        throw th;
    }

    private final synchronized void u() {
        try {
            if (this.f25677q.get() && this.f25670j.isEmpty()) {
                this.f25677q.set(false);
                if (this.f25676p.get()) {
                    K4.F0.f2598l.post(new RunnableC2340Rf0(this));
                }
                this.f25674n.execute(new RunnableC2392Sf0(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0028, please report this as an issue */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final synchronized void g() {
        InterfaceC0599g0 interfaceC0599g0;
        InterfaceC0593e0 interfaceC0593e0 = this.f25668h;
        if (interfaceC0593e0 == null) {
            interfaceC0599g0 = this.f25669i;
            if (interfaceC0599g0 != null) {
                interfaceC0599g0.i(this.f25672l);
                return;
            }
            return;
        }
        try {
            interfaceC0593e0.E5(this.f25665e);
        } catch (RemoteException unused) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("Failed to call onAdsExhausted");
        }
        interfaceC0599g0 = this.f25669i;
        if (interfaceC0599g0 != null) {
            try {
                interfaceC0599g0.i(this.f25672l);
                return;
            } catch (RemoteException unused2) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.f("Failed to call onAdsExhausted");
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final String h() {
        return true != "none".equals(this.f25672l) ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(InterfaceC0582a1 interfaceC0582a1) {
        if (interfaceC0582a1 instanceof RF) {
            return ((RF) interfaceC0582a1).B6();
        }
        return null;
    }

    protected abstract InterfaceC0582a1 A(Object obj);

    public final synchronized AbstractC2704Yf0 B() {
        this.f25674n.submit(new RunnableC2132Nf0(this));
        return this;
    }

    public final synchronized void C() {
        if (!this.f25673m.get() && this.f25667g.get() && this.f25670j.size() < this.f25665e.f1245d) {
            this.f25673m.set(true);
            this.f25674n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.Wf0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f24856a.T();
                }
            });
        }
    }

    public final synchronized boolean D() {
        try {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29599K)).booleanValue()) {
                this.f25671k.a();
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29529D)).booleanValue() && this.f25666f == null) {
                S();
            } else {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !this.f25670j.isEmpty();
    }

    public final synchronized Object E() {
        try {
            boolean z9 = true;
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29629N)).booleanValue()) {
                if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29609L)).booleanValue() || this.f25670j.size() == 1) {
                    this.f25671k.a();
                }
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29619M)).booleanValue()) {
                a();
            }
            Queue queue = this.f25670j;
            C2029Lf0 c2029Lf0 = (C2029Lf0) queue.poll();
            AtomicBoolean atomicBoolean = this.f25677q;
            if (c2029Lf0 == null) {
                z9 = false;
            }
            atomicBoolean.set(z9);
            if (c2029Lf0 == null) {
                c2029Lf0 = null;
            } else if (!queue.isEmpty()) {
                C2029Lf0 c2029Lf1 = (C2029Lf0) queue.peek();
                B4.b bVarC = B4.b.c(this.f25665e.f1243b);
                String strX = x(A(c2029Lf0.a()));
                if (c2029Lf1 != null && bVarC != null && strX != null && c2029Lf1.d() < c2029Lf0.d()) {
                    this.f25678r.g(this.f25679s.currentTimeMillis(), this.f25665e.f1245d, N(), strX, this.f25680t, h());
                }
            }
            C4516nf0 c4516nf0 = this.f25666f;
            if (c4516nf0 != null) {
                c4516nf0.b(this);
            } else {
                long jW = W();
                if (jW > 0) {
                    this.f25674n.schedule(new RunnableC2132Nf0(this), jW, TimeUnit.MILLISECONDS);
                } else {
                    S();
                }
            }
            if (c2029Lf0 == null) {
                return null;
            }
            return c2029Lf0.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void F() {
        this.f25667g.set(false);
        this.f25676p.set(false);
    }

    public final void G() {
        this.f25667g.set(false);
    }

    public final synchronized void H() {
        this.f25667g.set(true);
        this.f25676p.set(true);
        if (this.f25666f == null) {
            this.f25674n.submit(new RunnableC2132Nf0(this));
        }
    }

    public final synchronized String I() {
        Object objQ;
        objQ = Q();
        return x(objQ == null ? null : A(objQ));
    }

    public final void J(C1561Cf0 c1561Cf0) {
        this.f25678r = c1561Cf0;
    }

    public final synchronized void K(int i10) {
        Preconditions.checkArgument(i10 >= 5);
        this.f25671k.f(i10);
    }

    protected final String L() {
        return this.f25672l;
    }

    protected final B4.b M() {
        return B4.b.c(this.f25665e.f1243b);
    }

    protected final synchronized int N() {
        return this.f25670j.size();
    }

    protected final boolean O() {
        return this.f25667g.get() && !this.f25673m.get() && N() < this.f25665e.f1245d && !this.f25671k.d();
    }

    protected final synchronized void P() {
        this.f25670j.clear();
    }

    protected final synchronized Object Q() {
        C2029Lf0 c2029Lf0 = (C2029Lf0) this.f25670j.peek();
        if (c2029Lf0 == null) {
            return null;
        }
        return c2029Lf0.a();
    }

    protected final boolean R() {
        return this.f25673m.get();
    }

    protected final synchronized void S() {
        a();
        u();
        if (!this.f25673m.get() && this.f25667g.get() && this.f25670j.size() < this.f25665e.f1245d) {
            this.f25673m.set(true);
            T();
        }
    }

    protected final synchronized void T() {
        com.google.common.util.concurrent.p pVarY;
        try {
            Activity activityD = G4.t.k().d();
            if (activityD == null) {
                String strValueOf = String.valueOf(this.f25665e.f1242a);
                int i10 = AbstractC0786o0.f2696b;
                L4.p.f("Empty activity context at preloading: ".concat(strValueOf));
                pVarY = y(this.f25662b);
            } else {
                pVarY = y(activityD);
            }
            AbstractC5685wx0.r(pVarY, new C2080Mf0(this), this.f25674n);
        } catch (Throwable th) {
            throw th;
        }
    }

    protected final void U(int i10) {
        C4516nf0 c4516nf0;
        Preconditions.checkArgument(i10 > 0);
        B4.b bVarC = B4.b.c(this.f25665e.f1243b);
        int i11 = this.f25665e.f1245d;
        int size = this.f25670j.size();
        synchronized (this) {
            try {
                H4.S1 s10 = this.f25665e;
                this.f25665e = new H4.S1(s10.f1242a, s10.f1243b, s10.f1244c, i10 > 0 ? i10 : s10.f1245d);
                Queue queue = this.f25670j;
                if (queue.size() > i10) {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.f30012x)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < i10; i12++) {
                            C2029Lf0 c2029Lf0 = (C2029Lf0) queue.poll();
                            if (c2029Lf0 != null) {
                                arrayList.add(c2029Lf0);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (c4516nf0 = this.f25666f) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            c4516nf0.c(this, size2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1561Cf0 c1561Cf0 = this.f25678r;
        if (c1561Cf0 == null || bVarC == null) {
            return;
        }
        c1561Cf0.c(i11, i10, this.f25679s.currentTimeMillis(), new C1925Jf0(new C1873If0(this.f25665e.f1242a, bVarC), null));
    }

    protected final void V(H4.h2 h2Var) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29519C)).booleanValue()) {
            Bundle bundle = h2Var.f1290S;
            bundle.putInt("plcs", N());
            bundle.putInt("plbs", this.f25665e.f1245d);
            bundle.putString("plid", this.f25672l);
        }
    }

    final long W() {
        long jZ = z();
        if (jZ >= 0) {
            return jZ;
        }
        return ((Long) H4.B.c().d(AbstractC3892ii.f29649P)).longValue();
    }

    final /* synthetic */ C1561Cf0 i() {
        return this.f25678r;
    }

    final /* synthetic */ Clock j() {
        return this.f25679s;
    }

    final /* synthetic */ C1925Jf0 k() {
        return this.f25680t;
    }

    protected abstract com.google.common.util.concurrent.p y(Context context);

    protected abstract long z();

    public AbstractC2704Yf0(String str, ClientApi clientApi, Context context, int i10, C2592Wb0 c2592Wb0, H4.S1 s10, InterfaceC0599g0 interfaceC0599g0, ScheduledExecutorService scheduledExecutorService, C4890qd0 c4890qd0, C5775xf0 c5775xf0, Clock clock, C4516nf0 c4516nf0) {
        this(str, clientApi, context, i10, c2592Wb0, s10, scheduledExecutorService, c4890qd0, c5775xf0, clock, c4516nf0);
        this.f25669i = interfaceC0599g0;
    }

    private AbstractC2704Yf0(String str, ClientApi clientApi, Context context, int i10, C2592Wb0 c2592Wb0, H4.S1 s10, ScheduledExecutorService scheduledExecutorService, C4890qd0 c4890qd0, C5775xf0 c5775xf0, Clock clock, C4516nf0 c4516nf0) {
        Queue priorityQueue;
        this.f25672l = str;
        this.f25661a = clientApi;
        this.f25662b = context;
        this.f25663c = i10;
        this.f25664d = c2592Wb0;
        this.f25665e = s10;
        int iMax = Math.max(1, s10.f1245d);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29729X)).booleanValue()) {
            priorityQueue = new C3010bg0();
        } else {
            priorityQueue = new PriorityQueue(iMax, C2444Tf0.f23591a);
        }
        this.f25670j = priorityQueue;
        this.f25667g = new AtomicBoolean(true);
        this.f25673m = new AtomicBoolean(false);
        this.f25674n = scheduledExecutorService;
        this.f25675o = c4890qd0;
        this.f25671k = c5775xf0;
        this.f25676p = new AtomicBoolean(true);
        this.f25677q = new AtomicBoolean(false);
        this.f25679s = clock;
        C1873If0 c1873If0 = new C1873If0(s10.f1242a, B4.b.c(this.f25665e.f1243b));
        c1873If0.a(str);
        this.f25680t = new C1925Jf0(c1873If0, null);
        this.f25666f = c4516nf0;
    }
}
