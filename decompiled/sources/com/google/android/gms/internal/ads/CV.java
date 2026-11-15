package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class CV implements EV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f17888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GH f17889c;

    public CV(Map map, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, GH gh) {
        this.f17887a = map;
        this.f17888b = interfaceExecutorServiceC1805Gx0;
        this.f17889c = gh;
    }

    @Override // com.google.android.gms.internal.ads.EV
    public final com.google.common.util.concurrent.p a(final C5420ur c5420ur) {
        this.f17889c.D0(c5420ur);
        com.google.common.util.concurrent.p pVarC = AbstractC5685wx0.c(new C4619oU(3));
        for (String str : ((String) H4.B.c().d(AbstractC3892ii.A9)).split(",")) {
            final InterfaceC5493vQ0 interfaceC5493vQ0 = (InterfaceC5493vQ0) this.f17887a.get(str.trim());
            if (interfaceC5493vQ0 != null) {
                pVarC = AbstractC5685wx0.h(pVarC, C4619oU.class, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.BV
                    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                    public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                        return ((EV) interfaceC5493vQ0.zzb()).a(c5420ur);
                    }
                }, this.f17888b);
            }
        }
        AbstractC5685wx0.r(pVarC, new AV(this), AbstractC2315Qt.f22479g);
        return pVarC;
    }

    final /* synthetic */ GH b() {
        return this.f17889c;
    }
}
