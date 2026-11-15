package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class XM0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f25205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f25207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile WM0 f25209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f25210f;

    /* synthetic */ XM0(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f25207c = map;
        this.f25210f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object h(int i10) {
        i();
        Object value = ((TM0) this.f25205a[i10]).getValue();
        Object[] objArr = this.f25205a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f25206b - i10) - 1);
        this.f25206b--;
        if (!this.f25207c.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f25205a;
            int i11 = this.f25206b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new TM0(this, (Comparable) entry.getKey(), entry.getValue());
            this.f25206b++;
            it.remove();
        }
        return value;
    }

    private final int n(Comparable comparable) {
        int i10 = this.f25206b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((TM0) this.f25205a[i11]).c());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((TM0) this.f25205a[i13]).c());
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
        if (this.f25208d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap p() {
        i();
        if (this.f25207c.isEmpty() && !(this.f25207c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25207c = treeMap;
            this.f25210f = treeMap.descendingMap();
        }
        return (SortedMap) this.f25207c;
    }

    public void a() {
        if (this.f25208d) {
            return;
        }
        this.f25207c = this.f25207c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f25207c);
        this.f25210f = this.f25210f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f25210f);
        this.f25208d = true;
    }

    public final boolean b() {
        return this.f25208d;
    }

    public final int c() {
        return this.f25206b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.f25206b != 0) {
            this.f25205a = null;
            this.f25206b = 0;
        }
        if (this.f25207c.isEmpty()) {
            return;
        }
        this.f25207c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f25207c.containsKey(comparable);
    }

    public final Map.Entry e(int i10) {
        if (i10 < this.f25206b) {
            return (TM0) this.f25205a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f25209e == null) {
            this.f25209e = new WM0(this, null);
        }
        return this.f25209e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XM0)) {
            return super.equals(obj);
        }
        XM0 xm0 = (XM0) obj;
        int size = size();
        if (size != xm0.size()) {
            return false;
        }
        int i10 = this.f25206b;
        if (i10 != xm0.f25206b) {
            return entrySet().equals(xm0.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!e(i11).equals(xm0.e(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f25207c.equals(xm0.f25207c);
        }
        return true;
    }

    public final Iterable f() {
        return this.f25207c.isEmpty() ? Collections.EMPTY_SET : this.f25207c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((TM0) this.f25205a[iN]).setValue(obj);
        }
        i();
        if (this.f25205a == null) {
            this.f25205a = new Object[16];
        }
        int i10 = -(iN + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f25206b == 16) {
            TM0 tm0 = (TM0) this.f25205a[15];
            this.f25206b = 15;
            p().put(tm0.c(), tm0.getValue());
        }
        Object[] objArr = this.f25205a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f25205a[i10] = new TM0(this, comparable, obj);
        this.f25206b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((TM0) this.f25205a[iN]).getValue() : this.f25207c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f25206b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f25205a[i11].hashCode();
        }
        return this.f25207c.size() > 0 ? iHashCode + this.f25207c.hashCode() : iHashCode;
    }

    final /* synthetic */ Object[] j() {
        return this.f25205a;
    }

    final /* synthetic */ int k() {
        return this.f25206b;
    }

    final /* synthetic */ Map l() {
        return this.f25207c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return h(iN);
        }
        if (this.f25207c.isEmpty()) {
            return null;
        }
        return this.f25207c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25206b + this.f25207c.size();
    }
}
