package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6396d extends AbstractC6475x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37199b;

    protected AbstractC6396d(int i10, int i11) {
        AbstractC6388b.b(i11, i10, "index");
        this.f37198a = i10;
        this.f37199b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f37199b < this.f37198a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37199b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f37199b;
        this.f37199b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37199b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f37199b - 1;
        this.f37199b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37199b - 1;
    }
}
