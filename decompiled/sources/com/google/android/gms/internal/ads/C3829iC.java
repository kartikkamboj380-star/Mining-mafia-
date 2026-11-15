package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import K4.AbstractC0786o0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3829iC extends AbstractC3325eC {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f29296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f29297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1750Fw f29298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C3628gb0 f29299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC4459nD f29300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final YM f29301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C4851qK f29302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC2978bQ0 f29303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f29304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private H4.m2 f29305u;

    C3829iC(C4585oD c4585oD, Context context, C3628gb0 c3628gb0, View view, InterfaceC1750Fw interfaceC1750Fw, InterfaceC4459nD interfaceC4459nD, YM ym, C4851qK c4851qK, InterfaceC2978bQ0 interfaceC2978bQ0, Executor executor) {
        super(c4585oD);
        this.f29296l = context;
        this.f29297m = view;
        this.f29298n = interfaceC1750Fw;
        this.f29299o = c3628gb0;
        this.f29300p = interfaceC4459nD;
        this.f29301q = ym;
        this.f29302r = c4851qK;
        this.f29303s = interfaceC2978bQ0;
        this.f29304t = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4711pD
    public final void b() {
        this.f29304t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gC
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f28596a.t();
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final View l() {
        return this.f29297m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final void m(ViewGroup viewGroup, H4.m2 m2Var) {
        InterfaceC1750Fw interfaceC1750Fw;
        if (viewGroup == null || (interfaceC1750Fw = this.f29298n) == null) {
            return;
        }
        interfaceC1750Fw.S0(C2479Tx.a(m2Var));
        viewGroup.setMinimumHeight(m2Var.f1373c);
        viewGroup.setMinimumWidth(m2Var.f1376f);
        this.f29305u = m2Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final InterfaceC0591d1 n() {
        try {
            return this.f29300p.zza();
        } catch (C1761Gb0 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final C3628gb0 o() {
        H4.m2 m2Var = this.f29305u;
        if (m2Var != null) {
            return AbstractC1709Fb0.b(m2Var);
        }
        C3502fb0 c3502fb0 = this.f32336b;
        if (c3502fb0.f28400c0) {
            for (String str : c3502fb0.f28395a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f29297m;
            return new C3628gb0(view.getWidth(), view.getHeight(), false);
        }
        return (C3628gb0) c3502fb0.f28429r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final C3628gb0 p() {
        return this.f29299o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final int q() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29802d9)).booleanValue() && this.f32336b.f28408g0) {
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29813e9)).booleanValue()) {
                return 0;
            }
        }
        return this.f32335a.f32991b.f32672b.f29456c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final int r() {
        return this.f32335a.f32991b.f32672b.f29457d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3325eC
    public final void s() {
        this.f29302r.zza();
    }

    final /* synthetic */ void t() {
        InterfaceC1986Kk interfaceC1986KkD = this.f29301q.d();
        if (interfaceC1986KkD == null) {
            return;
        }
        try {
            interfaceC1986KkD.Y4((H4.W) this.f29303s.zzb(), com.google.android.gms.dynamic.b.N0(this.f29296l));
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("RemoteException when notifyAdLoad is called", e10);
        }
    }
}
