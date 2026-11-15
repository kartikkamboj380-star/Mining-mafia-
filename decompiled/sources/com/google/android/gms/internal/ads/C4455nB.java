package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4455nB implements ZF, OG, InterfaceC5220tG, InterfaceC0580a, InterfaceC4717pG, InterfaceC3467fK, InterfaceC5726xH {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Set f31737G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f31738H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final AtomicBoolean f31739I = new AtomicBoolean();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private C1640Dt f31740J = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f31742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f31743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f31744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5011rb0 f31745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3502fb0 f31746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3133cf0 f31747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2072Mb0 f31748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C5138sc f31749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2293Qi f31750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f31751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final WeakReference f31752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C5974zF f31753m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C4845qH f31754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C4337mF f31755w;

    C4455nB(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, C5011rb0 c5011rb0, C3502fb0 c3502fb0, C3133cf0 c3133cf0, C2072Mb0 c2072Mb0, View view, InterfaceC1750Fw interfaceC1750Fw, C5138sc c5138sc, C2293Qi c2293Qi, C2397Si c2397Si, RunnableC3886ie0 runnableC3886ie0, C5974zF c5974zF, C4845qH c4845qH, C4337mF c4337mF, Set set) {
        this.f31741a = context;
        this.f31742b = executor;
        this.f31743c = executor2;
        this.f31744d = scheduledExecutorService;
        this.f31745e = c5011rb0;
        this.f31746f = c3502fb0;
        this.f31747g = c3133cf0;
        this.f31748h = c2072Mb0;
        this.f31749i = c5138sc;
        this.f31751k = new WeakReference(view);
        this.f31752l = new WeakReference(interfaceC1750Fw);
        this.f31750j = c2293Qi;
        this.f31753m = c5974zF;
        this.f31754v = c4845qH;
        this.f31755w = c4337mF;
        this.f31737G = set;
    }

    private final void F0(final int i10, final int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.f31751k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            v();
        } else {
            this.f31744d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.jB
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f30332a.j(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final void v() {
        String strK;
        int i10;
        C3502fb0 c3502fb0 = this.f31746f;
        List list = c3502fb0.f28401d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.lf)).booleanValue() && this.f31740J == null) {
            this.f31740J = G4.t.l().u().m(this.f31737G, this.f31745e.f32990a.f31840a.f35798g);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29962s4)).booleanValue()) {
            strK = this.f31749i.b().k(this.f31741a, (View) this.f31751k.get(), null);
        } else {
            strK = null;
        }
        if ((((Boolean) H4.B.c().d(AbstractC3892ii.f29750Z0)).booleanValue() && this.f31745e.f32991b.f32672b.f29461h) || !((Boolean) AbstractC4019jj.f30553h.e()).booleanValue()) {
            this.f31748h.a(this.f31747g.b(this.f31745e, c3502fb0, false, strK, null, w(), this.f31755w, this.f31740J), this.f31754v);
            return;
        }
        if (((Boolean) AbstractC4019jj.f30552g.e()).booleanValue() && ((i10 = c3502fb0.f28397b) == 1 || i10 == 2 || i10 == 5)) {
        }
        AbstractC5685wx0.r((AbstractC4678ox0) AbstractC5685wx0.i(AbstractC4678ox0.B(AbstractC5685wx0.a(null)), ((Long) H4.B.c().d(AbstractC3892ii.f29521C1)).longValue(), TimeUnit.MILLISECONDS, this.f31744d), new C3701hB(this, strK), this.f31742b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List w() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Rc)).booleanValue()) {
            G4.t.g();
            Context context = this.f31741a;
            if (K4.F0.g(context)) {
                G4.t.g();
                Integer numJ0 = K4.F0.j0(context);
                if (numJ0 != null) {
                    int iMin = Math.min(numJ0.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f31746f.f28401d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.f31746f.f28401d;
    }

    final /* synthetic */ C1640Dt D0() {
        return this.f31740J;
    }

    final /* synthetic */ Context K() {
        return this.f31741a;
    }

    final /* synthetic */ C5011rb0 N() {
        return this.f31745e;
    }

    final /* synthetic */ C3502fb0 P() {
        return this.f31746f;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
        C3133cf0 c3133cf0 = this.f31747g;
        C5011rb0 c5011rb0 = this.f31745e;
        C2072Mb0 c2072Mb0 = this.f31748h;
        C3502fb0 c3502fb0 = this.f31746f;
        c2072Mb0.a(c3133cf0.a(c5011rb0, c3502fb0, c3502fb0.f28411i), null);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4717pG
    public final void e(H4.Z0 z9) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29773b2)).booleanValue()) {
            int i10 = z9.f1252a;
            C3502fb0 c3502fb0 = this.f31746f;
            ArrayList arrayList = new ArrayList();
            for (String str : c3502fb0.f28423o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 2);
                sb.append("2.");
                sb.append(i10);
                arrayList.add(C3133cf0.d(str, "@gw_mpe@", sb.toString()));
            }
            this.f31748h.a(this.f31747g.a(this.f31745e, c3502fb0, arrayList), null);
        }
    }

    final /* synthetic */ C3133cf0 g0() {
        return this.f31747g;
    }

    final /* synthetic */ void i() {
        this.f31742b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lB
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f31216a.v();
            }
        });
    }

    final /* synthetic */ void j(final int i10, final int i11) {
        this.f31742b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kB
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f30715a.u(i10, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        if (this.f31739I.compareAndSet(false, true)) {
            int iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.f29514B4)).intValue();
            if (iIntValue > 0) {
                F0(iIntValue, ((Integer) H4.B.c().d(AbstractC3892ii.f29524C4)).intValue());
                return;
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29504A4)).booleanValue()) {
                this.f31743c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iB
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f29294a.i();
                    }
                });
            } else {
                v();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        if (!(((Boolean) H4.B.c().d(AbstractC3892ii.f29750Z0)).booleanValue() && this.f31745e.f32991b.f32672b.f29461h) && ((Boolean) AbstractC4019jj.f30549d.e()).booleanValue()) {
            AbstractC5685wx0.r((AbstractC4678ox0) AbstractC5685wx0.g(AbstractC4678ox0.B(this.f31750j.b()), Throwable.class, C4329mB.f31456a, AbstractC2315Qt.f22479g), new C3575gB(this), this.f31742b);
            return;
        }
        C2072Mb0 c2072Mb0 = this.f31748h;
        C3133cf0 c3133cf0 = this.f31747g;
        C5011rb0 c5011rb0 = this.f31745e;
        C3502fb0 c3502fb0 = this.f31746f;
        c2072Mb0.b(c3133cf0.a(c5011rb0, c3502fb0, c3502fb0.f28399c), true == G4.t.l().v(this.f31741a) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(InterfaceC1896Ir interfaceC1896Ir, String str, String str2) {
        C3133cf0 c3133cf0 = this.f31747g;
        C2072Mb0 c2072Mb0 = this.f31748h;
        C3502fb0 c3502fb0 = this.f31746f;
        c2072Mb0.a(c3133cf0.c(c3502fb0, c3502fb0.f28409h, interfaceC1896Ir), null);
    }

    final /* synthetic */ C2072Mb0 s0() {
        return this.f31748h;
    }

    final /* synthetic */ C4845qH t0() {
        return this.f31754v;
    }

    final /* synthetic */ void u(int i10, int i11) {
        F0(i10 - 1, i11);
    }

    final /* synthetic */ C4337mF w0() {
        return this.f31755w;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
        C3133cf0 c3133cf0 = this.f31747g;
        C5011rb0 c5011rb0 = this.f31745e;
        C2072Mb0 c2072Mb0 = this.f31748h;
        C3502fb0 c3502fb0 = this.f31746f;
        c2072Mb0.a(c3133cf0.a(c5011rb0, c3502fb0, c3502fb0.f28407g), null);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final synchronized void zzg() {
        C5974zF c5974zF;
        try {
            if (this.f31738H) {
                ArrayList arrayList = new ArrayList(w());
                C3502fb0 c3502fb0 = this.f31746f;
                arrayList.addAll(c3502fb0.f28405f);
                this.f31748h.a(this.f31747g.b(this.f31745e, c3502fb0, true, null, null, arrayList, null, null), null);
            } else {
                C2072Mb0 c2072Mb0 = this.f31748h;
                C3133cf0 c3133cf0 = this.f31747g;
                C5011rb0 c5011rb0 = this.f31745e;
                C3502fb0 c3502fb1 = this.f31746f;
                c2072Mb0.a(c3133cf0.a(c5011rb0, c3502fb1, c3502fb1.f28419m), null);
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f30017x4)).booleanValue() && (c5974zF = this.f31753m) != null) {
                    List list = c5974zF.b().f28419m;
                    String strG = c5974zF.c().g();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C3133cf0.d((String) it.next(), "@gw_adnetstatus@", strG));
                    }
                    long jH = c5974zF.c().h();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        arrayList3.add(C3133cf0.d((String) obj, "@gw_ttr@", Long.toString(jH, 10)));
                    }
                    c2072Mb0.a(c3133cf0.a(c5974zF.a(), c5974zF.b(), arrayList3), null);
                }
                c2072Mb0.a(c3133cf0.a(c5011rb0, c3502fb1, c3502fb1.f28405f), null);
            }
            this.f31738H = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3467fK
    public final void zzi() {
        C3133cf0 c3133cf0 = this.f31747g;
        C5011rb0 c5011rb0 = this.f31745e;
        C2072Mb0 c2072Mb0 = this.f31748h;
        C3502fb0 c3502fb0 = this.f31746f;
        c2072Mb0.a(c3133cf0.a(c5011rb0, c3502fb0, c3502fb0.f28436u0), null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5726xH
    public final void zzk() {
        C3502fb0 c3502fb0 = this.f31746f;
        if (c3502fb0.f28403e == 4) {
            this.f31748h.a(this.f31747g.a(this.f31745e, c3502fb0, c3502fb0.f28362A0), null);
        }
    }
}
