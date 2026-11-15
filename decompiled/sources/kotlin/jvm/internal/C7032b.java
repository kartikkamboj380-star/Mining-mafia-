package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7032b implements Iterator, A8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f45977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45978b;

    public C7032b(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f45977a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f45978b < this.f45977a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f45977a;
            int i10 = this.f45978b;
            this.f45978b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f45978b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
