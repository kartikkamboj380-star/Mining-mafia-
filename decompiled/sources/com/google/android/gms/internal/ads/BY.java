package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class BY implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SB f17644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f17645c;

    BY(Context context, SB sb, Executor executor) {
        this.f17643a = context;
        this.f17644b = sb;
        this.f17645c = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        C2696Yb0 c2696Yb0 = (C2696Yb0) c4753pY.f32419b;
        C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
        String string = c3502fb0.f28437v.toString();
        c2696Yb0.D(this.f17643a, c6019zb0.f35795d, string, (InterfaceC1578Co) c4753pY.f32420c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        PB pbA = this.f17644b.a(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new UK(new AY(this, c4753pY, c3502fb0), null), new QB(c3502fb0.f28396a0));
        pbA.a().b1(new QA((C2696Yb0) c4753pY.f32419b), this.f17645c);
        ((BinderC3120cZ) c4753pY.f32420c).z6(pbA.f());
        return pbA.h();
    }
}
