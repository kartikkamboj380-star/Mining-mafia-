package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class B1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f37065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1 f37066b;

    B1(C1 c10) {
        this.f37066b = c10;
        this.f37065a = c10.f37069a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37065a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f37065a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
