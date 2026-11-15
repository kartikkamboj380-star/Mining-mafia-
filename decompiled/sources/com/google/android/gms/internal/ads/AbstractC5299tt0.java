package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5299tt0 extends AbstractC2164Nv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33513b;

    protected AbstractC5299tt0(int i10, int i11) {
        AbstractC2418Ss0.n(i11, i10, "index");
        this.f33512a = i10;
        this.f33513b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33513b < this.f33512a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33513b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f33513b;
        this.f33513b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33513b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f33513b - 1;
        this.f33513b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33513b - 1;
    }
}
