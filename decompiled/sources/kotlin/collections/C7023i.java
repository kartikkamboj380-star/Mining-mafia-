package kotlin.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7023i extends AbstractC7020f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f45942d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f45943e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f45945b = f45943e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45946c;

    /* JADX INFO: renamed from: kotlin.collections.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void e(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f45945b.length;
        while (i10 < length && it.hasNext()) {
            this.f45945b[i10] = it.next();
            i10++;
        }
        int i11 = this.f45944a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f45945b[i12] = it.next();
        }
        this.f45946c = size() + collection.size();
    }

    private final void g(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f45945b;
        C7027m.h(objArr2, objArr, 0, this.f45944a, objArr2.length);
        Object[] objArr3 = this.f45945b;
        int length = objArr3.length;
        int i11 = this.f45944a;
        C7027m.h(objArr3, objArr, length - i11, 0, i11);
        this.f45944a = 0;
        this.f45945b = objArr;
    }

    private final int i(int i10) {
        return i10 == 0 ? C7028n.B(this.f45945b) : i10 - 1;
    }

    private final void j(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f45945b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f45943e) {
            this.f45945b = new Object[kotlin.ranges.b.c(i10, 10)];
        } else {
            g(AbstractC7018d.f45933a.e(objArr.length, i10));
        }
    }

    private final int k(int i10) {
        if (i10 == C7028n.B(this.f45945b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int l(int i10) {
        return i10 < 0 ? i10 + this.f45945b.length : i10;
    }

    private final void m(int i10, int i11) {
        if (i10 < i11) {
            C7027m.n(this.f45945b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f45945b;
        C7027m.n(objArr, null, i10, objArr.length);
        C7027m.n(this.f45945b, null, 0, i11);
    }

    private final int o(int i10) {
        Object[] objArr = this.f45945b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void p() {
        ((AbstractList) this).modCount++;
    }

    private final void s(int i10, int i11) {
        int iO = o(this.f45944a + (i10 - 1));
        int iO2 = o(this.f45944a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iO + 1;
            int iMin = Math.min(i10, Math.min(i12, iO2 + 1));
            Object[] objArr = this.f45945b;
            int i13 = iO2 - iMin;
            int i14 = iO - iMin;
            C7027m.h(objArr, objArr, i13 + 1, i14 + 1, i12);
            iO = l(i14);
            iO2 = l(i13);
            i10 -= iMin;
        }
    }

    private final void t(int i10, int i11) {
        int iO = o(this.f45944a + i11);
        int iO2 = o(this.f45944a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f45945b;
            i11 = Math.min(size, Math.min(objArr.length - iO, objArr.length - iO2));
            Object[] objArr2 = this.f45945b;
            int i12 = iO + i11;
            C7027m.h(objArr2, objArr2, iO2, iO, i12);
            iO = o(i12);
            iO2 = o(iO2 + i11);
        }
    }

    @Override // kotlin.collections.AbstractC7020f
    public int a() {
        return this.f45946c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        p();
        j(size() + elements.size());
        e(o(this.f45944a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        j(size() + 1);
        int i10 = i(this.f45944a);
        this.f45944a = i10;
        this.f45945b[i10] = obj;
        this.f45946c = size() + 1;
    }

    public final void addLast(Object obj) {
        p();
        j(size() + 1);
        this.f45945b[o(this.f45944a + size())] = obj;
        this.f45946c = size() + 1;
    }

    @Override // kotlin.collections.AbstractC7020f
    public Object b(int i10) {
        AbstractC7018d.f45933a.b(i10, size());
        if (i10 == q.k(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        p();
        int iO = o(this.f45944a + i10);
        Object obj = this.f45945b[iO];
        if (i10 < (size() >> 1)) {
            int i11 = this.f45944a;
            if (iO >= i11) {
                Object[] objArr = this.f45945b;
                C7027m.h(objArr, objArr, i11 + 1, i11, iO);
            } else {
                Object[] objArr2 = this.f45945b;
                C7027m.h(objArr2, objArr2, 1, 0, iO);
                Object[] objArr3 = this.f45945b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f45944a;
                C7027m.h(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f45945b;
            int i13 = this.f45944a;
            objArr4[i13] = null;
            this.f45944a = k(i13);
        } else {
            int iO2 = o(this.f45944a + q.k(this));
            if (iO <= iO2) {
                Object[] objArr5 = this.f45945b;
                C7027m.h(objArr5, objArr5, iO, iO + 1, iO2 + 1);
            } else {
                Object[] objArr6 = this.f45945b;
                C7027m.h(objArr6, objArr6, iO, iO + 1, objArr6.length);
                Object[] objArr7 = this.f45945b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C7027m.h(objArr7, objArr7, 0, 1, iO2 + 1);
            }
            this.f45945b[iO2] = null;
        }
        this.f45946c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            p();
            m(this.f45944a, o(this.f45944a + size()));
        }
        this.f45944a = 0;
        this.f45946c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC7018d.f45933a.b(i10, size());
        return this.f45945b[o(this.f45944a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iO = o(this.f45944a + size());
        int length = this.f45944a;
        if (length < iO) {
            while (length < iO) {
                if (Intrinsics.b(obj, this.f45945b[length])) {
                    i10 = this.f45944a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iO) {
            return -1;
        }
        int length2 = this.f45945b.length;
        while (length < length2) {
            if (Intrinsics.b(obj, this.f45945b[length])) {
                i10 = this.f45944a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iO; i11++) {
            if (Intrinsics.b(obj, this.f45945b[i11])) {
                length = i11 + this.f45945b.length;
                i10 = this.f45944a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iB;
        int i10;
        int iO = o(this.f45944a + size());
        int i11 = this.f45944a;
        if (i11 < iO) {
            iB = iO - 1;
            if (i11 <= iB) {
                while (!Intrinsics.b(obj, this.f45945b[iB])) {
                    if (iB != i11) {
                        iB--;
                    }
                }
                i10 = this.f45944a;
                return iB - i10;
            }
            return -1;
        }
        if (i11 > iO) {
            for (int i12 = iO - 1; -1 < i12; i12--) {
                if (Intrinsics.b(obj, this.f45945b[i12])) {
                    iB = i12 + this.f45945b.length;
                    i10 = this.f45944a;
                    return iB - i10;
                }
            }
            iB = C7028n.B(this.f45945b);
            int i13 = this.f45944a;
            if (i13 <= iB) {
                while (!Intrinsics.b(obj, this.f45945b[iB])) {
                    if (iB != i13) {
                        iB--;
                    }
                }
                i10 = this.f45944a;
                return iB - i10;
            }
        }
        return -1;
    }

    public final Object q() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object r() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f45945b.length != 0) {
            int iO2 = o(this.f45944a + size());
            int i10 = this.f45944a;
            if (i10 < iO2) {
                iO = i10;
                while (i10 < iO2) {
                    Object obj = this.f45945b[i10];
                    if (elements.contains(obj)) {
                        z9 = true;
                    } else {
                        this.f45945b[iO] = obj;
                        iO++;
                    }
                    i10++;
                }
                C7027m.n(this.f45945b, null, iO, iO2);
            } else {
                int length = this.f45945b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f45945b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f45945b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iO = o(i11);
                for (int i12 = 0; i12 < iO2; i12++) {
                    Object[] objArr2 = this.f45945b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f45945b[iO] = obj3;
                        iO = k(iO);
                    }
                }
                z9 = z10;
            }
            if (z9) {
                p();
                this.f45946c = l(iO - this.f45944a);
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        Object[] objArr = this.f45945b;
        int i10 = this.f45944a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f45944a = k(i10);
        this.f45946c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        int iO = o(this.f45944a + q.k(this));
        Object[] objArr = this.f45945b;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.f45946c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractC7018d.f45933a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        p();
        if (i10 < size() - i11) {
            s(i10, i11);
            int iO = o(this.f45944a + i12);
            m(this.f45944a, iO);
            this.f45944a = iO;
        } else {
            t(i10, i11);
            int iO2 = o(this.f45944a + size());
            m(l(iO2 - i12), iO2);
        }
        this.f45946c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f45945b.length != 0) {
            int iO2 = o(this.f45944a + size());
            int i10 = this.f45944a;
            if (i10 < iO2) {
                iO = i10;
                while (i10 < iO2) {
                    Object obj = this.f45945b[i10];
                    if (elements.contains(obj)) {
                        this.f45945b[iO] = obj;
                        iO++;
                    } else {
                        z9 = true;
                    }
                    i10++;
                }
                C7027m.n(this.f45945b, null, iO, iO2);
            } else {
                int length = this.f45945b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f45945b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f45945b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iO = o(i11);
                for (int i12 = 0; i12 < iO2; i12++) {
                    Object[] objArr2 = this.f45945b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f45945b[iO] = obj3;
                        iO = k(iO);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                p();
                this.f45946c = l(iO - this.f45944a);
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC7018d.f45933a.b(i10, size());
        int iO = o(this.f45944a + i10);
        Object[] objArr = this.f45945b;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = C7025k.a(array, size());
        }
        Object[] objArr = array;
        int iO = o(this.f45944a + size());
        int i10 = this.f45944a;
        if (i10 < iO) {
            C7027m.k(this.f45945b, objArr, 0, i10, iO, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f45945b;
            C7027m.h(objArr2, objArr, 0, this.f45944a, objArr2.length);
            Object[] objArr3 = this.f45945b;
            C7027m.h(objArr3, objArr, objArr3.length - this.f45944a, 0, iO);
        }
        return C7030p.e(size(), objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC7018d.f45933a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        p();
        j(size() + 1);
        int iO = o(this.f45944a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = i(iO);
            int i12 = i(this.f45944a);
            int i13 = this.f45944a;
            if (i11 >= i13) {
                Object[] objArr = this.f45945b;
                objArr[i12] = objArr[i13];
                C7027m.h(objArr, objArr, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr2 = this.f45945b;
                C7027m.h(objArr2, objArr2, i13 - 1, i13, objArr2.length);
                Object[] objArr3 = this.f45945b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C7027m.h(objArr3, objArr3, 0, 1, i11 + 1);
            }
            this.f45945b[i11] = obj;
            this.f45944a = i12;
        } else {
            int iO2 = o(this.f45944a + size());
            if (iO < iO2) {
                Object[] objArr4 = this.f45945b;
                C7027m.h(objArr4, objArr4, iO + 1, iO, iO2);
            } else {
                Object[] objArr5 = this.f45945b;
                C7027m.h(objArr5, objArr5, 1, 0, iO2);
                Object[] objArr6 = this.f45945b;
                objArr6[0] = objArr6[objArr6.length - 1];
                C7027m.h(objArr6, objArr6, iO + 1, iO, objArr6.length - 1);
            }
            this.f45945b[iO] = obj;
        }
        this.f45946c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC7018d.f45933a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        p();
        j(size() + elements.size());
        int iO = o(this.f45944a + size());
        int iO2 = o(this.f45944a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f45944a;
            int length = i11 - size;
            if (iO2 < i11) {
                Object[] objArr = this.f45945b;
                C7027m.h(objArr, objArr, length, i11, objArr.length);
                if (size >= iO2) {
                    Object[] objArr2 = this.f45945b;
                    C7027m.h(objArr2, objArr2, objArr2.length - size, 0, iO2);
                } else {
                    Object[] objArr3 = this.f45945b;
                    C7027m.h(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f45945b;
                    C7027m.h(objArr4, objArr4, 0, size, iO2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f45945b;
                C7027m.h(objArr5, objArr5, length, i11, iO2);
            } else {
                Object[] objArr6 = this.f45945b;
                length += objArr6.length;
                int i12 = iO2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    C7027m.h(objArr6, objArr6, length, i11, iO2);
                } else {
                    C7027m.h(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f45945b;
                    C7027m.h(objArr7, objArr7, 0, this.f45944a + length2, iO2);
                }
            }
            this.f45944a = length;
            e(l(iO2 - size), elements);
        } else {
            int i13 = iO2 + size;
            if (iO2 < iO) {
                int i14 = size + iO;
                Object[] objArr8 = this.f45945b;
                if (i14 <= objArr8.length) {
                    C7027m.h(objArr8, objArr8, i13, iO2, iO);
                } else if (i13 >= objArr8.length) {
                    C7027m.h(objArr8, objArr8, i13 - objArr8.length, iO2, iO);
                } else {
                    int length3 = iO - (i14 - objArr8.length);
                    C7027m.h(objArr8, objArr8, 0, length3, iO);
                    Object[] objArr9 = this.f45945b;
                    C7027m.h(objArr9, objArr9, i13, iO2, length3);
                }
            } else {
                Object[] objArr10 = this.f45945b;
                C7027m.h(objArr10, objArr10, size, 0, iO);
                Object[] objArr11 = this.f45945b;
                if (i13 >= objArr11.length) {
                    C7027m.h(objArr11, objArr11, i13 - objArr11.length, iO2, objArr11.length);
                } else {
                    C7027m.h(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f45945b;
                    C7027m.h(objArr12, objArr12, i13, iO2, objArr12.length - size);
                }
            }
            e(iO2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
