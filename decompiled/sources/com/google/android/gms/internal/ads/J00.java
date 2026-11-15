package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class J00 implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f19709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RP f19710c;

    public J00(Context context, Executor executor, RP rp) {
        this.f19708a = context;
        this.f19709b = executor;
        this.f19710c = rp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        try {
            ((C2696Yb0) c4753pY.f32419b).q(c5011rb0.f32990a.f31840a.f35795d, c3502fb0.f28437v.toString());
        } catch (Exception e10) {
            String str = c4753pY.f32418a;
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        C2696Yb0 c2696Yb0 = (C2696Yb0) c4753pY.f32419b;
        if (c2696Yb0.s()) {
            e(c5011rb0, c3502fb0, c4753pY);
            return;
        }
        G00 g00 = new G00(this, c5011rb0, c3502fb0, c4753pY);
        KG kg = c4753pY.f32420c;
        ((BinderC3246dZ) kg).A6(g00);
        Context context = this.f19708a;
        C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
        String string = c3502fb0.f28437v.toString();
        c2696Yb0.p(context, c6019zb0.f35795d, null, (InterfaceC2467Tr) kg, string);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        NP npA = this.f19710c.a(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new OP(new H00(this, c4753pY, c3502fb0)));
        npA.a().b1(new QA((C2696Yb0) c4753pY.f32419b), this.f19709b);
        HG hgB = npA.b();
        XF xfC = npA.c();
        ((BinderC3246dZ) c4753pY.f32420c).z6(new I00(this, npA.i(), xfC, hgB, npA.k()));
        return npA.h();
    }

    final /* synthetic */ Executor c() {
        return this.f19709b;
    }
}
