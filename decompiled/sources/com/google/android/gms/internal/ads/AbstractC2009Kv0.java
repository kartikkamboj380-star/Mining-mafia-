package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2009Kv0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f20295a;

    AbstractC2009Kv0(Iterator it) {
        it.getClass();
        this.f20295a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20295a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f20295a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20295a.remove();
    }
}
