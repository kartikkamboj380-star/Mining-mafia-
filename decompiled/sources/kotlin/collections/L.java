package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class L extends AbstractC7018d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f45927b;

    public static final class a implements ListIterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f45928a;

        a(int i10) {
            this.f45928a = L.this.f45927b.listIterator(w.M(L.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f45928a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f45928a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f45928a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return w.L(L.this, this.f45928a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f45928a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return w.L(L.this, this.f45928a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public L(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f45927b = delegate;
    }

    @Override // kotlin.collections.AbstractC7016b
    public int b() {
        return this.f45927b.size();
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    public Object get(int i10) {
        return this.f45927b.get(w.K(this, i10));
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
