package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class CZ implements InterfaceC5130sY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VL f17904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f17905c;

    public CZ(Context context, VL vl, Executor executor) {
        this.f17903a = context;
        this.f17904b = vl;
        this.f17905c = executor;
    }

    private static final boolean c(C5011rb0 c5011rb0, int i10) {
        return c5011rb0.f32990a.f31840a.f35799h.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final void a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C1761Gb0 {
        C2696Yb0 c2696Yb0 = (C2696Yb0) c4753pY.f32419b;
        C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
        String string = c3502fb0.f28437v.toString();
        String strM = K4.S.m(c3502fb0.f28431s);
        c2696Yb0.t(this.f17903a, c6019zb0.f35795d, string, strM, (InterfaceC1578Co) c4753pY.f32420c, c6019zb0.f35801j, c6019zb0.f35799h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5130sY
    public final /* bridge */ /* synthetic */ Object b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) throws C3301e00, C1761Gb0 {
        OM omH;
        C2696Yb0 c2696Yb0 = (C2696Yb0) c4753pY.f32419b;
        C1890Io c1890IoD = c2696Yb0.d();
        C1942Jo c1942JoE = c2696Yb0.e();
        InterfaceC2097Mo interfaceC2097MoZ = c2696Yb0.z();
        if (interfaceC2097MoZ != null && c(c5011rb0, 6)) {
            omH = OM.G(interfaceC2097MoZ);
        } else if (c1890IoD != null && c(c5011rb0, 6)) {
            omH = OM.J(c1890IoD);
        } else if (c1890IoD != null && c(c5011rb0, 2)) {
            omH = OM.I(c1890IoD);
        } else if (c1942JoE != null && c(c5011rb0, 6)) {
            omH = OM.K(c1942JoE);
        } else {
            if (c1942JoE == null || !c(c5011rb0, 1)) {
                throw new C3301e00(1, "No native ad mappers");
            }
            omH = OM.H(c1942JoE);
        }
        if (omH != null) {
            C6019zb0 c6019zb0 = c5011rb0.f32990a.f31840a;
            if (c6019zb0.f35799h.contains(Integer.toString(omH.k0()))) {
                QM qmE = this.f17904b.e(new FD(c5011rb0, c3502fb0, c4753pY.f32418a), new ZM(omH), new UN(c1942JoE, c1890IoD, interfaceC2097MoZ));
                ((BinderC3120cZ) c4753pY.f32420c).z6(qmE.f());
                qmE.a().b1(new QA(c2696Yb0), this.f17905c);
                return qmE.h();
            }
        }
        throw new C3301e00(1, "No corresponding native ad listener");
    }
}
