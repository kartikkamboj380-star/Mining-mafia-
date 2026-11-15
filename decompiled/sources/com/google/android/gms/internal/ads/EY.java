package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class EY implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SB f18519b;

    EY(Context context, SB sb) {
        this.f18518a = context;
        this.f18519b = sb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        try {
            InterfaceC5542vp interfaceC5542vp = (InterfaceC5542vp) c4753pY.f32419b;
            interfaceC5542vp.u0(c3502fb0.f28394Z);
            interfaceC5542vp.a5(c3502fb0.f28389U, c3502fb0.f28437v.toString(), c5011rb0.f32990a.f31840a.f35795d, com.google.android.gms.dynamic.b.N0(this.f18518a), new DY(c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c);
        } catch (RemoteException e10) {
            AbstractC0786o0.l("Remote exception loading an app open RTB ad", e10);
            throw new C1761Gb0(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        C4377mZ c4377mZ = new C4377mZ(c3502fb0, (InterfaceC5542vp) c4753pY.f32419b, B4.b.APP_OPEN_AD);
        PB pbA = this.f18519b.a(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new UK(c4377mZ, null), new QB(c3502fb0.f28396a0));
        c4377mZ.b(pbA.d());
        ((BinderC3120cZ) c4753pY.f32420c).z6(pbA.g());
        return pbA.h();
    }
}
