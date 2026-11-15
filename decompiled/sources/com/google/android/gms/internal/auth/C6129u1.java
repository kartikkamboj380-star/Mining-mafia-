package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6129u1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f36156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6132v1 f36157b;

    C6129u1(C6132v1 c6132v1) {
        this.f36157b = c6132v1;
        this.f36156a = c6132v1.f36162a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36156a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f36156a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
