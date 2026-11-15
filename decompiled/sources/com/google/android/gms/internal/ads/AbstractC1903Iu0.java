package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1903Iu0 extends AbstractC5427uu0 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC5931yu0 f19687b;

    AbstractC1903Iu0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC1903Iu0 A(int i10, Object... objArr) {
        if (i10 == 0) {
            return C6059zv0.f35880i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C1957Jv0(obj);
        }
        int iR = r(i10);
        Object[] objArr2 = new Object[iR];
        int i11 = iR - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            AbstractC4926qv0.b(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iA = AbstractC4924qu0.a(iHashCode);
            while (true) {
                int i15 = iA & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C1957Jv0(obj4);
        }
        if (r(i13) < iR / 2) {
            return A(i13, objArr);
        }
        if (B(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C6059zv0(objArr, i12, objArr2, i11, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static AbstractC1903Iu0 k() {
        return C6059zv0.f35880i;
    }

    public static AbstractC1903Iu0 l(Object obj) {
        return new C1957Jv0(obj);
    }

    public static AbstractC1903Iu0 m(Object obj, Object obj2) {
        return A(2, obj, obj2);
    }

    public static AbstractC1903Iu0 o(Object obj, Object obj2, Object obj3) {
        return A(3, obj, obj2, obj3);
    }

    public static AbstractC1903Iu0 p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return A(5, obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC1903Iu0 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 6;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return A(i10, objArr2);
    }

    static int r(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            AbstractC2418Ss0.b(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static AbstractC1903Iu0 s(Collection collection) {
        if ((collection instanceof AbstractC1903Iu0) && !(collection instanceof SortedSet)) {
            AbstractC1903Iu0 abstractC1903Iu0 = (AbstractC1903Iu0) collection;
            if (!abstractC1903Iu0.i()) {
                return abstractC1903Iu0;
            }
        }
        Object[] array = collection.toArray();
        return A(array.length, array);
    }

    public static AbstractC1903Iu0 t(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? A(length, (Object[]) objArr.clone()) : new C1957Jv0(objArr[0]);
        }
        return C6059zv0.f35880i;
    }

    public static C1851Hu0 w(int i10) {
        AbstractC2472Tt0.b(i10, "expectedSize");
        return new C1851Hu0(i10, true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    public abstract AbstractC2112Mv0 a();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1903Iu0) && u() && ((AbstractC1903Iu0) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC1905Iv0.d(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    public AbstractC5931yu0 g() {
        AbstractC5931yu0 abstractC5931yu0 = this.f19687b;
        if (abstractC5931yu0 != null) {
            return abstractC5931yu0;
        }
        AbstractC5931yu0 abstractC5931yu0V = v();
        this.f19687b = abstractC5931yu0V;
        return abstractC5931yu0V;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC1905Iv0.c(this);
    }

    boolean u() {
        return false;
    }

    AbstractC5931yu0 v() {
        Object[] array = toArray();
        int i10 = AbstractC5931yu0.f35482c;
        return AbstractC5931yu0.y(array, array.length);
    }
}
