package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC7037g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4983rN0 implements Collection, A8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f32885a;

    public C4983rN0(Collection delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f32885a = delegate;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f32885a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f32885a.containsAll(elements);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f32885a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C5109sN0(this.f32885a.iterator());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.f32885a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC7037g.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC7037g.b(this, array);
    }
}
