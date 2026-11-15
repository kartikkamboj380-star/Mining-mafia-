package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.It0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1901It0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f19681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Collection f19682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1953Jt0 f19683c;

    C1901It0(AbstractC1953Jt0 abstractC1953Jt0) {
        Objects.requireNonNull(abstractC1953Jt0);
        this.f19683c = abstractC1953Jt0;
        Collection collection = abstractC1953Jt0.f20016b;
        this.f19682b = collection;
        this.f19681a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        AbstractC1953Jt0 abstractC1953Jt0 = this.f19683c;
        abstractC1953Jt0.a();
        if (abstractC1953Jt0.f20016b != this.f19682b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f19681a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f19681a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19681a.remove();
        AbstractC1953Jt0 abstractC1953Jt0 = this.f19683c;
        AbstractC2108Mt0 abstractC2108Mt0 = abstractC1953Jt0.f20019e;
        abstractC2108Mt0.r(abstractC2108Mt0.q() - 1);
        abstractC1953Jt0.zzb();
    }

    C1901It0(AbstractC1953Jt0 abstractC1953Jt0, Iterator it) {
        Objects.requireNonNull(abstractC1953Jt0);
        this.f19683c = abstractC1953Jt0;
        this.f19682b = abstractC1953Jt0.f20016b;
        this.f19681a = it;
    }
}
