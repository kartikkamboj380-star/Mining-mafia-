package Y5;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Y5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1070a extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6894b;

    protected AbstractC1070a(int i10, int i11) {
        X5.j.k(i11, i10);
        this.f6893a = i10;
        this.f6894b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6894b < this.f6893a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6894b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6894b;
        this.f6894b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6894b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6894b - 1;
        this.f6894b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6894b - 1;
    }
}
