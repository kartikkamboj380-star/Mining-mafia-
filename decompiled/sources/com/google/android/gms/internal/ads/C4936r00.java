package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4936r00 implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RP f32764b;

    public C4936r00(Context context, RP rp) {
        this.f32763a = context;
        this.f32764b = rp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        try {
            InterfaceC5542vp interfaceC5542vp = (InterfaceC5542vp) c4753pY.f32419b;
            interfaceC5542vp.u0(c3502fb0.f28394Z);
            C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
            if (c6019zb0.f35807p.f31543a == 3) {
                interfaceC5542vp.R5(c3502fb0.f28389U, c3502fb0.f28437v.toString(), c6019zb0.f35795d, com.google.android.gms.dynamic.b.N0(this.f32763a), new BinderC4811q00(this, c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c);
            } else {
                interfaceC5542vp.T1(c3502fb0.f28389U, c3502fb0.f28437v.toString(), c6019zb0.f35795d, com.google.android.gms.dynamic.b.N0(this.f32763a), new BinderC4811q00(this, c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c);
            }
        } catch (RemoteException e10) {
            AbstractC0786o0.l("Remote exception loading a rewarded RTB ad", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        C4377mZ c4377mZ = new C4377mZ(c3502fb0, (InterfaceC5542vp) c4753pY.f32419b, B4.b.REWARDED);
        NP npA = this.f32764b.a(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new OP(c4377mZ));
        c4377mZ.b(npA.d());
        ((BinderC3120cZ) c4753pY.f32420c).z6(npA.n());
        return npA.h();
    }
}
