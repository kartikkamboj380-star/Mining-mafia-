package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class A1 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f37047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f37048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1 f37049c;

    A1(C1 c10, int i10) {
        this.f37048b = i10;
        this.f37049c = c10;
        this.f37047a = c10.f37069a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f37047a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37047a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f37047a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37047a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f37047a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37047a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
