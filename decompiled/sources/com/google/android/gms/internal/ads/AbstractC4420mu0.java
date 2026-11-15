package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4420mu0 extends AbstractC4672ou0 implements Collection {
    protected AbstractC4420mu0() {
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return i().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        i().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return i().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return i().containsAll(collection);
    }

    protected abstract Collection i();

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return i().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return i().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return i().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return i().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return i().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return i().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i().toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i().toArray(objArr);
    }
}
