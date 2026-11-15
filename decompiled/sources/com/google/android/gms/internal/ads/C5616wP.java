package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5616wP {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.a f34538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f34539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QR f34540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f34541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5138sc f34542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L4.a f34543g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C5884yX f34545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C3636gf0 f34546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final KX f34547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1605Db0 f34548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.p f34549m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3979jP f34537a = new C3979jP();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3272dm f34544h = new C3272dm();

    C5616wP(CallableC5364uP callableC5364uP) {
        this.f34539c = callableC5364uP.b();
        this.f34541e = callableC5364uP.e();
        this.f34542f = callableC5364uP.f();
        this.f34543g = callableC5364uP.g();
        this.f34538b = callableC5364uP.a();
        this.f34545i = callableC5364uP.d();
        this.f34546j = callableC5364uP.h();
        this.f34540d = callableC5364uP.c();
        this.f34547k = callableC5364uP.i();
        this.f34548l = callableC5364uP.j();
    }

    public final synchronized void a() {
        String str = (String) H4.B.c().d(AbstractC3892ii.f29544E4);
        C5138sc c5138sc = this.f34542f;
        G4.a aVar = this.f34538b;
        KX kx = this.f34547k;
        com.google.common.util.concurrent.p pVarK = AbstractC5685wx0.k(C2633Ww.b(this.f34539c, this.f34543g, str, c5138sc, aVar, kx, this.f34548l, this.f34540d), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.tP
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) obj;
                this.f33396a.i(interfaceC1750Fw);
                return interfaceC1750Fw;
            }
        }, this.f34541e);
        this.f34549m = pVarK;
        AbstractC2471Tt.a(pVarK, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void b() {
        com.google.common.util.concurrent.p pVar = this.f34549m;
        if (pVar == null) {
            return;
        }
        AbstractC5685wx0.r(pVar, new C4105kP(this), this.f34541e);
        this.f34549m = null;
    }

    public final synchronized com.google.common.util.concurrent.p c(final String str, final JSONObject jSONObject) {
        com.google.common.util.concurrent.p pVar = this.f34549m;
        if (pVar == null) {
            return AbstractC5685wx0.a(null);
        }
        return AbstractC5685wx0.j(pVar, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.sP
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f33156a.j(str, jSONObject, (InterfaceC1750Fw) obj);
            }
        }, this.f34541e);
    }

    public final synchronized void d(String str, InterfaceC2091Ml interfaceC2091Ml) {
        com.google.common.util.concurrent.p pVar = this.f34549m;
        if (pVar == null) {
            return;
        }
        AbstractC5685wx0.r(pVar, new C4357mP(this, str, interfaceC2091Ml), this.f34541e);
    }

    public final synchronized void e(String str, InterfaceC2091Ml interfaceC2091Ml) {
        com.google.common.util.concurrent.p pVar = this.f34549m;
        if (pVar == null) {
            return;
        }
        AbstractC5685wx0.r(pVar, new C4483nP(this, str, interfaceC2091Ml), this.f34541e);
    }

    public final synchronized void f(String str, Map map) {
        com.google.common.util.concurrent.p pVar = this.f34549m;
        if (pVar == null) {
            return;
        }
        AbstractC5685wx0.r(pVar, new C4609oP(this, "sendMessageToNativeJs", map), this.f34541e);
    }

    public final synchronized void g(C3502fb0 c3502fb0, C3880ib0 c3880ib0, C2821aB c2821aB) {
        com.google.common.util.concurrent.p pVar = this.f34549m;
        if (pVar == null) {
            return;
        }
        AbstractC5685wx0.r(pVar, new C4735pP(this, c3502fb0, c3880ib0, c2821aB), this.f34541e);
    }

    public final void h(WeakReference weakReference, String str, InterfaceC2091Ml interfaceC2091Ml) {
        d(str, new C5490vP(this, weakReference, str, interfaceC2091Ml, null));
    }

    final /* synthetic */ InterfaceC1750Fw i(InterfaceC1750Fw interfaceC1750Fw) {
        interfaceC1750Fw.c0("/result", this.f34544h);
        InterfaceC1856Hx interfaceC1856HxL = interfaceC1750Fw.L();
        G4.b bVar = new G4.b(this.f34539c, null, null);
        C5884yX c5884yX = this.f34545i;
        C3636gf0 c3636gf0 = this.f34546j;
        QR qr = this.f34540d;
        C3979jP c3979jP = this.f34537a;
        interfaceC1856HxL.A0(null, c3979jP, c3979jP, c3979jP, c3979jP, false, null, bVar, null, null, c5884yX, c3636gf0, qr, null, null, null, null, null, null, null, null, null);
        return interfaceC1750Fw;
    }

    final /* synthetic */ com.google.common.util.concurrent.p j(String str, JSONObject jSONObject, InterfaceC1750Fw interfaceC1750Fw) {
        return this.f34544h.c(interfaceC1750Fw, str, jSONObject);
    }

    final /* synthetic */ C3979jP k() {
        return this.f34537a;
    }

    final /* synthetic */ QR l() {
        return this.f34540d;
    }

    final /* synthetic */ C5884yX m() {
        return this.f34545i;
    }

    final /* synthetic */ C3636gf0 n() {
        return this.f34546j;
    }
}
