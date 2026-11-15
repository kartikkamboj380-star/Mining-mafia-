package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ex0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3420ex0 extends AbstractC3672gx0 {
    C3420ex0(AbstractC5427uu0 abstractC5427uu0, boolean z9) {
        super(abstractC5427uu0, z9);
        L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3672gx0
    public final /* bridge */ /* synthetic */ Object Q(List list) {
        ArrayList arrayListB = AbstractC2786Zu0.b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3546fx0 c3546fx0 = (C3546fx0) it.next();
            arrayListB.add(c3546fx0 != null ? c3546fx0.f28514a : null);
        }
        return Collections.unmodifiableList(arrayListB);
    }
}
