package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ht0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1849Ht0 extends C1589Ct0 implements SortedSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f19410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1849Ht0(AbstractC2108Mt0 abstractC2108Mt0, SortedMap sortedMap) {
        super(abstractC2108Mt0, sortedMap);
        Objects.requireNonNull(abstractC2108Mt0);
        this.f19410c = abstractC2108Mt0;
    }

    SortedMap a() {
        return (SortedMap) this.f27247a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C1849Ht0(this.f19410c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C1849Ht0(this.f19410c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C1849Ht0(this.f19410c, a().tailMap(obj));
    }
}
