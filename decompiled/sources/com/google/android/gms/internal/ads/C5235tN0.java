package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5235tN0 implements Iterator, A8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f33392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f33393b;

    C5235tN0(Iterator it) {
        this.f33393b = it;
        this.f33392a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33392a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C5613wN0((Map.Entry) this.f33393b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
