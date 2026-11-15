package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5585w90 implements V90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FF f34487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f34488b = AbstractC2272Px0.a();

    @Override // com.google.android.gms.internal.ads.V90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.p a(W90 w90, U90 u90, Object obj) {
        return c(w90, u90, null);
    }

    public final FF b() {
        return this.f34487a;
    }

    public final com.google.common.util.concurrent.p c(W90 w90, U90 u90, FF ff) {
        EF efA = u90.a(w90.f24720b);
        efA.q(new Z90(true));
        FF ff2 = (FF) efA.c();
        this.f34487a = ff2;
        final UD udZza = ff2.zza();
        final C6021zc0 c6021zc0 = new C6021zc0();
        AbstractC4678ox0 abstractC4678ox0B = AbstractC4678ox0.B(udZza.b());
        InterfaceC3294dx0 interfaceC3294dx0 = new InterfaceC3294dx0(this) { // from class: com.google.android.gms.internal.ads.v90
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                C5011rb0 c5011rb0 = (C5011rb0) obj;
                c6021zc0.f35816b = c5011rb0;
                Iterator it = c5011rb0.f32991b.f32671a.iterator();
                boolean z9 = false;
                while (it.hasNext()) {
                    Iterator it2 = ((C3502fb0) it.next()).f28395a.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return AbstractC5685wx0.a(null);
                        }
                        z9 = true;
                    }
                }
                if (z9) {
                    return udZza.c(AbstractC5685wx0.a(c5011rb0));
                }
                return AbstractC5685wx0.a(null);
            }
        };
        Executor executor = this.f34488b;
        return (AbstractC4678ox0) AbstractC5685wx0.k((AbstractC4678ox0) AbstractC5685wx0.j(abstractC4678ox0B, interfaceC3294dx0, executor), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.u90
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                C6021zc0 c6021zc1 = c6021zc0;
                c6021zc1.f35817c = (AbstractC4711pD) obj;
                return c6021zc1;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.V90
    public final /* synthetic */ Object zzd() {
        return this.f34487a;
    }
}
