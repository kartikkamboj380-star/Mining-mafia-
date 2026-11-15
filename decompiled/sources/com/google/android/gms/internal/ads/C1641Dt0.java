package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1641Dt0 extends C1797Gt0 implements NavigableMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f18298g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1641Dt0(AbstractC2108Mt0 abstractC2108Mt0, NavigableMap navigableMap) {
        super(abstractC2108Mt0, navigableMap);
        Objects.requireNonNull(abstractC2108Mt0);
        this.f18298g = abstractC2108Mt0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f35872c)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return b(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f35872c)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C1641Dt0(this.f18298g, ((NavigableMap) ((SortedMap) this.f35872c)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.C1797Gt0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.C1797Gt0
    final /* synthetic */ SortedMap f() {
        return (NavigableMap) ((SortedMap) this.f35872c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f35872c)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return b(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f35872c)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return b(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f35872c)).floorKey(obj);
    }

    final Map.Entry g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        AbstractC2108Mt0 abstractC2108Mt0 = this.f18298g;
        Collection collectionK = abstractC2108Mt0.k();
        collectionK.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), abstractC2108Mt0.i(collectionK));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.C1797Gt0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableSet c() {
        return new C1693Et0(this.f18298g, (NavigableMap) ((SortedMap) this.f35872c));
    }

    @Override // com.google.android.gms.internal.ads.C1797Gt0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f35872c)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return b(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f35872c)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C1797Gt0, com.google.android.gms.internal.ads.C6055zt0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f35872c)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return b(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f35872c)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return b(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f35872c)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.C1797Gt0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C1797Gt0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z9) {
        return new C1641Dt0(this.f18298g, ((NavigableMap) ((SortedMap) this.f35872c)).headMap(obj, z9));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z9, Object obj2, boolean z10) {
        return new C1641Dt0(this.f18298g, ((NavigableMap) ((SortedMap) this.f35872c)).subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z9) {
        return new C1641Dt0(this.f18298g, ((NavigableMap) ((SortedMap) this.f35872c)).tailMap(obj, z9));
    }
}
