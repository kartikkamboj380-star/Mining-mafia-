package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1537Bt0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map.Entry f17730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f17731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1589Ct0 f17732c;

    C1537Bt0(C1589Ct0 c1589Ct0, Iterator it) {
        this.f17731b = it;
        Objects.requireNonNull(c1589Ct0);
        this.f17732c = c1589Ct0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17731b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f17731b.next();
        this.f17730a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2418Ss0.j(this.f17730a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f17730a.getValue();
        this.f17731b.remove();
        int size = collection.size();
        AbstractC2108Mt0 abstractC2108Mt0 = this.f17732c.f17986b;
        abstractC2108Mt0.r(abstractC2108Mt0.q() - size);
        collection.clear();
        this.f17730a = null;
    }
}
