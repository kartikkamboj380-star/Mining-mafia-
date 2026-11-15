package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5929yt0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f35476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f35477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6055zt0 f35478c;

    C5929yt0(C6055zt0 c6055zt0) {
        Objects.requireNonNull(c6055zt0);
        this.f35478c = c6055zt0;
        this.f35476a = c6055zt0.f35872c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35476a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f35476a.next();
        this.f35477b = (Collection) entry.getValue();
        return this.f35478c.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2418Ss0.j(this.f35477b != null, "no calls to next() since the last call to remove()");
        this.f35476a.remove();
        int size = this.f35477b.size();
        AbstractC2108Mt0 abstractC2108Mt0 = this.f35478c.f35873d;
        abstractC2108Mt0.r(abstractC2108Mt0.q() - size);
        this.f35477b.clear();
        this.f35477b = null;
    }
}
