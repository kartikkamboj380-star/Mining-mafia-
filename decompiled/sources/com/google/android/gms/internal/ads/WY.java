package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class WY implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LC f24804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f24805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1786Go f24806d;

    public WY(Context context, LC lc) {
        this.f24803a = context;
        this.f24804b = lc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        try {
            InterfaceC5542vp interfaceC5542vp = (InterfaceC5542vp) c4753pY.f32419b;
            interfaceC5542vp.u0(c3502fb0.f28394Z);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29802d9)).booleanValue() && c3502fb0.f28408g0) {
                String str = c3502fb0.f28389U;
                String string = c3502fb0.f28437v.toString();
                C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
                interfaceC5542vp.K4(str, string, c6019zb0.f35795d, com.google.android.gms.dynamic.b.N0(this.f24803a), new VY(this, c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c, c6019zb0.f35797f);
                return;
            }
            String str2 = c3502fb0.f28389U;
            String string2 = c3502fb0.f28437v.toString();
            C6019zb0 c6019zb1 = c5011rb0.f32990a.f31840a;
            interfaceC5542vp.n1(str2, string2, c6019zb1.f35795d, com.google.android.gms.dynamic.b.N0(this.f24803a), new VY(this, c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c, c6019zb1.f35797f);
        } catch (RemoteException e10) {
            throw new C1761Gb0(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, final C3502fb0 c3502fb0, final C4753pY c4753pY) throws C1761Gb0 {
        final View view;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29802d9)).booleanValue() && c3502fb0.f28408g0) {
            try {
                view = (View) com.google.android.gms.dynamic.b.h0(this.f24806d.zze());
                boolean zB = this.f24806d.b();
                if (view == null) {
                    throw new C1761Gb0(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zB) {
                    try {
                        view = (View) AbstractC5685wx0.j(AbstractC5685wx0.a(null), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.TY
                            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                                return this.f23544a.c(view, c3502fb0, obj);
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
            view = this.f24805c;
        }
        AbstractC3451fC abstractC3451fCE = this.f24804b.e(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new C4331mC(view, null, new InterfaceC4459nD() { // from class: com.google.android.gms.internal.ads.UY
            @Override // com.google.android.gms.internal.ads.InterfaceC4459nD
            public final /* synthetic */ InterfaceC0591d1 zza() throws C1761Gb0 {
                try {
                    return ((InterfaceC5542vp) c4753pY.f32419b).c();
                } catch (RemoteException e12) {
                    throw new C1761Gb0(e12);
                }
            }
        }, (C3628gb0) c3502fb0.f28435u.get(0)));
        abstractC3451fCE.j().j1(view);
        ((BinderC3120cZ) c4753pY.f32420c).z6(abstractC3451fCE.g());
        return abstractC3451fCE.h();
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(View view, C3502fb0 c3502fb0, Object obj) {
        return AbstractC5685wx0.a(ViewTreeObserverOnScrollChangedListenerC2825aD.a(this.f24803a, view, c3502fb0));
    }

    final /* synthetic */ void d(View view) {
        this.f24805c = view;
    }

    final /* synthetic */ void e(InterfaceC1786Go interfaceC1786Go) {
        this.f24806d = interfaceC1786Go;
    }
}
