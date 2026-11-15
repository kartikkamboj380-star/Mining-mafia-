package Y5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements Map, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f6914d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient l f6915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient l f6916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient i f6917c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator f6918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f6919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f6921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0117a f6922e;

        /* JADX INFO: renamed from: Y5.k$a$a, reason: collision with other inner class name */
        static final class C0117a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f6923a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f6924b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f6925c;

            C0117a(Object obj, Object obj2, Object obj3) {
                this.f6923a = obj;
                this.f6924b = obj2;
                this.f6925c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f6923a + "=" + this.f6924b + " and " + this.f6923a + "=" + this.f6925c);
            }
        }

        public a() {
            this(4);
        }

        private k b(boolean z9) {
            Object[] objArrE;
            C0117a c0117a;
            C0117a c0117a2;
            if (z9 && (c0117a2 = this.f6922e) != null) {
                throw c0117a2.a();
            }
            int length = this.f6920c;
            if (this.f6918a == null) {
                objArrE = this.f6919b;
            } else {
                if (this.f6921d) {
                    this.f6919b = Arrays.copyOf(this.f6919b, length * 2);
                }
                objArrE = this.f6919b;
                if (!z9) {
                    objArrE = e(objArrE, this.f6920c);
                    if (objArrE.length < this.f6919b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f6918a);
            }
            this.f6921d = true;
            v vVarO = v.o(length, objArrE, this);
            if (!z9 || (c0117a = this.f6922e) == null) {
                return vVarO;
            }
            throw c0117a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f6919b;
            if (i11 > objArr.length) {
                this.f6919b = Arrays.copyOf(objArr, i.b.a(objArr.length, i11));
                this.f6921d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void j(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, s.a(comparator).b(p.c()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public k a() {
            return c();
        }

        public k c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f6920c + 1);
            d.a(obj, obj2);
            Object[] objArr = this.f6919b;
            int i10 = this.f6920c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f6920c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f6920c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        a(int i10) {
            this.f6919b = new Object[i10 * 2];
            this.f6920c = 0;
            this.f6921d = false;
        }
    }

    k() {
    }

    public static a a() {
        return new a();
    }

    public static k b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static k i() {
        return v.f6935h;
    }

    public static k j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        return v.n(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static k k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        d.a(obj9, obj10);
        return v.n(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static k l(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    abstract l c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract l e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return p.a(this, obj);
    }

    abstract i f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l entrySet() {
        l lVar = this.f6915a;
        if (lVar != null) {
            return lVar;
        }
        l lVarC = c();
        this.f6915a = lVarC;
        return lVarC;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l keySet() {
        l lVar = this.f6916b;
        if (lVar != null) {
            return lVar;
        }
        l lVarE = e();
        this.f6916b = lVarE;
        return lVarE;
    }

    @Override // java.util.Map
    public int hashCode() {
        return x.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i values() {
        i iVar = this.f6917c;
        if (iVar != null) {
            return iVar;
        }
        i iVarF = f();
        this.f6917c = iVarF;
        return iVarF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return p.b(this);
    }
}
