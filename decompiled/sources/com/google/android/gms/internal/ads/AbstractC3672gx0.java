package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3672gx0 extends AbstractC2686Xw0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private List f28767G;

    AbstractC3672gx0(AbstractC5427uu0 abstractC5427uu0, boolean z9) {
        super(abstractC5427uu0, z9, true);
        List listB = abstractC5427uu0.isEmpty() ? Collections.EMPTY_LIST : AbstractC2786Zu0.b(abstractC5427uu0.size());
        for (int i10 = 0; i10 < abstractC5427uu0.size(); i10++) {
            listB.add(null);
        }
        this.f28767G = listB;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2686Xw0
    final void E(int i10) {
        super.E(i10);
        this.f28767G = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2686Xw0
    final void M(int i10, Object obj) {
        List list = this.f28767G;
        if (list != null) {
            list.set(i10, new C3546fx0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2686Xw0
    final void N() {
        List list = this.f28767G;
        if (list != null) {
            k(Q(list));
        }
    }

    abstract Object Q(List list);
}
