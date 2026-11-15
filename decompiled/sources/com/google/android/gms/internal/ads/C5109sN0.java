package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5109sN0 implements Iterator, A8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f33151a;

    public C5109sN0(Iterator delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33151a = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33151a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f33151a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
