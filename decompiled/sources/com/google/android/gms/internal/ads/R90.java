package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class R90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4762pc0 f22740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FF f22741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private P90 f22743d;

    public R90(InterfaceC4762pc0 interfaceC4762pc0, FF ff, Executor executor) {
        this.f22740a = interfaceC4762pc0;
        this.f22741b = ff;
        this.f22742c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1451Ac0 b() {
        C6019zb0 c6019zb0Zzb = this.f22741b.zzb();
        return this.f22740a.b(c6019zb0Zzb.f35795d, c6019zb0Zzb.f35798g, c6019zb0Zzb.f35802k);
    }

    public final com.google.common.util.concurrent.p a() {
        com.google.common.util.concurrent.p pVarA;
        P90 p90 = this.f22743d;
        if (p90 != null) {
            return AbstractC5685wx0.a(p90);
        }
        if (((Boolean) AbstractC5026rj.f33004a.e()).booleanValue()) {
            AbstractC4678ox0 abstractC4678ox0B = AbstractC4678ox0.B(this.f22741b.zza().e(this.f22740a.zze()));
            O90 o90 = new O90(this);
            Executor executor = this.f22742c;
            pVarA = (AbstractC4678ox0) AbstractC5685wx0.g((AbstractC4678ox0) AbstractC5685wx0.k(abstractC4678ox0B, o90, executor), FV.class, new N90(this), executor);
        } else {
            P90 p91 = new P90(null, b(), null);
            this.f22743d = p91;
            pVarA = AbstractC5685wx0.a(p91);
        }
        return AbstractC5685wx0.k(pVarA, Q90.f22318a, this.f22742c);
    }

    final /* synthetic */ P90 c() {
        return this.f22743d;
    }

    final /* synthetic */ void d(P90 p90) {
        this.f22743d = p90;
    }
}
