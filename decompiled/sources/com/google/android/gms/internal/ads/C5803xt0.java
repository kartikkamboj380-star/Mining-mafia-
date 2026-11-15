package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5803xt0 extends AbstractC3040bv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6055zt0 f35057a;

    C5803xt0(C6055zt0 c6055zt0) {
        Objects.requireNonNull(c6055zt0);
        this.f35057a = c6055zt0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3040bv0
    final Map a() {
        return this.f35057a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3040bv0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return AbstractC2576Vt0.a(this.f35057a.f35872c.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5929yt0(this.f35057a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C6055zt0 c6055zt0 = this.f35057a;
        c6055zt0.f35873d.o(entry.getKey());
        return true;
    }
}
