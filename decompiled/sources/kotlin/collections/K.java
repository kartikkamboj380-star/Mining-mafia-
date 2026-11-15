package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class K extends AbstractC7020f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45924a;

    public static final class a implements ListIterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f45925a;

        a(int i10) {
            this.f45925a = K.this.f45924a.listIterator(w.M(K.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f45925a.add(obj);
            this.f45925a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f45925a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f45925a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f45925a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return w.L(K.this, this.f45925a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f45925a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return w.L(K.this, this.f45925a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f45925a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f45925a.set(obj);
        }
    }

    public K(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f45924a = delegate;
    }

    @Override // kotlin.collections.AbstractC7020f
    public int a() {
        return this.f45924a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f45924a.add(w.M(this, i10), obj);
    }

    @Override // kotlin.collections.AbstractC7020f
    public Object b(int i10) {
        return this.f45924a.remove(w.K(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f45924a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f45924a.get(w.K(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f45924a.set(w.K(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
