package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import K4.C0794u;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class NY implements InterfaceC4375mY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LC f21273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3857iQ f21275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6019zb0 f21276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f21277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1899Is0 f21278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JR f21279g;

    public NY(LC lc, Context context, Executor executor, C3857iQ c3857iQ, C6019zb0 c6019zb0, InterfaceC1899Is0 interfaceC1899Is0, JR jr) {
        this.f21274b = context;
        this.f21273a = lc;
        this.f21277e = executor;
        this.f21275c = c3857iQ;
        this.f21276d = c6019zb0;
        this.f21278f = interfaceC1899Is0;
        this.f21279g = jr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final boolean a(C5011rb0 c5011rb0, C3502fb0 c3502fb0) {
        C4130kb0 c4130kb0 = c3502fb0.f28431s;
        return (c4130kb0 == null || c4130kb0.f30842a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final com.google.common.util.concurrent.p b(final C5011rb0 c5011rb0, final C3502fb0 c3502fb0) {
        return AbstractC5685wx0.j(AbstractC5685wx0.a(null), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.MY
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f20856a.c(c5011rb0, c3502fb0, obj);
            }
        }, this.f21277e);
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(C5011rb0 c5011rb0, C3502fb0 c3502fb0, Object obj) throws C2581Vw {
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.f29632N2;
        if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue()) {
            this.f21279g.e().putLong(EnumC5746xR.RENDERING_WEBVIEW_CREATION_START.c(), G4.t.o().currentTimeMillis());
        }
        Context context = this.f21274b;
        H4.m2 m2VarA = AbstractC1709Fb0.a(context, c3502fb0.f28435u);
        final InterfaceC1750Fw interfaceC1750FwA = this.f21275c.a(m2VarA, c3502fb0, c5011rb0.f32991b.f32672b);
        interfaceC1750FwA.E0(c3502fb0.f28391W);
        View viewA = (((Boolean) H4.B.c().d(AbstractC3892ii.f29802d9)).booleanValue() && c3502fb0.f28408g0) ? ViewTreeObserverOnScrollChangedListenerC2825aD.a(context, interfaceC1750FwA.B(), c3502fb0) : new C4233lQ(context, interfaceC1750FwA.B(), (C0794u) this.f21278f.apply(c3502fb0));
        if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue()) {
            this.f21279g.e().putLong(EnumC5746xR.RENDERING_WEBVIEW_CREATION_END.c(), G4.t.o().currentTimeMillis());
        }
        LC lc = this.f21273a;
        final AbstractC3451fC abstractC3451fCE = lc.e(new FD(c5011rb0, c3502fb0, null), new C4331mC(viewA, interfaceC1750FwA, new InterfaceC4459nD() { // from class: com.google.android.gms.internal.ads.IY
            @Override // com.google.android.gms.internal.ads.InterfaceC4459nD
            public final /* synthetic */ InterfaceC0591d1 zza() {
                return interfaceC1750FwA.c();
            }
        }, AbstractC1709Fb0.b(m2VarA)));
        if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue()) {
            this.f21279g.e().putLong(EnumC5746xR.RENDERING_AD_COMPONENT_CREATION_END.c(), G4.t.o().currentTimeMillis());
        }
        C3731hQ c3731hQI = abstractC3451fCE.i();
        JR jr = this.f21279g;
        c3731hQI.i(interfaceC1750FwA, false, null, jr.e());
        C4968rG c4968rGD = abstractC3451fCE.d();
        InterfaceC5220tG interfaceC5220tG = new InterfaceC5220tG() { // from class: com.google.android.gms.internal.ads.JY
            @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
            public final /* synthetic */ void m() {
                InterfaceC1750Fw interfaceC1750Fw = interfaceC1750FwA;
                if (interfaceC1750Fw.L() != null) {
                    interfaceC1750Fw.L().a();
                }
            }
        };
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22479g;
        c4968rGD.b1(interfaceC5220tG, interfaceExecutorServiceC1805Gx0);
        C4130kb0 c4130kb0 = c3502fb0.f28431s;
        String strA = c4130kb0.f30842a;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29898m6)).booleanValue() && abstractC3451fCE.l().a(true)) {
            strA = AbstractC1492Ax.a(strA, AbstractC1492Ax.b(c3502fb0));
        }
        abstractC3451fCE.i();
        com.google.common.util.concurrent.p pVarJ = C3731hQ.j(interfaceC1750FwA, c4130kb0.f30843b, strA, jr.e(), lc.d());
        if (c3502fb0.f28381M) {
            pVarJ.e(new Runnable() { // from class: com.google.android.gms.internal.ads.HY
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    interfaceC1750FwA.Q();
                }
            }, this.f21277e);
        }
        pVarJ.e(new Runnable() { // from class: com.google.android.gms.internal.ads.KY
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f20222a.d(interfaceC1750FwA);
            }
        }, this.f21277e);
        return AbstractC5685wx0.k(pVarJ, new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.LY
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj2) {
                return abstractC3451fCE.h();
            }
        }, interfaceExecutorServiceC1805Gx0);
    }

    final /* synthetic */ void d(InterfaceC1750Fw interfaceC1750Fw) {
        interfaceC1750Fw.F();
        C6019zb0 c6019zb0 = this.f21276d;
        BinderC4425mx binderC4425mxC = interfaceC1750Fw.c();
        H4.a2 a2Var = c6019zb0.f35792a;
        if (a2Var != null && binderC4425mxC != null) {
            binderC4425mxC.z6(a2Var);
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29651P1)).booleanValue() || interfaceC1750Fw.isAttachedToWindow()) {
            return;
        }
        interfaceC1750Fw.onPause();
        interfaceC1750Fw.y0(true);
    }
}
