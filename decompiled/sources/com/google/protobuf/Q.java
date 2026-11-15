package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
abstract class Q extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f41163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f41164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile g f41166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f41167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile c f41168g;

    class a extends Q {
        a(int i10) {
            super(i10, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.Q
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry entryK = k(i10);
                    if (((FieldSet.FieldDescriptorLite) entryK.getKey()).isRepeated()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry entry : n()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    private class c extends g {
        private c() {
            super(Q.this, null);
        }

        @Override // com.google.protobuf.Q.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(Q.this, null);
        }

        /* synthetic */ c(Q q10, a aVar) {
            this();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f41173a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f41174b = new b();

        class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f41173a;
            }
        }

        static Iterable b() {
            return f41174b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f41175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f41176b;

        e(Q q10, Map.Entry entry) {
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
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f41175a;
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
            return d(this.f41175a, entry.getKey()) && d(this.f41176b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f41176b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f41175a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f41176b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Q.this.h();
            Object obj2 = this.f41176b;
            this.f41176b = obj;
            return obj2;
        }

        public String toString() {
            return this.f41175a + "=" + this.f41176b;
        }

        e(Comparable comparable, Object obj) {
            this.f41175a = comparable;
            this.f41176b = obj;
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            Q.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Q.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = Q.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(Q.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            Q.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Q.this.size();
        }

        /* synthetic */ g(Q q10, a aVar) {
            this();
        }
    }

    /* synthetic */ Q(int i10, a aVar) {
        this(i10);
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
        int size = this.f41163b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((e) this.f41163b.get(i12)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((e) this.f41163b.get(i13)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((e) this.f41163b.get(i12)).getKey());
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
        if (this.f41165d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (!this.f41163b.isEmpty() || (this.f41163b instanceof ArrayList)) {
            return;
        }
        this.f41163b = new ArrayList(this.f41162a);
    }

    private SortedMap o() {
        h();
        if (this.f41164c.isEmpty() && !(this.f41164c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f41164c = treeMap;
            this.f41167f = treeMap.descendingMap();
        }
        return (SortedMap) this.f41164c;
    }

    static Q r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object t(int i10) {
        h();
        Object value = ((e) this.f41163b.remove(i10)).getValue();
        if (!this.f41164c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f41163b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f41163b.isEmpty()) {
            this.f41163b.clear();
        }
        if (this.f41164c.isEmpty()) {
            return;
        }
        this.f41164c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f41164c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f41166e == null) {
            this.f41166e = new g(this, null);
        }
        return this.f41166e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return super.equals(obj);
        }
        Q q10 = (Q) obj;
        int size = size();
        if (size != q10.size()) {
            return false;
        }
        int iL = l();
        if (iL != q10.l()) {
            return entrySet().equals(q10.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(q10.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f41164c.equals(q10.f41164c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((e) this.f41163b.get(iG)).getValue() : this.f41164c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += ((e) this.f41163b.get(i10)).hashCode();
        }
        return m() > 0 ? iHashCode + this.f41164c.hashCode() : iHashCode;
    }

    Set i() {
        if (this.f41168g == null) {
            this.f41168g = new c(this, null);
        }
        return this.f41168g;
    }

    public Map.Entry k(int i10) {
        return (Map.Entry) this.f41163b.get(i10);
    }

    public int l() {
        return this.f41163b.size();
    }

    public int m() {
        return this.f41164c.size();
    }

    public Iterable n() {
        return this.f41164c.isEmpty() ? d.b() : this.f41164c.entrySet();
    }

    public boolean p() {
        return this.f41165d;
    }

    public void q() {
        if (this.f41165d) {
            return;
        }
        this.f41164c = this.f41164c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f41164c);
        this.f41167f = this.f41167f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f41167f);
        this.f41165d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return t(iG);
        }
        if (this.f41164c.isEmpty()) {
            return null;
        }
        return this.f41164c.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((e) this.f41163b.get(iG)).setValue(obj);
        }
        j();
        int i10 = -(iG + 1);
        if (i10 >= this.f41162a) {
            return o().put(comparable, obj);
        }
        int size = this.f41163b.size();
        int i11 = this.f41162a;
        if (size == i11) {
            e eVar = (e) this.f41163b.remove(i11 - 1);
            o().put(eVar.getKey(), eVar.getValue());
        }
        this.f41163b.add(i10, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f41163b.size() + this.f41164c.size();
    }

    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f41170b;

        private b() {
            this.f41169a = Q.this.f41163b.size();
        }

        private Iterator a() {
            if (this.f41170b == null) {
                this.f41170b = Q.this.f41167f.entrySet().iterator();
            }
            return this.f41170b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = Q.this.f41163b;
            int i10 = this.f41169a - 1;
            this.f41169a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f41169a;
            return (i10 > 0 && i10 <= Q.this.f41163b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(Q q10, a aVar) {
            this();
        }
    }

    private class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f41179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f41180c;

        private f() {
            this.f41178a = -1;
        }

        private Iterator a() {
            if (this.f41180c == null) {
                this.f41180c = Q.this.f41164c.entrySet().iterator();
            }
            return this.f41180c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f41179b = true;
            int i10 = this.f41178a + 1;
            this.f41178a = i10;
            return i10 < Q.this.f41163b.size() ? (Map.Entry) Q.this.f41163b.get(this.f41178a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41178a + 1 < Q.this.f41163b.size() || (!Q.this.f41164c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f41179b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f41179b = false;
            Q.this.h();
            if (this.f41178a >= Q.this.f41163b.size()) {
                a().remove();
                return;
            }
            Q q10 = Q.this;
            int i10 = this.f41178a;
            this.f41178a = i10 - 1;
            q10.t(i10);
        }

        /* synthetic */ f(Q q10, a aVar) {
            this();
        }
    }

    private Q(int i10) {
        this.f41162a = i10;
        this.f41163b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f41164c = map;
        this.f41167f = map;
    }
}
