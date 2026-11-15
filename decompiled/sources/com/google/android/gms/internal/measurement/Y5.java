package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class Y5 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f36551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f36553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile X5 f36555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f36556f;

    /* synthetic */ Y5(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f36553c = map;
        this.f36556f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object h(int i10) {
        i();
        Object value = ((V5) this.f36551a[i10]).getValue();
        Object[] objArr = this.f36551a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f36552b - i10) - 1);
        this.f36552b--;
        if (!this.f36553c.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f36551a;
            int i11 = this.f36552b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new V5(this, (Comparable) entry.getKey(), entry.getValue());
            this.f36552b++;
            it.remove();
        }
        return value;
    }

    private final int n(Comparable comparable) {
        int i10 = this.f36552b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((V5) this.f36551a[i11]).c());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((V5) this.f36551a[i13]).c());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void i() {
        if (this.f36554d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap p() {
        i();
        if (this.f36553c.isEmpty() && !(this.f36553c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f36553c = treeMap;
            this.f36556f = treeMap.descendingMap();
        }
        return (SortedMap) this.f36553c;
    }

    public void a() {
        if (this.f36554d) {
            return;
        }
        this.f36553c = this.f36553c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f36553c);
        this.f36556f = this.f36556f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f36556f);
        this.f36554d = true;
    }

    public final boolean b() {
        return this.f36554d;
    }

    public final int c() {
        return this.f36552b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.f36552b != 0) {
            this.f36551a = null;
            this.f36552b = 0;
        }
        if (this.f36553c.isEmpty()) {
            return;
        }
        this.f36553c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f36553c.containsKey(comparable);
    }

    public final Map.Entry e(int i10) {
        if (i10 < this.f36552b) {
            return (V5) this.f36551a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f36555e == null) {
            this.f36555e = new X5(this, null);
        }
        return this.f36555e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y5)) {
            return super.equals(obj);
        }
        Y5 y9 = (Y5) obj;
        int size = size();
        if (size != y9.size()) {
            return false;
        }
        int i10 = this.f36552b;
        if (i10 != y9.f36552b) {
            return entrySet().equals(y9.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!e(i11).equals(y9.e(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f36553c.equals(y9.f36553c);
        }
        return true;
    }

    public final Iterable f() {
        return this.f36553c.isEmpty() ? Collections.EMPTY_SET : this.f36553c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((V5) this.f36551a[iN]).setValue(obj);
        }
        i();
        if (this.f36551a == null) {
            this.f36551a = new Object[16];
        }
        int i10 = -(iN + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f36552b == 16) {
            V5 v10 = (V5) this.f36551a[15];
            this.f36552b = 15;
            p().put(v10.c(), v10.getValue());
        }
        Object[] objArr = this.f36551a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f36551a[i10] = new V5(this, comparable, obj);
        this.f36552b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((V5) this.f36551a[iN]).getValue() : this.f36553c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f36552b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f36551a[i11].hashCode();
        }
        return this.f36553c.size() > 0 ? iHashCode + this.f36553c.hashCode() : iHashCode;
    }

    final /* synthetic */ Object[] j() {
        return this.f36551a;
    }

    final /* synthetic */ int k() {
        return this.f36552b;
    }

    final /* synthetic */ Map l() {
        return this.f36553c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return h(iN);
        }
        if (this.f36553c.isEmpty()) {
            return null;
        }
        return this.f36553c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f36552b + this.f36553c.size();
    }
}
