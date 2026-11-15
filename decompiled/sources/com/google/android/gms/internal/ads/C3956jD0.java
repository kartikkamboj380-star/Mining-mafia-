package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3956jD0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f30369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator f30370b;

    /* synthetic */ C3956jD0(Iterator it, Iterator it2, byte[] bArr) {
        this.f30369a = it;
        this.f30370b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30369a.hasNext() || this.f30370b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f30369a;
        return it.hasNext() ? it.next() : this.f30370b.next();
    }
}
