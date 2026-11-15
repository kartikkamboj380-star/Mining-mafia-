package p139n8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC7018d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Map, Serializable, A8.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a f47041v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final d f47042w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f47043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f47044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f47045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f47046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p139n8.f f47052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f47053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p139n8.e f47054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f47055m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(kotlin.ranges.b.c(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f47042w;
        }

        private a() {
        }
    }

    public static final class b extends C0484d implements Iterator, A8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() >= e().f47048f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            c cVar = new c(e(), c());
            f();
            return cVar;
        }

        public final void j(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (b() >= e().f47048f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = e().f47043a[c()];
            if (obj == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = e().f47044b;
            Intrinsics.c(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            f();
        }

        public final int k() {
            if (b() >= e().f47048f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = e().f47043a[c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = e().f47044b;
            Intrinsics.c(objArr);
            Object obj2 = objArr[c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    public static final class c implements Map.Entry, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f47056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47058c;

        public c(d map, int i10) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f47056a = map;
            this.f47057b = i10;
            this.f47058c = map.f47050h;
        }

        private final void a() {
            if (this.f47056a.f47050h != this.f47058c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.b(entry.getKey(), getKey()) && Intrinsics.b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f47056a.f47043a[this.f47057b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f47056a.f47044b;
            Intrinsics.c(objArr);
            return objArr[this.f47057b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f47056a.m();
            Object[] objArrK = this.f47056a.k();
            int i10 = this.f47057b;
            Object obj2 = objArrK[i10];
            objArrK[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: n8.d$d, reason: collision with other inner class name */
    public static class C0484d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f47059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47062d;

        public C0484d(d map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f47059a = map;
            this.f47061c = -1;
            this.f47062d = map.f47050h;
            f();
        }

        public final void a() {
            if (this.f47059a.f47050h != this.f47062d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f47060b;
        }

        public final int c() {
            return this.f47061c;
        }

        public final d e() {
            return this.f47059a;
        }

        public final void f() {
            while (this.f47060b < this.f47059a.f47048f) {
                int[] iArr = this.f47059a.f47045c;
                int i10 = this.f47060b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f47060b = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f47060b = i10;
        }

        public final void h(int i10) {
            this.f47061c = i10;
        }

        public final boolean hasNext() {
            return this.f47060b < this.f47059a.f47048f;
        }

        public final void remove() {
            a();
            if (this.f47061c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f47059a.m();
            this.f47059a.K(this.f47061c);
            this.f47061c = -1;
            this.f47062d = this.f47059a.f47050h;
        }
    }

    public static final class e extends C0484d implements Iterator, A8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= e().f47048f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = e().f47043a[c()];
            f();
            return obj;
        }
    }

    public static final class f extends C0484d implements Iterator, A8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= e().f47048f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object[] objArr = e().f47044b;
            Intrinsics.c(objArr);
            Object obj = objArr[c()];
            f();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f47055m = true;
        f47042w = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f47043a = objArr;
        this.f47044b = objArr2;
        this.f47045c = iArr;
        this.f47046d = iArr2;
        this.f47047e = i10;
        this.f47048f = i11;
        this.f47049g = f47041v.d(y());
    }

    private final int C(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f47049g;
    }

    private final boolean E(Collection collection) {
        boolean z9 = false;
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (F((Map.Entry) it.next())) {
                z9 = true;
            }
        }
        return z9;
    }

    private final boolean F(Map.Entry entry) {
        int iJ = j(entry.getKey());
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = entry.getValue();
            return true;
        }
        int i10 = (-iJ) - 1;
        if (Intrinsics.b(entry.getValue(), objArrK[i10])) {
            return false;
        }
        objArrK[i10] = entry.getValue();
        return true;
    }

    private final boolean G(int i10) {
        int iC = C(this.f47043a[i10]);
        int i11 = this.f47047e;
        while (true) {
            int[] iArr = this.f47046d;
            if (iArr[iC] == 0) {
                iArr[iC] = i10 + 1;
                this.f47045c[i10] = iC;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    private final void H() {
        this.f47050h++;
    }

    private final void I(int i10) {
        H();
        int i11 = 0;
        if (this.f47048f > size()) {
            n(false);
        }
        this.f47046d = new int[i10];
        this.f47049g = f47041v.d(i10);
        while (i11 < this.f47048f) {
            int i12 = i11 + 1;
            if (!G(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i10) {
        p139n8.c.f(this.f47043a, i10);
        Object[] objArr = this.f47044b;
        if (objArr != null) {
            p139n8.c.f(objArr, i10);
        }
        L(this.f47045c[i10]);
        this.f47045c[i10] = -1;
        this.f47051i = size() - 1;
        H();
    }

    private final void L(int i10) {
        int iG = kotlin.ranges.b.g(this.f47047e * 2, y() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? y() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f47047e) {
                this.f47046d[i12] = 0;
                return;
            }
            int[] iArr = this.f47046d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((C(this.f47043a[i14]) - i10) & (y() - 1)) >= i11) {
                    this.f47046d[i12] = i13;
                    this.f47045c[i14] = i12;
                }
                iG--;
            }
            i12 = i10;
            i11 = 0;
            iG--;
        } while (iG >= 0);
        this.f47046d[i12] = -1;
    }

    private final boolean P(int i10) {
        int iW = w();
        int i11 = this.f47048f;
        int i12 = iW - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= w() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] k() {
        Object[] objArr = this.f47044b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = p139n8.c.d(w());
        this.f47044b = objArrD;
        return objArrD;
    }

    private final void n(boolean z9) {
        int i10;
        Object[] objArr = this.f47044b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f47048f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f47045c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f47043a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z9) {
                    iArr[i12] = i13;
                    this.f47046d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        p139n8.c.g(this.f47043a, i12, i10);
        if (objArr != null) {
            p139n8.c.g(objArr, i12, this.f47048f);
        }
        this.f47048f = i12;
    }

    private final boolean q(Map map) {
        return size() == map.size() && o(map.entrySet());
    }

    private final void r(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > w()) {
            int iE = AbstractC7018d.f45933a.e(w(), i10);
            this.f47043a = p139n8.c.e(this.f47043a, iE);
            Object[] objArr = this.f47044b;
            this.f47044b = objArr != null ? p139n8.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f47045c, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f47045c = iArrCopyOf;
            int iC = f47041v.c(iE);
            if (iC > y()) {
                I(iC);
            }
        }
    }

    private final void s(int i10) {
        if (P(i10)) {
            n(true);
        } else {
            r(this.f47048f + i10);
        }
    }

    private final int u(Object obj) {
        int iC = C(obj);
        int i10 = this.f47047e;
        while (true) {
            int i11 = this.f47046d[iC];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (Intrinsics.b(this.f47043a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    private final int v(Object obj) {
        int i10 = this.f47048f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f47045c[i10] >= 0) {
                Object[] objArr = this.f47044b;
                Intrinsics.c(objArr);
                if (Intrinsics.b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    private final int y() {
        return this.f47046d.length;
    }

    public int A() {
        return this.f47051i;
    }

    public Collection B() {
        g gVar = this.f47053k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f47053k = gVar2;
        return gVar2;
    }

    public final e D() {
        return new e(this);
    }

    public final boolean J(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        m();
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f47044b;
        Intrinsics.c(objArr);
        if (!Intrinsics.b(objArr[iU], entry.getValue())) {
            return false;
        }
        K(iU);
        return true;
    }

    public final boolean N(Object obj) {
        m();
        int iU = u(obj);
        if (iU < 0) {
            return false;
        }
        K(iU);
        return true;
    }

    public final boolean O(Object obj) {
        m();
        int iV = v(obj);
        if (iV < 0) {
            return false;
        }
        K(iV);
        return true;
    }

    public final f Q() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m();
        int i10 = this.f47048f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f47045c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f47046d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        p139n8.c.g(this.f47043a, 0, this.f47048f);
        Object[] objArr = this.f47044b;
        if (objArr != null) {
            p139n8.c.g(objArr, 0, this.f47048f);
        }
        this.f47051i = 0;
        this.f47048f = 0;
        H();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return u(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && q((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.f47044b;
        Intrinsics.c(objArr);
        return objArr[iU];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarT = t();
        int iK = 0;
        while (bVarT.hasNext()) {
            iK += bVarT.k();
        }
        return iK;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        m();
        while (true) {
            int iC = C(obj);
            int iG = kotlin.ranges.b.g(this.f47047e * 2, y() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f47046d[iC];
                if (i11 <= 0) {
                    if (this.f47048f >= w()) {
                        s(1);
                        break;
                    }
                    int i12 = this.f47048f;
                    int i13 = i12 + 1;
                    this.f47048f = i13;
                    this.f47043a[i12] = obj;
                    this.f47045c[i12] = iC;
                    this.f47046d[iC] = i13;
                    this.f47051i = size() + 1;
                    H();
                    if (i10 > this.f47047e) {
                        this.f47047e = i10;
                    }
                    return i12;
                }
                if (Intrinsics.b(this.f47043a[i11 - 1], obj)) {
                    return -i11;
                }
                i10++;
                if (i10 > iG) {
                    I(y() * 2);
                    break;
                }
                iC = iC == 0 ? y() - 1 : iC - 1;
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return z();
    }

    public final Map l() {
        m();
        this.f47055m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f47042w;
        Intrinsics.d(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void m() {
        if (this.f47055m) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean o(Collection m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f47044b;
        Intrinsics.c(objArr);
        return Intrinsics.b(objArr[iU], entry.getValue());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m();
        int iJ = j(obj);
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = obj2;
            return null;
        }
        int i10 = (-iJ) - 1;
        Object obj3 = objArrK[i10];
        objArrK[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        m();
        E(from.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m();
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.f47044b;
        Intrinsics.c(objArr);
        Object obj2 = objArr[iU];
        K(iU);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A();
    }

    public final b t() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarT = t();
        int i10 = 0;
        while (bVarT.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            bVarT.j(sb);
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return B();
    }

    public final int w() {
        return this.f47043a.length;
    }

    public Set x() {
        p139n8.e eVar = this.f47054l;
        if (eVar != null) {
            return eVar;
        }
        p139n8.e eVar2 = new p139n8.e(this);
        this.f47054l = eVar2;
        return eVar2;
    }

    public Set z() {
        p139n8.f fVar = this.f47052j;
        if (fVar != null) {
            return fVar;
        }
        p139n8.f fVar2 = new p139n8.f(this);
        this.f47052j = fVar2;
        return fVar2;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(p139n8.c.d(i10), null, new int[i10], new int[f47041v.c(i10)], 2, 0);
    }
}
