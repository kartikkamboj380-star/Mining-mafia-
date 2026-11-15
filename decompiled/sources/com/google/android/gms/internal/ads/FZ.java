package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class FZ implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VL f18788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2097Mo f18789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.a f18790d;

    public FZ(Context context, VL vl, L4.a aVar) {
        this.f18787a = context;
        this.f18788b = vl;
        this.f18790d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        try {
            InterfaceC5542vp interfaceC5542vp = (InterfaceC5542vp) c4753pY.f32419b;
            interfaceC5542vp.u0(c3502fb0.f28394Z);
            if (this.f18790d.f3099c < ((Integer) H4.B.c().d(AbstractC3892ii.f29905n2)).intValue()) {
                interfaceC5542vp.l4(c3502fb0.f28389U, c3502fb0.f28437v.toString(), c5011rb0.f32990a.f31840a.f35795d, com.google.android.gms.dynamic.b.N0(this.f18787a), new EZ(this, c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c);
                return;
            }
            String str = c3502fb0.f28389U;
            String string = c3502fb0.f28437v.toString();
            C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
            interfaceC5542vp.l3(str, string, c6019zb0.f35795d, com.google.android.gms.dynamic.b.N0(this.f18787a), new EZ(this, c4753pY, null), (InterfaceC1578Co) c4753pY.f32420c, c6019zb0.f35801j);
        } catch (RemoteException e10) {
            throw new C1761Gb0(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C3301e00 {
        ArrayList arrayList = c5011rb0.f32990a.f31840a.f35799h;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new C3301e00(2, "Unified must be used for RTB.");
        }
        OM omG = OM.G(this.f18789c);
        if (!arrayList.contains(Integer.toString(omG.k0()))) {
            throw new C3301e00(1, "No corresponding native ad listener");
        }
        QM qmE = this.f18788b.e(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new ZM(omG), new UN(null, null, this.f18789c));
        ((BinderC3120cZ) c4753pY.f32420c).z6(qmE.g());
        return qmE.h();
    }

    final /* synthetic */ void c(InterfaceC2097Mo interfaceC2097Mo) {
        this.f18789c = interfaceC2097Mo;
    }
}
