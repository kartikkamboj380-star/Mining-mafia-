package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4559o00 implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f31922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RP f31923c;

    public C4559o00(Context context, Executor executor, RP rp) {
        this.f31921a = context;
        this.f31922b = executor;
        this.f31923c = rp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        try {
            C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
            if (c6019zb0.f35807p.f31543a == 3) {
                ((C2696Yb0) c4753pY.f32419b).C(this.f31921a, c6019zb0.f35795d, c3502fb0.f28437v.toString(), (InterfaceC1578Co) c4753pY.f32420c);
            } else {
                ((C2696Yb0) c4753pY.f32419b).A(this.f31921a, c6019zb0.f35795d, c3502fb0.f28437v.toString(), (InterfaceC1578Co) c4753pY.f32420c);
            }
        } catch (Exception e10) {
            String str = c4753pY.f32418a;
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        NP npA = this.f31923c.a(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new OP(new C4433n00(this, c4753pY, c3502fb0)));
        npA.a().b1(new QA((C2696Yb0) c4753pY.f32419b), this.f31922b);
        ((BinderC3120cZ) c4753pY.f32420c).z6(npA.m());
        return npA.h();
    }
}
