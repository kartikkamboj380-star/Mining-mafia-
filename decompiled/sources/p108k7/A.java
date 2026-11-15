package p108k7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f45608i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f45609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f45611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f45612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f45613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e f45614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f45615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f45616h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            A.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && A.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = A.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            A.this.g(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return A.this.f45612d;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f45630f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            A.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return A.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return A.this.h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return A.this.f45612d;
        }
    }

    private abstract class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f45621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f45622b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45623c;

        d() {
            this.f45621a = A.this.f45614f.f45628d;
            this.f45623c = A.this.f45613e;
        }

        final e a() {
            e eVar = this.f45621a;
            A a10 = A.this;
            if (eVar == a10.f45614f) {
                throw new NoSuchElementException();
            }
            if (a10.f45613e != this.f45623c) {
                throw new ConcurrentModificationException();
            }
            this.f45621a = eVar.f45628d;
            this.f45622b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45621a != A.this.f45614f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f45622b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            A.this.g(eVar, true);
            this.f45622b = null;
            this.f45623c = A.this.f45613e;
        }
    }

    public A() {
        this(f45608i, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void f(e eVar, boolean z9) {
        while (eVar != null) {
            e eVar2 = eVar.f45626b;
            e eVar3 = eVar.f45627c;
            int i10 = eVar2 != null ? eVar2.f45633i : 0;
            int i11 = eVar3 != null ? eVar3.f45633i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f45626b;
                e eVar5 = eVar3.f45627c;
                int i13 = (eVar4 != null ? eVar4.f45633i : 0) - (eVar5 != null ? eVar5.f45633i : 0);
                if (i13 == -1 || (i13 == 0 && !z9)) {
                    j(eVar);
                } else {
                    k(eVar3);
                    j(eVar);
                }
                if (z9) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f45626b;
                e eVar7 = eVar2.f45627c;
                int i14 = (eVar6 != null ? eVar6.f45633i : 0) - (eVar7 != null ? eVar7.f45633i : 0);
                if (i14 == 1 || (i14 == 0 && !z9)) {
                    k(eVar);
                } else {
                    j(eVar2);
                    k(eVar);
                }
                if (z9) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f45633i = i10 + 1;
                if (z9) {
                    return;
                }
            } else {
                eVar.f45633i = Math.max(i10, i11) + 1;
                if (!z9) {
                    return;
                }
            }
            eVar = eVar.f45625a;
        }
    }

    private void i(e eVar, e eVar2) {
        e eVar3 = eVar.f45625a;
        eVar.f45625a = null;
        if (eVar2 != null) {
            eVar2.f45625a = eVar3;
        }
        if (eVar3 == null) {
            this.f45611c = eVar2;
        } else if (eVar3.f45626b == eVar) {
            eVar3.f45626b = eVar2;
        } else {
            eVar3.f45627c = eVar2;
        }
    }

    private void j(e eVar) {
        e eVar2 = eVar.f45626b;
        e eVar3 = eVar.f45627c;
        e eVar4 = eVar3.f45626b;
        e eVar5 = eVar3.f45627c;
        eVar.f45627c = eVar4;
        if (eVar4 != null) {
            eVar4.f45625a = eVar;
        }
        i(eVar, eVar3);
        eVar3.f45626b = eVar;
        eVar.f45625a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f45633i : 0, eVar4 != null ? eVar4.f45633i : 0) + 1;
        eVar.f45633i = iMax;
        eVar3.f45633i = Math.max(iMax, eVar5 != null ? eVar5.f45633i : 0) + 1;
    }

    private void k(e eVar) {
        e eVar2 = eVar.f45626b;
        e eVar3 = eVar.f45627c;
        e eVar4 = eVar2.f45626b;
        e eVar5 = eVar2.f45627c;
        eVar.f45626b = eVar5;
        if (eVar5 != null) {
            eVar5.f45625a = eVar;
        }
        i(eVar, eVar2);
        eVar2.f45627c = eVar;
        eVar.f45625a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f45633i : 0, eVar5 != null ? eVar5.f45633i : 0) + 1;
        eVar.f45633i = iMax;
        eVar2.f45633i = Math.max(iMax, eVar4 != null ? eVar4.f45633i : 0) + 1;
    }

    e b(Object obj, boolean z9) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f45609a;
        e eVar2 = this.f45611c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f45608i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f45630f) : comparator.compare(obj, eVar2.f45630f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f45626b : eVar2.f45627c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e eVar4 = eVar2;
        if (!z9) {
            return null;
        }
        e eVar5 = this.f45614f;
        if (eVar4 != null) {
            eVar = new e(this.f45610b, eVar4, obj, eVar5, eVar5.f45629e);
            if (iCompareTo < 0) {
                eVar4.f45626b = eVar;
            } else {
                eVar4.f45627c = eVar;
            }
            f(eVar4, true);
        } else {
            if (comparator == f45608i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f45610b, eVar4, obj, eVar5, eVar5.f45629e);
            this.f45611c = eVar;
        }
        this.f45612d++;
        this.f45613e++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e eVarE = e(entry.getKey());
        if (eVarE == null || !a(eVarE.f45632h, entry.getValue())) {
            return null;
        }
        return eVarE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f45611c = null;
        this.f45612d = 0;
        this.f45613e++;
        e eVar = this.f45614f;
        eVar.f45629e = eVar;
        eVar.f45628d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    e e(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f45615g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f45615g = bVar2;
        return bVar2;
    }

    void g(e eVar, boolean z9) {
        int i10;
        if (z9) {
            e eVar2 = eVar.f45629e;
            eVar2.f45628d = eVar.f45628d;
            eVar.f45628d.f45629e = eVar2;
        }
        e eVar3 = eVar.f45626b;
        e eVar4 = eVar.f45627c;
        e eVar5 = eVar.f45625a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                i(eVar, eVar3);
                eVar.f45626b = null;
            } else if (eVar4 != null) {
                i(eVar, eVar4);
                eVar.f45627c = null;
            } else {
                i(eVar, null);
            }
            f(eVar5, false);
            this.f45612d--;
            this.f45613e++;
            return;
        }
        e eVarB = eVar3.f45633i > eVar4.f45633i ? eVar3.b() : eVar4.a();
        g(eVarB, false);
        e eVar6 = eVar.f45626b;
        if (eVar6 != null) {
            i10 = eVar6.f45633i;
            eVarB.f45626b = eVar6;
            eVar6.f45625a = eVarB;
            eVar.f45626b = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f45627c;
        if (eVar7 != null) {
            i11 = eVar7.f45633i;
            eVarB.f45627c = eVar7;
            eVar7.f45625a = eVarB;
            eVar.f45627c = null;
        }
        eVarB.f45633i = Math.max(i10, i11) + 1;
        i(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarE = e(obj);
        if (eVarE != null) {
            return eVarE.f45632h;
        }
        return null;
    }

    e h(Object obj) {
        e eVarE = e(obj);
        if (eVarE != null) {
            g(eVarE, true);
        }
        return eVarE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f45616h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f45616h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f45610b) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.f45632h;
        eVarB.f45632h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarH = h(obj);
        if (eVarH != null) {
            return eVarH.f45632h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f45612d;
    }

    public A(boolean z9) {
        this(f45608i, z9);
    }

    public A(Comparator comparator, boolean z9) {
        this.f45612d = 0;
        this.f45613e = 0;
        this.f45609a = comparator == null ? f45608i : comparator;
        this.f45610b = z9;
        this.f45614f = new e(z9);
    }

    static final class e implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f45625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f45626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f45627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f45628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e f45629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object f45630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f45631g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45632h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f45633i;

        e(boolean z9) {
            this.f45630f = null;
            this.f45631g = z9;
            this.f45629e = this;
            this.f45628d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f45626b; eVar2 != null; eVar2 = eVar2.f45626b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f45627c; eVar2 != null; eVar2 = eVar2.f45627c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f45630f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f45632h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f45630f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f45632h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f45630f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f45632h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f45631g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f45632h;
            this.f45632h = obj;
            return obj2;
        }

        public String toString() {
            return this.f45630f + "=" + this.f45632h;
        }

        e(boolean z9, e eVar, Object obj, e eVar2, e eVar3) {
            this.f45625a = eVar;
            this.f45630f = obj;
            this.f45631g = z9;
            this.f45633i = 1;
            this.f45628d = eVar2;
            this.f45629e = eVar3;
            eVar3.f45628d = this;
            eVar2.f45629e = this;
        }
    }
}
