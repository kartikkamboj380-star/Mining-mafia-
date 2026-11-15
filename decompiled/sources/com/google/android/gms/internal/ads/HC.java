package com.google.android.gms.internal.ads;

import K4.AbstractC0761c;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class HC implements InterfaceC5220tG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1750Fw f19237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QR f19238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3502fb0 f19239c;

    HC(InterfaceC1750Fw interfaceC1750Fw, QR qr, C3502fb0 c3502fb0) {
        this.f19237a = interfaceC1750Fw;
        this.f19238b = qr;
        this.f19239c = c3502fb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        InterfaceC1750Fw interfaceC1750Fw;
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.te)).booleanValue() || (interfaceC1750Fw = this.f19237a) == null) {
            return;
        }
        String str = true != AbstractC0761c.a(interfaceC1750Fw.B()) ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        PR prA = this.f19238b.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "hcp");
        prA.c("hcp", str);
        prA.b(this.f19239c);
        prA.d();
    }
}
