package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1797Gt0 extends C6055zt0 implements SortedMap {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SortedSet f19157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f19158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1797Gt0(AbstractC2108Mt0 abstractC2108Mt0, SortedMap sortedMap) {
        super(abstractC2108Mt0, sortedMap);
        Objects.requireNonNull(abstractC2108Mt0);
        this.f19158f = abstractC2108Mt0;
    }

    SortedSet c() {
        return new C1849Ht0(this.f19158f, f());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    @Override // com.google.android.gms.internal.ads.C6055zt0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f19157e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f19157e = sortedSetC;
        return sortedSetC;
    }

    SortedMap f() {
        return (SortedMap) this.f35872c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C1797Gt0(this.f19158f, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C1797Gt0(this.f19158f, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C1797Gt0(this.f19158f, f().tailMap(obj));
    }
}
