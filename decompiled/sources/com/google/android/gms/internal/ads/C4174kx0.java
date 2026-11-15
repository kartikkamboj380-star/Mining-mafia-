package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4174kx0 extends AbstractC2686Xw0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private AbstractC4048jx0 f30905G;

    C4174kx0(AbstractC5427uu0 abstractC5427uu0, boolean z9, Executor executor, Callable callable) {
        super(abstractC5427uu0, z9, false);
        this.f30905G = new C3922ix0(this, callable, executor);
        L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2686Xw0
    final void E(int i10) {
        super.E(i10);
        if (i10 == 1) {
            this.f30905G = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2686Xw0
    final void M(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2686Xw0
    final void N() {
        AbstractC4048jx0 abstractC4048jx0 = this.f30905G;
        if (abstractC4048jx0 != null) {
            abstractC4048jx0.i();
        }
    }

    final /* synthetic */ void Q(AbstractC4048jx0 abstractC4048jx0) {
        this.f30905G = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final void s() {
        AbstractC4048jx0 abstractC4048jx0 = this.f30905G;
        if (abstractC4048jx0 != null) {
            abstractC4048jx0.g();
        }
    }
}
