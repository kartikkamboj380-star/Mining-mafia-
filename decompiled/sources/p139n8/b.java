package p139n8;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractC7018d;
import kotlin.collections.AbstractC7020f;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC7020f implements List, RandomAccess, Serializable, A8.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C0483b f47023d = new C0483b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f47024e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f47025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47027c;

    public static final class a extends AbstractC7020f implements List, RandomAccess, Serializable, A8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object[] f47028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f47031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f47032e;

        /* JADX INFO: renamed from: n8.b$a$a, reason: collision with other inner class name */
        private static final class C0482a implements ListIterator, A8.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a f47033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f47034b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f47035c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f47036d;

            public C0482a(a list, int i10) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.f47033a = list;
                this.f47034b = i10;
                this.f47035c = -1;
                this.f47036d = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) this.f47033a.f47032e).modCount != this.f47036d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                a aVar = this.f47033a;
                int i10 = this.f47034b;
                this.f47034b = i10 + 1;
                aVar.add(i10, obj);
                this.f47035c = -1;
                this.f47036d = ((AbstractList) this.f47033a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f47034b < this.f47033a.f47030c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f47034b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f47034b >= this.f47033a.f47030c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f47034b;
                this.f47034b = i10 + 1;
                this.f47035c = i10;
                return this.f47033a.f47028a[this.f47033a.f47029b + this.f47035c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f47034b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f47034b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f47034b = i11;
                this.f47035c = i11;
                return this.f47033a.f47028a[this.f47033a.f47029b + this.f47035c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f47034b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f47035c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f47033a.remove(i10);
                this.f47034b = this.f47035c;
                this.f47035c = -1;
                this.f47036d = ((AbstractList) this.f47033a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f47035c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f47033a.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, b root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.f47028a = backing;
            this.f47029b = i10;
            this.f47030c = i11;
            this.f47031d = aVar;
            this.f47032e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void l(int i10, Collection collection, int i11) {
            s();
            a aVar = this.f47031d;
            if (aVar != null) {
                aVar.l(i10, collection, i11);
            } else {
                this.f47032e.q(i10, collection, i11);
            }
            this.f47028a = this.f47032e.f47025a;
            this.f47030c += i11;
        }

        private final void m(int i10, Object obj) {
            s();
            a aVar = this.f47031d;
            if (aVar != null) {
                aVar.m(i10, obj);
            } else {
                this.f47032e.r(i10, obj);
            }
            this.f47028a = this.f47032e.f47025a;
            this.f47030c++;
        }

        private final void o() {
            if (((AbstractList) this.f47032e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void p() {
            if (r()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean q(List list) {
            return p139n8.c.h(this.f47028a, this.f47029b, this.f47030c, list);
        }

        private final boolean r() {
            return this.f47032e.f47027c;
        }

        private final void s() {
            ((AbstractList) this).modCount++;
        }

        private final Object t(int i10) {
            s();
            a aVar = this.f47031d;
            Object objT = aVar != null ? aVar.t(i10) : this.f47032e.A(i10);
            this.f47030c--;
            return objT;
        }

        private final void u(int i10, int i11) {
            if (i11 > 0) {
                s();
            }
            a aVar = this.f47031d;
            if (aVar != null) {
                aVar.u(i10, i11);
            } else {
                this.f47032e.B(i10, i11);
            }
            this.f47030c -= i11;
        }

        private final int v(int i10, int i11, Collection collection, boolean z9) {
            a aVar = this.f47031d;
            int iV = aVar != null ? aVar.v(i10, i11, collection, z9) : this.f47032e.C(i10, i11, collection, z9);
            if (iV > 0) {
                s();
            }
            this.f47030c -= iV;
            return iV;
        }

        @Override // kotlin.collections.AbstractC7020f
        public int a() {
            o();
            return this.f47030c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            p();
            o();
            m(this.f47029b + this.f47030c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            p();
            o();
            int size = elements.size();
            l(this.f47029b + this.f47030c, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.AbstractC7020f
        public Object b(int i10) {
            p();
            o();
            AbstractC7018d.f45933a.b(i10, this.f47030c);
            return t(this.f47029b + i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            p();
            o();
            u(this.f47029b, this.f47030c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            o();
            if (obj != this) {
                return (obj instanceof List) && q((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            o();
            AbstractC7018d.f45933a.b(i10, this.f47030c);
            return this.f47028a[this.f47029b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            o();
            return p139n8.c.i(this.f47028a, this.f47029b, this.f47030c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            o();
            for (int i10 = 0; i10 < this.f47030c; i10++) {
                if (Intrinsics.b(this.f47028a[this.f47029b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            o();
            return this.f47030c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            o();
            for (int i10 = this.f47030c - 1; i10 >= 0; i10--) {
                if (Intrinsics.b(this.f47028a[this.f47029b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            p();
            o();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            p();
            o();
            return v(this.f47029b, this.f47030c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            p();
            o();
            return v(this.f47029b, this.f47030c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            p();
            o();
            AbstractC7018d.f45933a.b(i10, this.f47030c);
            Object[] objArr = this.f47028a;
            int i11 = this.f47029b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC7018d.f45933a.d(i10, i11, this.f47030c);
            return new a(this.f47028a, this.f47029b + i10, i11 - i10, this, this.f47032e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            o();
            int length = array.length;
            int i10 = this.f47030c;
            if (length >= i10) {
                Object[] objArr = this.f47028a;
                int i11 = this.f47029b;
                AbstractC7024j.h(objArr, array, 0, i11, i10 + i11);
                return CollectionsKt.e(this.f47030c, array);
            }
            Object[] objArr2 = this.f47028a;
            int i12 = this.f47029b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            o();
            return p139n8.c.j(this.f47028a, this.f47029b, this.f47030c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            o();
            AbstractC7018d.f45933a.c(i10, this.f47030c);
            return new C0482a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            p();
            o();
            AbstractC7018d.f45933a.c(i10, this.f47030c);
            m(this.f47029b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            p();
            o();
            AbstractC7018d.f45933a.c(i10, this.f47030c);
            int size = elements.size();
            l(this.f47029b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            o();
            Object[] objArr = this.f47028a;
            int i10 = this.f47029b;
            return AbstractC7024j.m(objArr, i10, this.f47030c + i10);
        }
    }

    /* JADX INFO: renamed from: n8.b$b, reason: collision with other inner class name */
    private static final class C0483b {
        public /* synthetic */ C0483b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0483b() {
        }
    }

    private static final class c implements ListIterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f47037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47040d;

        public c(b list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f47037a = list;
            this.f47038b = i10;
            this.f47039c = -1;
            this.f47040d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f47037a).modCount != this.f47040d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f47037a;
            int i10 = this.f47038b;
            this.f47038b = i10 + 1;
            bVar.add(i10, obj);
            this.f47039c = -1;
            this.f47040d = ((AbstractList) this.f47037a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f47038b < this.f47037a.f47026b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f47038b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f47038b >= this.f47037a.f47026b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f47038b;
            this.f47038b = i10 + 1;
            this.f47039c = i10;
            return this.f47037a.f47025a[this.f47039c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f47038b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f47038b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f47038b = i11;
            this.f47039c = i11;
            return this.f47037a.f47025a[this.f47039c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f47038b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f47039c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f47037a.remove(i10);
            this.f47038b = this.f47039c;
            this.f47039c = -1;
            this.f47040d = ((AbstractList) this.f47037a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f47039c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f47037a.set(i10, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f47027c = true;
        f47024e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(int i10) {
        z();
        Object[] objArr = this.f47025a;
        Object obj = objArr[i10];
        AbstractC7024j.h(objArr, objArr, i10, i10 + 1, this.f47026b);
        p139n8.c.f(this.f47025a, this.f47026b - 1);
        this.f47026b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i10, int i11) {
        if (i11 > 0) {
            z();
        }
        Object[] objArr = this.f47025a;
        AbstractC7024j.h(objArr, objArr, i10, i10 + i11, this.f47026b);
        Object[] objArr2 = this.f47025a;
        int i12 = this.f47026b;
        p139n8.c.g(objArr2, i12 - i11, i12);
        this.f47026b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int C(int i10, int i11, Collection collection, boolean z9) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f47025a[i14]) == z9) {
                Object[] objArr = this.f47025a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f47025a;
        AbstractC7024j.h(objArr2, objArr2, i10 + i13, i11 + i10, this.f47026b);
        Object[] objArr3 = this.f47025a;
        int i16 = this.f47026b;
        p139n8.c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            z();
        }
        this.f47026b -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(int i10, Collection collection, int i11) {
        z();
        y(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f47025a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int i10, Object obj) {
        z();
        y(i10, 1);
        this.f47025a[i10] = obj;
    }

    private final void t() {
        if (this.f47027c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean u(List list) {
        return p139n8.c.h(this.f47025a, 0, this.f47026b, list);
    }

    private final void v(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f47025a;
        if (i10 > objArr.length) {
            this.f47025a = p139n8.c.e(this.f47025a, AbstractC7018d.f45933a.e(objArr.length, i10));
        }
    }

    private final void w(int i10) {
        v(this.f47026b + i10);
    }

    private final void y(int i10, int i11) {
        w(i11);
        Object[] objArr = this.f47025a;
        AbstractC7024j.h(objArr, objArr, i10 + i11, i10, this.f47026b);
        this.f47026b += i11;
    }

    private final void z() {
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.collections.AbstractC7020f
    public int a() {
        return this.f47026b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        t();
        r(this.f47026b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        t();
        int size = elements.size();
        q(this.f47026b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC7020f
    public Object b(int i10) {
        t();
        AbstractC7018d.f45933a.b(i10, this.f47026b);
        return A(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        t();
        B(0, this.f47026b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && u((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC7018d.f45933a.b(i10, this.f47026b);
        return this.f47025a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return p139n8.c.i(this.f47025a, 0, this.f47026b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f47026b; i10++) {
            if (Intrinsics.b(this.f47025a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f47026b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f47026b - 1; i10 >= 0; i10--) {
            if (Intrinsics.b(this.f47025a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        t();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        t();
        return C(0, this.f47026b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        t();
        return C(0, this.f47026b, elements, true) > 0;
    }

    public final List s() {
        t();
        this.f47027c = true;
        return this.f47026b > 0 ? this : f47024e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        t();
        AbstractC7018d.f45933a.b(i10, this.f47026b);
        Object[] objArr = this.f47025a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC7018d.f45933a.d(i10, i11, this.f47026b);
        return new a(this.f47025a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.f47026b;
        if (length >= i10) {
            AbstractC7024j.h(this.f47025a, array, 0, 0, i10);
            return CollectionsKt.e(this.f47026b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f47025a, 0, i10, array.getClass());
        Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return p139n8.c.j(this.f47025a, 0, this.f47026b, this);
    }

    public b(int i10) {
        this.f47025a = p139n8.c.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC7018d.f45933a.c(i10, this.f47026b);
        return new c(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        t();
        AbstractC7018d.f45933a.c(i10, this.f47026b);
        r(i10, obj);
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        t();
        AbstractC7018d.f45933a.c(i10, this.f47026b);
        int size = elements.size();
        q(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC7024j.m(this.f47025a, 0, this.f47026b);
    }
}
