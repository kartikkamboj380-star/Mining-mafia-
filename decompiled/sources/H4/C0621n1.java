package H4;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.BinderC1974Ke;
import com.google.android.gms.internal.ads.BinderC5162so;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: H4.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0621n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BinderC5162so f1391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2 f1392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f1393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B4.w f1394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final A f1395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0580a f1396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private B4.d f1397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B4.f[] f1398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4.e f1399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private W f1400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private B4.x f1401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f1402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ViewGroup f1403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private B4.o f1406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicLong f1407q;

    public C0621n1(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, l2.f1364a, null, i10);
    }

    private static m2 e(Context context, B4.f[] fVarArr, int i10) {
        for (B4.f fVar : fVarArr) {
            if (fVar.equals(B4.f.f234q)) {
                return new m2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        m2 m2Var = new m2(context, fVarArr);
        m2Var.f1380j = f(i10);
        return m2Var;
    }

    private static boolean f(int i10) {
        return i10 == 1;
    }

    public final void A(long j10) {
        this.f1407q.set(j10);
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.j1(j10);
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final B4.o B() {
        return this.f1406p;
    }

    public final B4.w C() {
        return this.f1394d;
    }

    public final InterfaceC0591d1 D() {
        W w10 = this.f1400j;
        if (w10 != null) {
            try {
                return w10.t();
            } catch (RemoteException e10) {
                L4.p.i("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final void a(B4.x xVar) {
        this.f1401k = xVar;
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.u6(xVar == null ? null : new a2(xVar));
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final B4.x b() {
        return this.f1401k;
    }

    final /* synthetic */ void c(com.google.android.gms.dynamic.a aVar) {
        this.f1403m.addView((View) com.google.android.gms.dynamic.b.h0(aVar));
    }

    final /* synthetic */ B4.w d() {
        return this.f1394d;
    }

    public final void g() {
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.zzc();
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final B4.d h() {
        return this.f1397g;
    }

    public final B4.f i() {
        m2 m2VarZzn;
        try {
            W w10 = this.f1400j;
            if (w10 != null && (m2VarZzn = w10.zzn()) != null) {
                return B4.z.a(m2VarZzn.f1375e, m2VarZzn.f1372b, m2VarZzn.f1371a);
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
        B4.f[] fVarArr = this.f1398h;
        if (fVarArr != null) {
            return fVarArr[0];
        }
        return null;
    }

    public final B4.f[] j() {
        return this.f1398h;
    }

    public final String k() {
        W w10;
        if (this.f1402l == null && (w10 = this.f1400j) != null) {
            try {
                this.f1402l = w10.zzu();
            } catch (RemoteException e10) {
                L4.p.i("#007 Could not call remote method.", e10);
            }
        }
        return this.f1402l;
    }

    public final C4.e l() {
        return this.f1399i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d7 A[Catch: RemoteException -> 0x00d5, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d5, blocks: (B:27:0x00a4, B:29:0x00aa, B:31:0x00b8, B:33:0x00ca, B:36:0x00d7), top: B:57:0x00a4, outer: #0 }] */
    public final void m(C0612k1 c0612k1) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f1400j == null) {
                if (this.f1398h == null || this.f1402l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup = this.f1403m;
                Context context = viewGroup.getContext();
                m2 m2VarE = e(context, this.f1398h, this.f1404n);
                W w10 = "search_v2".equals(m2VarE.f1371a) ? (W) new C0616m(C0654z.b(), context, m2VarE, this.f1402l).d(context, false) : (W) new C0610k(C0654z.b(), context, m2VarE, this.f1402l, this.f1391a).d(context, false);
                this.f1400j = w10;
                w10.J4(new Z1(this.f1395e));
                InterfaceC0580a interfaceC0580a = this.f1396f;
                if (interfaceC0580a != null) {
                    this.f1400j.e5(new BinderC0648x(interfaceC0580a));
                }
                C4.e eVar = this.f1399i;
                if (eVar != null) {
                    this.f1400j.h3(new BinderC1974Ke(eVar));
                }
                if (this.f1401k != null) {
                    this.f1400j.u6(new a2(this.f1401k));
                }
                this.f1400j.u5(new R1(this.f1406p));
                this.f1400j.J2(this.f1405o);
                W w11 = this.f1400j;
                if (w11 != null) {
                    try {
                        final com.google.android.gms.dynamic.a aVarZzb = w11.zzb();
                        if (aVarZzb != null) {
                            if (((Boolean) AbstractC3894ij.f30049f.e()).booleanValue()) {
                                if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                                    L4.g.f3110b.post(new Runnable() { // from class: H4.m1
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f1369a.c(aVarZzb);
                                        }
                                    });
                                } else {
                                    viewGroup.addView((View) com.google.android.gms.dynamic.b.h0(aVarZzb));
                                }
                            } else {
                                viewGroup.addView((View) com.google.android.gms.dynamic.b.h0(aVarZzb));
                            }
                        }
                    } catch (RemoteException e10) {
                        L4.p.i("#007 Could not call remote method.", e10);
                    }
                }
            }
            c0612k1.o(jCurrentTimeMillis);
            if (c0612k1.q() != 0) {
                this.f1407q.set(c0612k1.q());
            }
            W w12 = this.f1400j;
            if (w12 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.f1407q;
            if (atomicLong.get() != 0) {
                w12.j1(atomicLong.get());
            }
            w12.v0(this.f1392b.a(this.f1403m.getContext(), c0612k1));
        } catch (RemoteException e11) {
            L4.p.i("#007 Could not call remote method.", e11);
        }
    }

    public final void n() {
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.b();
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void o() {
        if (this.f1393c.getAndSet(true)) {
            return;
        }
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.e();
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void p() {
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.zzg();
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void q(B4.d dVar) {
        this.f1397g = dVar;
        this.f1395e.u(dVar);
    }

    public final void r(InterfaceC0580a interfaceC0580a) {
        try {
            this.f1396f = interfaceC0580a;
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.e5(interfaceC0580a != null ? new BinderC0648x(interfaceC0580a) : null);
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void s(B4.f... fVarArr) {
        if (this.f1398h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        t(fVarArr);
    }

    public final void t(B4.f... fVarArr) {
        this.f1398h = fVarArr;
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.B3(e(this.f1403m.getContext(), this.f1398h, this.f1404n));
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
        this.f1403m.requestLayout();
    }

    public final void u(String str) {
        if (this.f1402l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f1402l = str;
    }

    public final void v(C4.e eVar) {
        try {
            this.f1399i = eVar;
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.h3(eVar != null ? new BinderC1974Ke(eVar) : null);
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void w(boolean z9) {
        this.f1405o = z9;
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.J2(z9);
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final B4.u x() {
        InterfaceC0582a1 interfaceC0582a1G = null;
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                interfaceC0582a1G = w10.g();
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
        return B4.u.e(interfaceC0582a1G);
    }

    public final void y(B4.o oVar) {
        try {
            this.f1406p = oVar;
            W w10 = this.f1400j;
            if (w10 != null) {
                w10.u5(new R1(oVar));
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final long z() {
        AtomicLong atomicLong = this.f1407q;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            W w10 = this.f1400j;
            if (w10 != null) {
                atomicLong.set(w10.S());
                return atomicLong.get();
            }
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
        return 0L;
    }

    C0621n1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z9, l2 l2Var, W w10, int i10) {
        m2 m2Var;
        this.f1391a = new BinderC5162so();
        this.f1394d = new B4.w();
        this.f1395e = new C0615l1(this);
        this.f1407q = new AtomicLong();
        this.f1403m = viewGroup;
        this.f1392b = l2Var;
        this.f1400j = null;
        this.f1393c = new AtomicBoolean(false);
        this.f1404n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                u2 u2Var = new u2(context, attributeSet);
                this.f1398h = u2Var.a(z9);
                this.f1402l = u2Var.b();
                if (viewGroup.isInEditMode()) {
                    L4.g gVarA = C0654z.a();
                    B4.f fVar = this.f1398h[0];
                    int i11 = this.f1404n;
                    if (fVar.equals(B4.f.f234q)) {
                        m2Var = new m2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        m2Var = new m2(context, fVar);
                        m2Var.f1380j = f(i11);
                    }
                    gVarA.l(viewGroup, m2Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                C0654z.a().k(viewGroup, new m2(context, B4.f.f226i), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
