package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.At0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1485At0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f17424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f17425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Iterator f17426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f17427d;

    AbstractC1485At0(AbstractC2108Mt0 abstractC2108Mt0) {
        Objects.requireNonNull(abstractC2108Mt0);
        this.f17427d = abstractC2108Mt0;
        this.f17424a = abstractC2108Mt0.p().entrySet().iterator();
        this.f17425b = null;
        this.f17426c = EnumC2266Pu0.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17424a.hasNext() || this.f17426c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f17426c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f17424a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f17425b = collection;
            this.f17426c = collection.iterator();
        }
        return this.f17426c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f17426c.remove();
        Collection collection = this.f17425b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f17424a.remove();
        }
        AbstractC2108Mt0 abstractC2108Mt0 = this.f17427d;
        abstractC2108Mt0.r(abstractC2108Mt0.q() - 1);
    }
}
