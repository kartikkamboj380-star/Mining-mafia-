package p190t;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p200u.a;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f49470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f49471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49472c;

    public k() {
        this(0, 1, null);
    }

    private final int c(Object obj, int i10) {
        int i11 = this.f49472c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.f49470a, i11, i10);
        if (iA < 0 || Intrinsics.b(obj, this.f49471b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f49470a[i12] == i10) {
            if (Intrinsics.b(obj, this.f49471b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f49470a[i13] == i10; i13--) {
            if (Intrinsics.b(obj, this.f49471b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int f() {
        int i10 = this.f49472c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.f49470a, i10, 0);
        if (iA < 0 || this.f49471b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f49470a[i11] == 0) {
            if (this.f49471b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f49470a[i12] == 0; i12--) {
            if (this.f49471b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(Object obj) {
        int i10 = this.f49472c * 2;
        Object[] objArr = this.f49471b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (Intrinsics.b(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f49472c;
        int[] iArr = this.f49470a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f49470a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49471b, i10 * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49471b = objArrCopyOf;
        }
        if (this.f49472c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f49472c > 0) {
            this.f49470a = a.f49746a;
            this.f49471b = a.f49748c;
            this.f49472c = 0;
        }
        if (this.f49472c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int e(Object obj) {
        return obj == null ? f() : c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                if (size() != ((k) obj).size()) {
                    return false;
                }
                k kVar = (k) obj;
                int i10 = this.f49472c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objK = k(i11);
                    Object obj2 = kVar.get(objG);
                    if (objK == null) {
                        if (obj2 != null || !kVar.containsKey(objG)) {
                            return false;
                        }
                    } else if (!Intrinsics.b(objK, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f49472c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objK2 = k(i13);
                Object obj3 = ((Map) obj).get(objG2);
                if (objK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!Intrinsics.b(objK2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object g(int i10) {
        if (i10 >= 0 && i10 < this.f49472c) {
            return this.f49471b[i10 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f49471b[(iE << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f49471b[(iE << 1) + 1] : obj2;
    }

    public void h(k map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i10 = map.f49472c;
        b(this.f49472c + i10);
        if (this.f49472c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.g(i11), map.k(i11));
            }
        } else if (i10 > 0) {
            AbstractC7024j.f(map.f49470a, this.f49470a, 0, 0, i10);
            AbstractC7024j.h(map.f49471b, this.f49471b, 0, 0, i10 << 1);
            this.f49472c = i10;
        }
    }

    public int hashCode() {
        int[] iArr = this.f49470a;
        Object[] objArr = this.f49471b;
        int i10 = this.f49472c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f49472c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        Object[] objArr = this.f49471b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f49470a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC7024j.f(iArr, iArr, i10, i14, i11);
                Object[] objArr2 = this.f49471b;
                AbstractC7024j.h(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f49471b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f49470a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49471b, i16 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49471b = objArrCopyOf;
            if (i11 != this.f49472c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                AbstractC7024j.f(iArr, this.f49470a, 0, 0, i10);
                AbstractC7024j.h(objArr, this.f49471b, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                AbstractC7024j.f(iArr, this.f49470a, i10, i17, i11);
                AbstractC7024j.h(objArr, this.f49471b, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f49472c) {
            throw new ConcurrentModificationException();
        }
        this.f49472c = i13;
        return obj;
    }

    public boolean isEmpty() {
        return this.f49472c <= 0;
    }

    public Object j(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f49472c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f49471b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object k(int i10) {
        if (i10 >= 0 && i10 < this.f49472c) {
            return this.f49471b[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f49472c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(obj, iHashCode) : f();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f49471b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f49470a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f49470a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49471b, i13 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49471b = objArrCopyOf;
            if (i10 != this.f49472c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f49470a;
            int i14 = i12 + 1;
            AbstractC7024j.f(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f49471b;
            AbstractC7024j.h(objArr2, objArr2, i14 << 1, i12 << 1, this.f49472c << 1);
        }
        int i15 = this.f49472c;
        if (i10 == i15) {
            int[] iArr3 = this.f49470a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f49471b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f49472c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return j(iE, obj2);
        }
        return null;
    }

    public int size() {
        return this.f49472c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49472c * 28);
        sb.append('{');
        int i10 = this.f49472c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objG = g(i11);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objK = k(i11);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public k(int i10) {
        this.f49470a = i10 == 0 ? a.f49746a : new int[i10];
        this.f49471b = i10 == 0 ? a.f49748c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !Intrinsics.b(obj2, k(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !Intrinsics.b(obj2, k(iE))) {
            return false;
        }
        j(iE, obj3);
        return true;
    }

    public /* synthetic */ k(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public k(k kVar) {
        this(0, 1, null);
        if (kVar != null) {
            h(kVar);
        }
    }
}
