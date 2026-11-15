package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import K4.AbstractC0786o0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class RY implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LC f22843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22844c;

    public RY(Context context, LC lc, Executor executor) {
        this.f22842a = context;
        this.f22843b = lc;
        this.f22844c = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        H4.m2 m2Var;
        C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
        H4.m2 m2Var2 = c6019zb0.f35797f;
        if (m2Var2.f1384v) {
            m2Var = new H4.m2(this.f22842a, B4.z.b(m2Var2.f1375e, m2Var2.f1372b));
        } else {
            m2Var = (((Boolean) H4.B.c().d(AbstractC3892ii.f29802d9)).booleanValue() && c3502fb0.f28408g0) ? new H4.m2(this.f22842a, B4.z.c(m2Var2.f1375e, m2Var2.f1372b)) : AbstractC1709Fb0.a(this.f22842a, c3502fb0.f28435u);
        }
        H4.m2 m2Var3 = m2Var;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29802d9)).booleanValue() && c3502fb0.f28408g0) {
            ((C2696Yb0) c4753pY.f32419b).g(this.f22842a, m2Var3, c6019zb0.f35795d, c3502fb0.f28437v.toString(), K4.S.m(c3502fb0.f28431s), (InterfaceC1578Co) c4753pY.f32420c);
        } else {
            ((C2696Yb0) c4753pY.f32419b).l(this.f22842a, m2Var3, c6019zb0.f35795d, c3502fb0.f28437v.toString(), K4.S.m(c3502fb0.f28431s), (InterfaceC1578Co) c4753pY.f32420c);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, final C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        final View viewF;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29802d9)).booleanValue() && c3502fb0.f28408g0) {
            InterfaceC1786Go interfaceC1786GoH = ((C2696Yb0) c4753pY.f32419b).h();
            if (interfaceC1786GoH == null) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new C1761Gb0(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewF = (View) com.google.android.gms.dynamic.b.h0(interfaceC1786GoH.zze());
                boolean zB = interfaceC1786GoH.b();
                if (viewF == null) {
                    throw new C1761Gb0(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zB) {
                    try {
                        viewF = (View) AbstractC5685wx0.j(AbstractC5685wx0.a(null), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.PY
                            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                                return this.f22128a.c(viewF, c3502fb0, obj);
                            }
                        }, AbstractC2315Qt.f22478f).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new C1761Gb0(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new C1761Gb0(e11);
            }
        } else {
            viewF = ((C2696Yb0) c4753pY.f32419b).f();
        }
        LC lc = this.f22843b;
        FD fd = new FD(c5011rb0, c3502fb0, c4753pY.f32418a);
        final C2696Yb0 c2696Yb0 = (C2696Yb0) c4753pY.f32419b;
        Objects.requireNonNull(c2696Yb0);
        AbstractC3451fC abstractC3451fCE = lc.e(fd, new C4331mC(viewF, null, new InterfaceC4459nD() { // from class: com.google.android.gms.internal.ads.QY
            @Override // com.google.android.gms.internal.ads.InterfaceC4459nD
            public final /* synthetic */ InterfaceC0591d1 zza() {
                return c2696Yb0.y();
            }
        }, (C3628gb0) c3502fb0.f28435u.get(0)));
        abstractC3451fCE.j().j1(viewF);
        abstractC3451fCE.a().b1(new QA(c2696Yb0), this.f22844c);
        ((BinderC3120cZ) c4753pY.f32420c).z6(abstractC3451fCE.f());
        return abstractC3451fCE.h();
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(View view, C3502fb0 c3502fb0, Object obj) {
        return AbstractC5685wx0.a(ViewTreeObserverOnScrollChangedListenerC2825aD.a(this.f22842a, view, c3502fb0));
    }
}
