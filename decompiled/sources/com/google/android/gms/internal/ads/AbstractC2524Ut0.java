package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ut0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2524Ut0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Collection f24123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC2470Ts0 f24124b;

    AbstractC2524Ut0(Collection collection, InterfaceC2470Ts0 interfaceC2470Ts0) {
        this.f24123a = collection;
        this.f24124b = interfaceC2470Ts0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        AbstractC2418Ss0.a(this.f24124b.zza(obj));
        return this.f24123a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC2418Ss0.a(this.f24124b.zza(it.next()));
        }
        return this.f24123a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        AbstractC2110Mu0.a(this.f24123a, this.f24124b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (AbstractC2576Vt0.a(this.f24123a, obj)) {
            return this.f24124b.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC2470Ts0 interfaceC2470Ts0 = this.f24124b;
        Iterator it = this.f24123a.iterator();
        AbstractC2418Ss0.k(interfaceC2470Ts0, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (interfaceC2470Ts0.zza(it.next())) {
                return i10 == -1;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f24123a.iterator();
        it.getClass();
        InterfaceC2470Ts0 interfaceC2470Ts0 = this.f24124b;
        interfaceC2470Ts0.getClass();
        return new C2162Nu0(it, interfaceC2470Ts0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f24123a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f24123a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f24124b.zza(next) && collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f24123a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f24124b.zza(next) && !collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f24123a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f24124b.zza(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return AbstractC2786Zu0.a(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC2786Zu0.a(iterator()).toArray(objArr);
    }
}
