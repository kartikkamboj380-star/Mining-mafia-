package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class b0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f9445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f9446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile f f9448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f9449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f9450f;

    class a extends b0 {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        public void q() {
            if (!p()) {
                if (l() > 0) {
                    p070h.w.a(k(0).getKey());
                    throw null;
                }
                Iterator it = n().iterator();
                if (it.hasNext()) {
                    p070h.w.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.q();
        }
    }

    private class c extends f {
        private c() {
            super(b0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(b0.this, null);
        }

        /* synthetic */ c(b0 b0Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f9455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f9456b;

        d(b0 b0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean d(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f9455a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return d(this.f9455a, entry.getKey()) && d(this.f9456b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f9456b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f9455a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f9456b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b0.this.h();
            Object obj2 = this.f9456b;
            this.f9456b = obj;
            return obj2;
        }

        public String toString() {
            return this.f9455a + "=" + this.f9456b;
        }

        d(Comparable comparable, Object obj) {
            this.f9455a = comparable;
            this.f9456b = obj;
        }
    }

    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            b0.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(b0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            b0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }

        /* synthetic */ f(b0 b0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ b0(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int g(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f9445a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((d) this.f9445a.get(i12)).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d) this.f9445a.get(i13)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((d) this.f9445a.get(i12)).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f9447c) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (!this.f9445a.isEmpty() || (this.f9445a instanceof ArrayList)) {
            return;
        }
        this.f9445a = new ArrayList(16);
    }

    private SortedMap o() {
        h();
        if (this.f9446b.isEmpty() && !(this.f9446b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9446b = treeMap;
            this.f9449e = treeMap.descendingMap();
        }
        return (SortedMap) this.f9446b;
    }

    static b0 r() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object t(int i10) {
        h();
        Object value = ((d) this.f9445a.remove(i10)).getValue();
        if (!this.f9446b.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f9445a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f9445a.isEmpty()) {
            this.f9445a.clear();
        }
        if (this.f9446b.isEmpty()) {
            return;
        }
        this.f9446b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f9446b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f9448d == null) {
            this.f9448d = new f(this, null);
        }
        return this.f9448d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        int size = size();
        if (size != b0Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != b0Var.l()) {
            return entrySet().equals(b0Var.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(b0Var.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f9446b.equals(b0Var.f9446b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((d) this.f9445a.get(iG)).getValue() : this.f9446b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += ((d) this.f9445a.get(i10)).hashCode();
        }
        return m() > 0 ? iHashCode + this.f9446b.hashCode() : iHashCode;
    }

    Set i() {
        if (this.f9450f == null) {
            this.f9450f = new c(this, null);
        }
        return this.f9450f;
    }

    public Map.Entry k(int i10) {
        return (Map.Entry) this.f9445a.get(i10);
    }

    public int l() {
        return this.f9445a.size();
    }

    public int m() {
        return this.f9446b.size();
    }

    public Iterable n() {
        return this.f9446b.isEmpty() ? Collections.EMPTY_SET : this.f9446b.entrySet();
    }

    public boolean p() {
        return this.f9447c;
    }

    public void q() {
        if (this.f9447c) {
            return;
        }
        this.f9446b = this.f9446b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9446b);
        this.f9449e = this.f9449e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9449e);
        this.f9447c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return t(iG);
        }
        if (this.f9446b.isEmpty()) {
            return null;
        }
        return this.f9446b.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((d) this.f9445a.get(iG)).setValue(obj);
        }
        j();
        int i10 = -(iG + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f9445a.size() == 16) {
            d dVar = (d) this.f9445a.remove(15);
            o().put(dVar.getKey(), dVar.getValue());
        }
        this.f9445a.add(i10, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f9445a.size() + this.f9446b.size();
    }

    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f9452b;

        private b() {
            this.f9451a = b0.this.f9445a.size();
        }

        private Iterator a() {
            if (this.f9452b == null) {
                this.f9452b = b0.this.f9449e.entrySet().iterator();
            }
            return this.f9452b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = b0.this.f9445a;
            int i10 = this.f9451a - 1;
            this.f9451a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f9451a;
            return (i10 > 0 && i10 <= b0.this.f9445a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(b0 b0Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f9459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f9460c;

        private e() {
            this.f9458a = -1;
        }

        private Iterator a() {
            if (this.f9460c == null) {
                this.f9460c = b0.this.f9446b.entrySet().iterator();
            }
            return this.f9460c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f9459b = true;
            int i10 = this.f9458a + 1;
            this.f9458a = i10;
            return i10 < b0.this.f9445a.size() ? (Map.Entry) b0.this.f9445a.get(this.f9458a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9458a + 1 < b0.this.f9445a.size() || (!b0.this.f9446b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9459b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f9459b = false;
            b0.this.h();
            if (this.f9458a >= b0.this.f9445a.size()) {
                a().remove();
                return;
            }
            b0 b0Var = b0.this;
            int i10 = this.f9458a;
            this.f9458a = i10 - 1;
            b0Var.t(i10);
        }

        /* synthetic */ e(b0 b0Var, a aVar) {
            this();
        }
    }

    private b0() {
        this.f9445a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f9446b = map;
        this.f9449e = map;
    }
}
