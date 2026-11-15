package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4629oZ implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5860yL f32105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L4.a f32106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f32107d;

    public C4629oZ(Context context, L4.a aVar, AbstractC5860yL abstractC5860yL, Executor executor) {
        this.f32104a = context;
        this.f32106c = aVar;
        this.f32105b = abstractC5860yL;
        this.f32107d = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        C2696Yb0 c2696Yb0 = (C2696Yb0) c4753pY.f32419b;
        C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
        String string = c3502fb0.f28437v.toString();
        String strM = K4.S.m(c3502fb0.f28431s);
        c2696Yb0.m(this.f32104a, c6019zb0.f35795d, string, strM, (InterfaceC1578Co) c4753pY.f32420c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        RK rkD = this.f32105b.d(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new UK(new C4503nZ(this, c4753pY, c3502fb0), null));
        rkD.a().b1(new QA((C2696Yb0) c4753pY.f32419b), this.f32107d);
        ((BinderC3120cZ) c4753pY.f32420c).z6(rkD.f());
        return rkD.h();
    }

    final /* synthetic */ L4.a c() {
        return this.f32106c;
    }
}
