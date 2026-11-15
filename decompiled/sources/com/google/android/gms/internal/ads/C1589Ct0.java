package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ct0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1589Ct0 extends AbstractC3165cv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f17986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1589Ct0(AbstractC2108Mt0 abstractC2108Mt0, Map map) {
        super(map);
        Objects.requireNonNull(abstractC2108Mt0);
        this.f17986b = abstractC2108Mt0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC2370Ru0.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f27247a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f27247a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27247a.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3165cv0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1537Bt0(this, this.f27247a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f27247a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        AbstractC2108Mt0 abstractC2108Mt0 = this.f17986b;
        abstractC2108Mt0.r(abstractC2108Mt0.q() - size);
        return size > 0;
    }
}
