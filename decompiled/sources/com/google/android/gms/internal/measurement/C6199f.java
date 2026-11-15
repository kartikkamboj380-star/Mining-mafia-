package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6199f implements Iterable, InterfaceC6289p, InterfaceC6253l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SortedMap f36675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f36676b;

    public C6199f() {
        this.f36675a = new TreeMap();
        this.f36676b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final boolean G0(String str) {
        return "length".equals(str) || this.f36676b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final InterfaceC6289p Q(String str) {
        InterfaceC6289p interfaceC6289p;
        if ("length".equals(str)) {
            return new C6226i(Double.valueOf(l()));
        }
        return (!G0(str) || (interfaceC6289p = (InterfaceC6289p) this.f36676b.get(str)) == null) ? InterfaceC6289p.f36808x : interfaceC6289p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return new C6181d(this, this.f36675a.keySet().iterator(), this.f36676b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final void d(String str, InterfaceC6289p interfaceC6289p) {
        if (interfaceC6289p == null) {
            this.f36676b.remove(str);
        } else {
            this.f36676b.put(str, interfaceC6289p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? C.a(str, this, c6157a2, list) : InterfaceC6253l.a(this, new C6324t(str), c6157a2, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6199f)) {
            return false;
        }
        C6199f c6199f = (C6199f) obj;
        if (l() != c6199f.l()) {
            return false;
        }
        SortedMap sortedMap = this.f36675a;
        if (sortedMap.isEmpty()) {
            return c6199f.f36675a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!o(iIntValue).equals(c6199f.o(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        C6199f c6199f = new C6199f();
        for (Map.Entry entry : this.f36675a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC6253l) {
                c6199f.f36675a.put((Integer) entry.getKey(), (InterfaceC6289p) entry.getValue());
            } else {
                c6199f.f36675a.put((Integer) entry.getKey(), ((InterfaceC6289p) entry.getValue()).g());
            }
        }
        return c6199f;
    }

    public final int hashCode() {
        return this.f36675a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6190e(this);
    }

    public final List j() {
        ArrayList arrayList = new ArrayList(l());
        for (int i10 = 0; i10 < l(); i10++) {
            arrayList.add(o(i10));
        }
        return arrayList;
    }

    public final Iterator k() {
        return this.f36675a.keySet().iterator();
    }

    public final int l() {
        SortedMap sortedMap = this.f36675a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int m() {
        return this.f36675a.size();
    }

    public final InterfaceC6289p o(int i10) {
        InterfaceC6289p interfaceC6289p;
        if (i10 < l()) {
            return (!q(i10) || (interfaceC6289p = (InterfaceC6289p) this.f36675a.get(Integer.valueOf(i10))) == null) ? InterfaceC6289p.f36808x : interfaceC6289p;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void p(int i10, InterfaceC6289p interfaceC6289p) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (interfaceC6289p == null) {
            this.f36675a.remove(Integer.valueOf(i10));
        } else {
            this.f36675a.put(Integer.valueOf(i10), interfaceC6289p);
        }
    }

    public final boolean q(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f36675a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i10);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void r() {
        this.f36675a.clear();
    }

    public final void s(int i10, InterfaceC6289p interfaceC6289p) {
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
            sb.append("Invalid value index: ");
            sb.append(i10);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i10 >= l()) {
            p(i10, interfaceC6289p);
            return;
        }
        SortedMap sortedMap = this.f36675a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC6289p interfaceC6289p2 = (InterfaceC6289p) sortedMap.get(numValueOf);
            if (interfaceC6289p2 != null) {
                p(iIntValue + 1, interfaceC6289p2);
                sortedMap.remove(numValueOf);
            }
        }
        p(i10, interfaceC6289p);
    }

    public final void t(int i10) {
        SortedMap sortedMap = this.f36675a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(numValueOf, InterfaceC6289p.f36808x);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC6289p interfaceC6289p = (InterfaceC6289p) sortedMap.get(numValueOf2);
            if (interfaceC6289p != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC6289p);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final String toString() {
        return u(",");
    }

    public final String u(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f36675a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= l()) {
                    break;
                }
                InterfaceC6289p interfaceC6289pO = o(i10);
                sb.append(str2);
                if (!(interfaceC6289pO instanceof C6333u) && !(interfaceC6289pO instanceof C6271n)) {
                    sb.append(interfaceC6289pO.zzc());
                }
                i10++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        return u(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        SortedMap sortedMap = this.f36675a;
        if (sortedMap.size() == 1) {
            return o(0).zzd();
        }
        return sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    public C6199f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                p(i10, (InterfaceC6289p) list.get(i10));
            }
        }
    }
}
