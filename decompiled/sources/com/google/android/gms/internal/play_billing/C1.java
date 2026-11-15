package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class C1 extends AbstractList implements RandomAccess, E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f37069a;

    public C1(E0 e10) {
        this.f37069a = e10;
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final List c() {
        return this.f37069a.c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((D0) this.f37069a).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new B1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new A1(this, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final Object n(int i10) {
        return this.f37069a.n(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37069a.size();
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final E0 zze() {
        return this;
    }
}
