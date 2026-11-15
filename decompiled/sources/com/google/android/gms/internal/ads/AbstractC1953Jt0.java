package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1953Jt0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f20015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f20016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AbstractC1953Jt0 f20017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Collection f20018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f20019e;

    AbstractC1953Jt0(AbstractC2108Mt0 abstractC2108Mt0, Object obj, Collection collection, AbstractC1953Jt0 abstractC1953Jt0) {
        Objects.requireNonNull(abstractC2108Mt0);
        this.f20019e = abstractC2108Mt0;
        this.f20015a = obj;
        this.f20016b = collection;
        this.f20017c = abstractC1953Jt0;
        this.f20018d = abstractC1953Jt0 == null ? null : abstractC1953Jt0.f20016b;
    }

    final void a() {
        AbstractC1953Jt0 abstractC1953Jt0 = this.f20017c;
        if (abstractC1953Jt0 != null) {
            abstractC1953Jt0.a();
            if (abstractC1953Jt0.f20016b != this.f20018d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f20016b.isEmpty()) {
            AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
            Collection collection = (Collection) abstractC2108Mt0.p().get(this.f20015a);
            if (collection != null) {
                this.f20016b = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        a();
        boolean zIsEmpty = this.f20016b.isEmpty();
        boolean zAdd = this.f20016b.add(obj);
        if (zAdd) {
            AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
            abstractC2108Mt0.r(abstractC2108Mt0.q() + 1);
            if (zIsEmpty) {
                b();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f20016b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f20016b.size();
        AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
        abstractC2108Mt0.r(abstractC2108Mt0.q() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    final void b() {
        AbstractC1953Jt0 abstractC1953Jt0 = this.f20017c;
        if (abstractC1953Jt0 != null) {
            abstractC1953Jt0.b();
            return;
        }
        AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
        abstractC2108Mt0.p().put(this.f20015a, this.f20016b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f20016b.clear();
        AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
        abstractC2108Mt0.r(abstractC2108Mt0.q() - size);
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        a();
        return this.f20016b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        a();
        return this.f20016b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f20016b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        a();
        return this.f20016b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a();
        return new C1901It0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        a();
        boolean zRemove = this.f20016b.remove(obj);
        if (zRemove) {
            AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
            abstractC2108Mt0.r(abstractC2108Mt0.q() - 1);
            zzb();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f20016b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f20016b.size();
            AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
            abstractC2108Mt0.r(abstractC2108Mt0.q() + (size2 - size));
            zzb();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f20016b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f20016b.size();
            AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
            abstractC2108Mt0.r(abstractC2108Mt0.q() + (size2 - size));
            zzb();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        a();
        return this.f20016b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f20016b.toString();
    }

    final void zzb() {
        AbstractC1953Jt0 abstractC1953Jt0 = this.f20017c;
        if (abstractC1953Jt0 != null) {
            abstractC1953Jt0.zzb();
        } else if (this.f20016b.isEmpty()) {
            AbstractC2108Mt0 abstractC2108Mt0 = this.f20019e;
            abstractC2108Mt0.p().remove(this.f20015a);
        }
    }
}
