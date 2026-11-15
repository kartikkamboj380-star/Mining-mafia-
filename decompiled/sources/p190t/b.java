package p190t;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, Set, A8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f49444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f49445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49446c;

    private final class a extends g {
        public a() {
            super(b.this.i());
        }

        @Override // p190t.g
        protected Object a(int i10) {
            return b.this.o(i10);
        }

        @Override // p190t.g
        protected void b(int i10) {
            b.this.j(i10);
        }
    }

    public b() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int i11 = i();
        if (e().length < i10) {
            int[] iArrE = e();
            Object[] objArrB = b();
            d.a(this, i10);
            if (i() > 0) {
                AbstractC7024j.j(iArrE, e(), 0, 0, i(), 6, null);
                AbstractC7024j.k(objArrB, b(), 0, 0, i(), 6, null);
            }
        }
        if (i() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int i11 = i();
        if (obj == null) {
            iC = d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i12 = ~iC;
        if (i11 >= e().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] iArrE = e();
            Object[] objArrB = b();
            d.a(this, i13);
            if (i11 != i()) {
                throw new ConcurrentModificationException();
            }
            if (!(e().length == 0)) {
                AbstractC7024j.j(iArrE, e(), 0, 0, iArrE.length, 6, null);
                AbstractC7024j.k(objArrB, b(), 0, 0, objArrB.length, 6, null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            AbstractC7024j.f(e(), e(), i14, i12, i11);
            AbstractC7024j.h(b(), b(), i14, i12, i11);
        }
        if (i11 != i() || i12 >= e().length) {
            throw new ConcurrentModificationException();
        }
        e()[i12] = i10;
        b()[i12] = obj;
        m(i() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        a(i() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object[] b() {
        return this.f49445b;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (i() != 0) {
            l(p200u.a.f49746a);
            k(p200u.a.f49748c);
            m(0);
        }
        if (i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int[] e() {
        return this.f49444a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = i();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(o(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int g() {
        return this.f49446c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrE = e();
        int i10 = i();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArrE[i12];
        }
        return i11;
    }

    public final int i() {
        return this.f49446c;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return i() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final Object j(int i10) {
        int i11;
        Object[] objArr;
        int i12 = i();
        Object obj = b()[i10];
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        if (e().length <= 8 || i() >= e().length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC7024j.f(e(), e(), i10, i14, i12);
                AbstractC7024j.h(b(), b(), i10, i14, i12);
            }
            b()[i13] = null;
        } else {
            int i15 = i() > 8 ? i() + (i() >> 1) : 8;
            int[] iArrE = e();
            Object[] objArrB = b();
            d.a(this, i15);
            if (i10 > 0) {
                AbstractC7024j.j(iArrE, e(), 0, 0, i10, 6, null);
                objArr = objArrB;
                AbstractC7024j.k(objArr, b(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrB;
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                AbstractC7024j.f(iArrE, e(), i11, i16, i12);
                AbstractC7024j.h(objArr, b(), i11, i16, i12);
            }
        }
        if (i12 != i()) {
            throw new ConcurrentModificationException();
        }
        m(i13);
        return obj;
    }

    public final void k(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f49445b = objArr;
    }

    public final void l(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f49444a = iArr;
    }

    public final void m(int i10) {
        this.f49446c = i10;
    }

    public final Object o(int i10) {
        return b()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        j(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z9 = false;
        for (int i10 = i() - 1; -1 < i10; i10--) {
            if (!CollectionsKt.P(elements, b()[i10])) {
                j(i10);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC7024j.m(this.f49445b, 0, this.f49446c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i() * 14);
        sb.append('{');
        int i10 = i();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objO = o(i11);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public b(int i10) {
        this.f49444a = p200u.a.f49746a;
        this.f49445b = p200u.a.f49748c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] result = c.a(array, this.f49446c);
        AbstractC7024j.h(this.f49445b, result, 0, 0, this.f49446c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
