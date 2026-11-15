package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5840yB implements InterfaceC5520ve, InterfaceC5472vG, J4.B, InterfaceC5220tG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5210tB f35286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5336uB f35287b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4659oo f35289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f35290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Clock f35291f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f35288c = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f35292g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C5714xB f35293h = new C5714xB();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35294i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f35295j = new WeakReference(this);

    public C5840yB(C4281lo c4281lo, C5336uB c5336uB, Executor executor, C5210tB c5210tB, Clock clock) {
        this.f35286a = c5210tB;
        InterfaceC2511Un interfaceC2511Un = AbstractC2667Xn.f25386a;
        this.f35289d = c4281lo.a("google.afma.activeView.handleUpdate", interfaceC2511Un, interfaceC2511Un);
        this.f35287b = c5336uB;
        this.f35290e = executor;
        this.f35291f = clock;
    }

    private final void k() {
        Iterator it = this.f35288c.iterator();
        while (it.hasNext()) {
            this.f35286a.c((InterfaceC1750Fw) it.next());
        }
        this.f35286a.d();
    }

    @Override // J4.B
    public final void B2() {
    }

    @Override // J4.B
    public final synchronized void F4() {
        this.f35293h.f34755b = true;
        b();
    }

    @Override // J4.B
    public final void H1() {
    }

    @Override // J4.B
    public final void N0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final synchronized void P(Context context) {
        this.f35293h.f34755b = true;
        b();
    }

    @Override // J4.B
    public final void S3(int i10) {
    }

    @Override // J4.B
    public final void Z1() {
    }

    @Override // J4.B
    public final void Z2() {
    }

    @Override // J4.B
    public final synchronized void Z4() {
        this.f35293h.f34755b = false;
        b();
    }

    public final synchronized void b() {
        try {
            if (this.f35295j.get() == null) {
                g();
                return;
            }
            if (this.f35294i || !this.f35292g.get()) {
                return;
            }
            try {
                C5714xB c5714xB = this.f35293h;
                c5714xB.f34757d = this.f35291f.elapsedRealtime();
                final JSONObject jSONObjectA = this.f35287b.zzb(c5714xB);
                for (final InterfaceC1750Fw interfaceC1750Fw : this.f35288c) {
                    this.f35290e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wB
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectA;
                            String string = jSONObject.toString();
                            StringBuilder sb = new StringBuilder(string.length() + 31);
                            sb.append("Calling AFMA_updateActiveView(");
                            sb.append(string);
                            sb.append(")");
                            String string2 = sb.toString();
                            int i10 = AbstractC0786o0.f2696b;
                            L4.p.a(string2);
                            interfaceC1750Fw.zzb("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                AbstractC2471Tt.b(this.f35289d.zzb(jSONObjectA), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e10) {
                AbstractC0786o0.l("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // J4.B
    public final void b4() {
    }

    @Override // J4.B
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final synchronized void e(Context context) {
        this.f35293h.f34758e = "u";
        b();
        k();
        this.f35294i = true;
    }

    public final synchronized void g() {
        k();
        this.f35294i = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final synchronized void h(Context context) {
        this.f35293h.f34755b = false;
        b();
    }

    public final synchronized void i(InterfaceC1750Fw interfaceC1750Fw) {
        this.f35288c.add(interfaceC1750Fw);
        this.f35286a.b(interfaceC1750Fw);
    }

    public final void j(Object obj) {
        this.f35295j = new WeakReference(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final synchronized void m() {
        if (this.f35292g.compareAndSet(false, true)) {
            this.f35286a.a(this);
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520ve
    public final synchronized void s0(C5394ue c5394ue) {
        C5714xB c5714xB = this.f35293h;
        c5714xB.f34754a = c5394ue.f33869j;
        c5714xB.f34759f = c5394ue;
        b();
    }

    @Override // J4.B
    public final void t4() {
    }
}
