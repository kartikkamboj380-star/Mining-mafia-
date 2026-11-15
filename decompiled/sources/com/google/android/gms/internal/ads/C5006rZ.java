package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5006rZ implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5860yL f32978b;

    public C5006rZ(Context context, AbstractC5860yL abstractC5860yL) {
        this.f32977a = context;
        this.f32978b = abstractC5860yL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        try {
            InterfaceC5542vp interfaceC5542vp = (InterfaceC5542vp) c4753pY.f32419b;
            interfaceC5542vp.u0(c3502fb0.f28394Z);
            interfaceC5542vp.N1(c3502fb0.f28389U, c3502fb0.f28437v.toString(), c5011rb0.f32990a.f31840a.f35795d, com.google.android.gms.dynamic.b.N0(this.f32977a), new BinderC4881qZ(this, c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c);
        } catch (RemoteException e10) {
            AbstractC0786o0.l("Remote exception loading a interstitial RTB ad", e10);
            throw new C1761Gb0(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        C4377mZ c4377mZ = new C4377mZ(c3502fb0, (InterfaceC5542vp) c4753pY.f32419b, B4.b.INTERSTITIAL);
        RK rkD = this.f32978b.d(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new UK(c4377mZ, null));
        c4377mZ.b(rkD.d());
        ((BinderC3120cZ) c4753pY.f32420c).z6(rkD.g());
        return rkD.h();
    }
}
