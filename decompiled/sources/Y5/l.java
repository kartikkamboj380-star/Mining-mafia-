package Y5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends i implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient j f6926b;

    l() {
    }

    static int i(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            X5.j.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private static l j(int i10, Object... objArr) {
        if (i10 == 0) {
            return o();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return p(obj);
        }
        int i11 = i(i10);
        Object[] objArr2 = new Object[i11];
        int i12 = i11 - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            Object objA = r.a(objArr[i15], i15);
            int iHashCode = objA.hashCode();
            int iA = h.a(iHashCode);
            while (true) {
                int i16 = iA & i12;
                Object obj2 = objArr2[i16];
                if (obj2 == null) {
                    objArr[i14] = objA;
                    objArr2[i16] = objA;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i14, i10, (Object) null);
        if (i14 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new y(obj3);
        }
        if (i(i14) < i11 / 2) {
            return j(i14, objArr);
        }
        if (s(i14, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new w(objArr, i13, objArr2, i12, i14);
    }

    public static l o() {
        return w.f6950i;
    }

    public static l p(Object obj) {
        return new y(obj);
    }

    public static l q(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    public static l r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        X5.j.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return j(length, objArr2);
    }

    private static boolean s(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l) && l() && ((l) obj).l() && hashCode() != obj.hashCode()) {
            return false;
        }
        return x.a(this, obj);
    }

    public j g() {
        j jVar = this.f6926b;
        if (jVar != null) {
            return jVar;
        }
        j jVarK = k();
        this.f6926b = jVarK;
        return jVarK;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return x.b(this);
    }

    j k() {
        return j.g(toArray());
    }

    boolean l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public abstract A iterator();
}
