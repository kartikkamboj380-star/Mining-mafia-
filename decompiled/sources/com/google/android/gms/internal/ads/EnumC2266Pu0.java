package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2266Pu0 implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2418Ss0.j(false, "no calls to next() since the last call to remove()");
    }
}
