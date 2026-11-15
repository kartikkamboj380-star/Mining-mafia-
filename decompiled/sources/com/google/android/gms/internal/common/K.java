package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class K extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36212b;

    protected K(int i10, int i11) {
        C.c(i11, i10, "index");
        this.f36211a = i10;
        this.f36212b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f36212b < this.f36211a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36212b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f36212b;
        this.f36212b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36212b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f36212b - 1;
        this.f36212b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36212b - 1;
    }
}
