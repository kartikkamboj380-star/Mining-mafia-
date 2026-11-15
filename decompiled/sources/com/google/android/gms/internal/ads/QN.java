package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class QN implements InterfaceC5220tG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OM f22354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TM f22355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f22357d;

    public QN(OM om, TM tm, Executor executor, Executor executor2) {
        this.f22354a = om;
        this.f22355b = tm;
        this.f22356c = executor;
        this.f22357d = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final InterfaceC1750Fw interfaceC1750Fw) {
        this.f22356c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.PN
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                interfaceC1750Fw.b("onSdkImpression", new p190t.a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        if (this.f22355b.d()) {
            OM om = this.f22354a;
            C3747hY c3747hYZ = om.z();
            if (c3747hYZ == null && om.x() != null && ((Boolean) H4.B.c().d(AbstractC3892ii.f29942q6)).booleanValue()) {
                com.google.common.util.concurrent.p pVarX = om.x();
                C2575Vt c2575VtY = om.y();
                if (pVarX == null || c2575VtY == null) {
                    return;
                }
                AbstractC5685wx0.r(AbstractC5685wx0.q(pVarX, c2575VtY), new ON(this), this.f22357d);
                return;
            }
            if (c3747hYZ != null) {
                InterfaceC1750Fw interfaceC1750FwW = om.w();
                InterfaceC1750Fw interfaceC1750FwT = om.t();
                if (interfaceC1750FwW == null) {
                    interfaceC1750FwW = interfaceC1750FwT == null ? null : interfaceC1750FwT;
                }
                if (interfaceC1750FwW != null) {
                    a(interfaceC1750FwW);
                }
            }
        }
    }
}
