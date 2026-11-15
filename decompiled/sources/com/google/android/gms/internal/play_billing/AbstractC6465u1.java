package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6465u1 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f37340b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f37341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile C6453r1 f37343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f37344f;

    /* synthetic */ AbstractC6465u1(int i10, AbstractC6461t1 abstractC6461t1) {
        this.f37339a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f37341c = map;
        this.f37344f = map;
    }

    private final int l(Comparable comparable) {
        int size = this.f37340b.size();
        int i10 = size - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((C6438n1) this.f37340b.get(i10)).c());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((C6438n1) this.f37340b.get(i12)).c());
            if (iCompareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i10) {
        o();
        Object value = ((C6438n1) this.f37340b.remove(i10)).getValue();
        if (!this.f37341c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.f37340b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C6438n1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f37341c.isEmpty() && !(this.f37341c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37341c = treeMap;
            this.f37344f = treeMap.descendingMap();
        }
        return (SortedMap) this.f37341c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f37342d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f37342d) {
            return;
        }
        this.f37341c = this.f37341c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f37341c);
        this.f37344f = this.f37344f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f37344f);
        this.f37342d = true;
    }

    public final int b() {
        return this.f37340b.size();
    }

    public final Iterable c() {
        return this.f37341c.isEmpty() ? AbstractC6434m1.a() : this.f37341c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f37340b.isEmpty()) {
            this.f37340b.clear();
        }
        if (this.f37341c.isEmpty()) {
            return;
        }
        this.f37341c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f37341c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f37343e == null) {
            this.f37343e = new C6453r1(this, null);
        }
        return this.f37343e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6465u1)) {
            return super.equals(obj);
        }
        AbstractC6465u1 abstractC6465u1 = (AbstractC6465u1) obj;
        int size = size();
        if (size != abstractC6465u1.size()) {
            return false;
        }
        int iB = b();
        if (iB != abstractC6465u1.b()) {
            return entrySet().equals(abstractC6465u1.entrySet());
        }
        for (int i10 = 0; i10 < iB; i10++) {
            if (!h(i10).equals(abstractC6465u1.h(i10))) {
                return false;
            }
        }
        if (iB != size) {
            return this.f37341c.equals(abstractC6465u1.f37341c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((C6438n1) this.f37340b.get(iL)).setValue(obj);
        }
        o();
        if (this.f37340b.isEmpty() && !(this.f37340b instanceof ArrayList)) {
            this.f37340b = new ArrayList(this.f37339a);
        }
        int i10 = -(iL + 1);
        if (i10 >= this.f37339a) {
            return n().put(comparable, obj);
        }
        int size = this.f37340b.size();
        int i11 = this.f37339a;
        if (size == i11) {
            C6438n1 c6438n1 = (C6438n1) this.f37340b.remove(i11 - 1);
            n().put(c6438n1.c(), c6438n1.getValue());
        }
        this.f37340b.add(i10, new C6438n1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((C6438n1) this.f37340b.get(iL)).getValue() : this.f37341c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        return (Map.Entry) this.f37340b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            iHashCode += ((C6438n1) this.f37340b.get(i10)).hashCode();
        }
        return this.f37341c.size() > 0 ? iHashCode + this.f37341c.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f37342d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f37341c.isEmpty()) {
            return null;
        }
        return this.f37341c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f37340b.size() + this.f37341c.size();
    }
}
