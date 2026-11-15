package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5931yu0 extends AbstractC5427uu0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2164Nv0 f35481b = new C5679wu0(C5303tv0.f33514f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35482c = 0;

    AbstractC5931yu0() {
    }

    public static C5553vu0 A(int i10) {
        AbstractC2472Tt0.b(i10, "expectedSize");
        return new C5553vu0(i10);
    }

    public static AbstractC5931yu0 l() {
        return C5303tv0.f33514f;
    }

    public static AbstractC5931yu0 m(Object obj) {
        Object[] objArr = {obj};
        AbstractC4926qv0.a(objArr, 1);
        return y(objArr, 1);
    }

    public static AbstractC5931yu0 o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC4926qv0.a(objArr, 2);
        return y(objArr, 2);
    }

    public static AbstractC5931yu0 p(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC4926qv0.a(objArr, 3);
        return y(objArr, 3);
    }

    public static AbstractC5931yu0 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        AbstractC4926qv0.a(objArr, 5);
        return y(objArr, 5);
    }

    public static AbstractC5931yu0 r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        AbstractC4926qv0.a(objArr, 6);
        return y(objArr, 6);
    }

    public static AbstractC5931yu0 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 12;
        Object[] objArr2 = new Object[i10];
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
        System.arraycopy(objArr, 0, objArr2, 12, length);
        AbstractC4926qv0.a(objArr2, i10);
        return y(objArr2, i10);
    }

    public static AbstractC5931yu0 t(Iterable iterable) {
        iterable.getClass();
        return u((Collection) iterable);
    }

    public static AbstractC5931yu0 u(Collection collection) {
        if (!(collection instanceof AbstractC5427uu0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC4926qv0.a(array, length);
            return y(array, length);
        }
        AbstractC5931yu0 abstractC5931yu0G = ((AbstractC5427uu0) collection).g();
        if (!abstractC5931yu0G.i()) {
            return abstractC5931yu0G;
        }
        Object[] array2 = abstractC5931yu0G.toArray();
        return y(array2, array2.length);
    }

    public static AbstractC5931yu0 v(Object[] objArr) {
        if (objArr.length == 0) {
            return C5303tv0.f33514f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        AbstractC4926qv0.a(objArr2, length);
        return y(objArr2, length);
    }

    public static AbstractC5931yu0 w(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : AbstractC2786Zu0.a(((AbstractC5931yu0) iterable).listIterator(0))).toArray();
        int length = array.length;
        AbstractC4926qv0.a(array, length);
        Arrays.sort(array, comparator);
        return y(array, length);
    }

    static AbstractC5931yu0 y(Object[] objArr, int i10) {
        return i10 == 0 ? C5303tv0.f33514f : new C5303tv0(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC2112Mv0 a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!Objects.equals(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC5931yu0 g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    int j(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC5931yu0 subList(int i10, int i11) {
        AbstractC2418Ss0.o(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C5303tv0.f33514f : new C5805xu0(this, i10, i12);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
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
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final AbstractC2164Nv0 listIterator(int i10) {
        AbstractC2418Ss0.n(i10, size(), "index");
        return isEmpty() ? f35481b : new C5679wu0(this, i10);
    }
}
