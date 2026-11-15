package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5718xD implements InterfaceC2925b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34763a;

    public C5718xD(List list) {
        this.f34763a = list;
    }

    public static InterfaceC4375mY a(InterfaceC5384uZ interfaceC5384uZ) {
        return new C4501nY(interfaceC5384uZ, C5592wD.f34497a);
    }

    public static InterfaceC4375mY b(InterfaceC4375mY interfaceC4375mY) {
        return new C4501nY(interfaceC4375mY, C5466vD.f34016a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2925b00
    public final void e() {
        Iterator it = this.f34763a.iterator();
        while (it.hasNext()) {
            AbstractC5685wx0.r((com.google.common.util.concurrent.p) it.next(), new C5340uD(this), AbstractC2272Px0.a());
        }
    }

    public C5718xD(AbstractC4711pD abstractC4711pD) {
        this.f34763a = Collections.singletonList(AbstractC5685wx0.a(abstractC4711pD));
    }
}
