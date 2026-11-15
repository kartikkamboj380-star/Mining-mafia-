package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2734Yu0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f25785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC1899Is0 f25786b;

    C2734Yu0(List list, InterfaceC1899Is0 interfaceC1899Is0) {
        list.getClass();
        this.f25785a = list;
        this.f25786b = interfaceC1899Is0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f25785a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2682Xu0(this, this.f25785a.listIterator(i10));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        this.f25785a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25785a.size();
    }
}
