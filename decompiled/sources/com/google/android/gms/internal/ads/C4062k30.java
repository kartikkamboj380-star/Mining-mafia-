package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4062k30 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f30682a;

    C4062k30(Set set) {
        this.f30682a = set;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f30682a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC5685wx0.a(new C3936j30(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 8;
    }
}
