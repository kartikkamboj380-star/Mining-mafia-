package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2630Wu0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f24883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC1899Is0 f24884b;

    C2630Wu0(List list, InterfaceC1899Is0 interfaceC1899Is0) {
        list.getClass();
        this.f24883a = list;
        this.f24884b = interfaceC1899Is0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f24884b.apply(this.f24883a.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f24883a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2578Vu0(this, this.f24883a.listIterator(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return this.f24884b.apply(this.f24883a.remove(i10));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        this.f24883a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24883a.size();
    }
}
