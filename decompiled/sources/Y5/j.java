package Y5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends i implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final B f6909b = new b(u.f6932e, 0);

    public static final class a extends i.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public j f() {
            this.f6908c = true;
            return j.i(this.f6906a, this.f6907b);
        }

        a(int i10) {
            super(i10);
        }
    }

    static class b extends AbstractC1070a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j f6910c;

        b(j jVar, int i10) {
            super(jVar.size(), i10);
            this.f6910c = jVar;
        }

        @Override // Y5.AbstractC1070a
        protected Object a(int i10) {
            return this.f6910c.get(i10);
        }
    }

    class c extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f6911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f6912d;

        c(int i10, int i11) {
            this.f6911c = i10;
            this.f6912d = i11;
        }

        @Override // Y5.i
        Object[] b() {
            return j.this.b();
        }

        @Override // Y5.i
        int d() {
            return j.this.e() + this.f6911c + this.f6912d;
        }

        @Override // Y5.i
        int e() {
            return j.this.e() + this.f6911c;
        }

        @Override // java.util.List
        public Object get(int i10) {
            X5.j.f(i10, this.f6912d);
            return j.this.get(i10 + this.f6911c);
        }

        @Override // Y5.j, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // Y5.j, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6912d;
        }

        @Override // Y5.j, java.util.List
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public j subList(int i10, int i11) {
            X5.j.m(i10, i11, this.f6912d);
            j jVar = j.this;
            int i12 = this.f6911c;
            return jVar.subList(i10 + i12, i11 + i12);
        }

        @Override // Y5.j, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    j() {
    }

    static j g(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    static j i(Object[] objArr, int i10) {
        return i10 == 0 ? o() : new u(objArr, i10);
    }

    private static j j(Object... objArr) {
        return g(r.b(objArr));
    }

    public static j o() {
        return u.f6932e;
    }

    public static j p(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public static j q(Object obj, Object obj2, Object obj3) {
        return j(obj, obj2, obj3);
    }

    public static j r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return j(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static j s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        X5.j.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return j(objArr2);
    }

    @Override // Y5.i
    int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // Y5.i, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return n.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return n.b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public A iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public B listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return n.d(this, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public B listIterator(int i10) {
        X5.j.k(i10, size());
        return isEmpty() ? f6909b : new b(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t */
    public j subList(int i10, int i11) {
        X5.j.m(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? o() : u(i10, i11);
    }

    j u(int i10, int i11) {
        return new c(i10, i11 - i10);
    }
}
