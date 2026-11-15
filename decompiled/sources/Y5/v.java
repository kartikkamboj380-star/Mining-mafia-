package Y5;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class v extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final k f6935h = new v(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f6936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f6937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f6938g;

    static class a extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient k f6939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f6940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f6941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f6942f;

        /* JADX INFO: renamed from: Y5.v$a$a, reason: collision with other inner class name */
        class C0119a extends j {
            C0119a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f6942f;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                X5.j.f(i10, a.this.f6942f);
                int i11 = i10 * 2;
                Object obj = a.this.f6940d[a.this.f6941e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f6940d[i11 + (a.this.f6941e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        }

        a(k kVar, Object[] objArr, int i10, int i11) {
            this.f6939c = kVar;
            this.f6940d = objArr;
            this.f6941e = i10;
            this.f6942f = i11;
        }

        @Override // Y5.i
        int a(Object[] objArr, int i10) {
            return g().a(objArr, i10);
        }

        @Override // Y5.i, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f6939c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // Y5.l
        j k() {
            return new C0119a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: m */
        public A iterator() {
            return g().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6942f;
        }
    }

    static final class b extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient k f6944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient j f6945d;

        b(k kVar, j jVar) {
            this.f6944c = kVar;
            this.f6945d = jVar;
        }

        @Override // Y5.i
        int a(Object[] objArr, int i10) {
            return g().a(objArr, i10);
        }

        @Override // Y5.i, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f6944c.get(obj) != null;
        }

        @Override // Y5.l
        public j g() {
            return this.f6945d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: m */
        public A iterator() {
            return g().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6944c.size();
        }
    }

    static final class c extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f6946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f6947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f6948e;

        c(Object[] objArr, int i10, int i11) {
            this.f6946c = objArr;
            this.f6947d = i10;
            this.f6948e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            X5.j.f(i10, this.f6948e);
            Object obj = this.f6946c[(i10 * 2) + this.f6947d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6948e;
        }
    }

    private v(Object obj, Object[] objArr, int i10) {
        this.f6936e = obj;
        this.f6937f = objArr;
        this.f6938g = i10;
    }

    static v n(int i10, Object[] objArr) {
        return o(i10, objArr, null);
    }

    static v o(int i10, Object[] objArr, k.a aVar) {
        if (i10 == 0) {
            return (v) f6935h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return new v(null, objArr, 1);
        }
        X5.j.k(i10, objArr.length >> 1);
        Object objP = p(objArr, i10, l.i(i10), 0);
        if (objP instanceof Object[]) {
            Object[] objArr2 = (Object[]) objP;
            k.a.C0117a c0117a = (k.a.C0117a) objArr2[2];
            if (aVar == null) {
                throw c0117a.a();
            }
            aVar.f6922e = c0117a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objP = obj3;
            i10 = iIntValue;
        }
        return new v(objP, objArr, i10);
    }

    private static Object p(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        k.a.C0117a c0117a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                d.a(obj3, obj4);
                int iA = h.a(obj3.hashCode());
                while (true) {
                    int i20 = iA & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                        break;
                    }
                    if (obj3.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj5 = objArr[i22];
                        Objects.requireNonNull(obj5);
                        c0117a = new k.a.C0117a(obj3, obj4, obj5);
                        objArr[i22] = obj4;
                        break;
                    }
                    iA = i20 + 1;
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0117a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                d.a(obj6, obj7);
                int iA2 = h.a(obj6.hashCode());
                while (true) {
                    int i27 = iA2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                        break;
                    }
                    if (obj6.equals(objArr[i28])) {
                        int i29 = i28 ^ 1;
                        Object obj8 = objArr[i29];
                        Objects.requireNonNull(obj8);
                        c0117a = new k.a.C0117a(obj6, obj7, obj8);
                        objArr[i29] = obj7;
                        break;
                    }
                    iA2 = i27 + 1;
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0117a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            d.a(obj9, obj10);
            int iA3 = h.a(obj9.hashCode());
            while (true) {
                int i34 = iA3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                    break;
                }
                i13 = i14;
                if (obj9.equals(objArr[i35])) {
                    int i36 = i35 ^ 1;
                    Object obj11 = objArr[i36];
                    Objects.requireNonNull(obj11);
                    c0117a = new k.a.C0117a(obj9, obj10, obj11);
                    objArr[i36] = obj10;
                    break;
                }
                iA3 = i34 + 1;
                i14 = i13;
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0117a;
        return objArr2;
    }

    static Object q(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = h.a(obj2.hashCode());
            while (true) {
                int i12 = iA & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iA = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = h.a(obj2.hashCode());
            while (true) {
                int i14 = iA2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iA2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = h.a(obj2.hashCode());
            while (true) {
                int i16 = iA3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iA3 = i16 + 1;
            }
        }
    }

    @Override // Y5.k
    l c() {
        return new a(this, this.f6937f, 0, this.f6938g);
    }

    @Override // Y5.k
    l e() {
        return new b(this, new c(this.f6937f, 0, this.f6938g));
    }

    @Override // Y5.k
    i f() {
        return new c(this.f6937f, 1, this.f6938g);
    }

    @Override // Y5.k, java.util.Map
    public Object get(Object obj) {
        Object objQ = q(this.f6936e, this.f6937f, this.f6938g, 0, obj);
        if (objQ == null) {
            return null;
        }
        return objQ;
    }

    @Override // java.util.Map
    public int size() {
        return this.f6938g;
    }
}
