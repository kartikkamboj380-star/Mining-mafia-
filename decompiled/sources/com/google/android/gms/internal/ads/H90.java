package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class H90 implements V90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4762pc0 f19227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f19228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5307tx0 f19229c = new E90(this);

    public H90(InterfaceC4762pc0 interfaceC4762pc0, Executor executor) {
        this.f19227a = interfaceC4762pc0;
        this.f19228b = executor;
    }

    @Override // com.google.android.gms.internal.ads.V90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.p a(W90 w90, U90 u90, Object obj) {
        return b(w90, u90, null);
    }

    public final com.google.common.util.concurrent.p b(W90 w90, U90 u90, final FF ff) {
        InterfaceC4762pc0 interfaceC4762pc0 = this.f19227a;
        Executor executor = this.f19228b;
        return (AbstractC4678ox0) AbstractC5685wx0.g((AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(new R90(interfaceC4762pc0, ff, executor).a()), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.F90
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f18706a.c(ff, (P90) obj);
            }
        }, executor), Exception.class, new D90(this), executor);
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(FF ff, P90 p90) {
        InterfaceC4762pc0 interfaceC4762pc0 = this.f19227a;
        InterfaceC1451Ac0 interfaceC1451Ac0 = p90.f22055b;
        C5420ur c5420ur = p90.f22054a;
        C6021zc0 c6021zc0D = interfaceC4762pc0.d(interfaceC1451Ac0);
        if (c6021zc0D != null && c5420ur != null) {
            AbstractC5685wx0.r(ff.zza().f(c5420ur), this.f19229c, this.f19228b);
        }
        return AbstractC5685wx0.a(new G90(interfaceC1451Ac0, c5420ur, c6021zc0D));
    }

    @Override // com.google.android.gms.internal.ads.V90
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
