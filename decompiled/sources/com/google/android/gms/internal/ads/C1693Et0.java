package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Et0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1693Et0 extends C1849Ht0 implements NavigableSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f18595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1693Et0(AbstractC2108Mt0 abstractC2108Mt0, NavigableMap navigableMap) {
        super(abstractC2108Mt0, navigableMap);
        Objects.requireNonNull(abstractC2108Mt0);
        this.f18595d = abstractC2108Mt0;
    }

    @Override // com.google.android.gms.internal.ads.C1849Ht0
    final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f27247a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27247a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C1693Et0(this.f18595d, ((NavigableMap) ((SortedMap) this.f27247a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27247a)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C1849Ht0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27247a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27247a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return AbstractC2370Ru0.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return AbstractC2370Ru0.a(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.C1849Ht0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C1849Ht0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z9) {
        return new C1693Et0(this.f18595d, ((NavigableMap) ((SortedMap) this.f27247a)).headMap(obj, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        return new C1693Et0(this.f18595d, ((NavigableMap) ((SortedMap) this.f27247a)).subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z9) {
        return new C1693Et0(this.f18595d, ((NavigableMap) ((SortedMap) this.f27247a)).tailMap(obj, z9));
    }
}
