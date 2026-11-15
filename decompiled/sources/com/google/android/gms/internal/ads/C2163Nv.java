package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2163Nv extends AbstractC1956Jv {
    public C2163Nv(InterfaceC2265Pu interfaceC2265Pu) {
        super(interfaceC2265Pu);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1956Jv
    public final boolean a(String str) {
        String strO = L4.g.o(str);
        InterfaceC2265Pu interfaceC2265Pu = (InterfaceC2265Pu) this.f20022c.get();
        if (interfaceC2265Pu != null && strO != null) {
            interfaceC2265Pu.s(strO, this);
        }
        int i10 = AbstractC0786o0.f2696b;
        L4.p.f("VideoStreamNoopCache is doing nothing.");
        u(str, strO, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1956Jv
    public final void m() {
    }
}
