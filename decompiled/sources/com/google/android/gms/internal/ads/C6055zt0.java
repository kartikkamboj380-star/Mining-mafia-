package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C6055zt0 extends AbstractC3416ev0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Map f35872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f35873d;

    C6055zt0(AbstractC2108Mt0 abstractC2108Mt0, Map map) {
        Objects.requireNonNull(abstractC2108Mt0);
        this.f35873d = abstractC2108Mt0;
        this.f35872c = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3416ev0
    protected final Set a() {
        return new C5803xt0(this);
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.f35873d.j(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC2108Mt0 abstractC2108Mt0 = this.f35873d;
        if (this.f35872c == abstractC2108Mt0.p()) {
            abstractC2108Mt0.b();
        } else {
            AbstractC2370Ru0.b(new C5929yt0(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f35872c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f35872c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) AbstractC3542fv0.a(this.f35872c, obj);
        if (collection == null) {
            return null;
        }
        return this.f35873d.j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f35872c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.f35873d.h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f35872c.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC2108Mt0 abstractC2108Mt0 = this.f35873d;
        Collection collectionK = abstractC2108Mt0.k();
        collectionK.addAll(collection);
        abstractC2108Mt0.r(abstractC2108Mt0.q() - collection.size());
        collection.clear();
        return collectionK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f35872c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f35872c.toString();
    }
}
