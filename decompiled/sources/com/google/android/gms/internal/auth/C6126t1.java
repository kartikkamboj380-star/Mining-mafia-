package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6126t1 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f36152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f36153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6132v1 f36154c;

    C6126t1(C6132v1 c6132v1, int i10) {
        this.f36154c = c6132v1;
        this.f36153b = i10;
        this.f36152a = c6132v1.f36162a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f36152a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36152a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f36152a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36152a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f36152a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36152a.previousIndex();
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
