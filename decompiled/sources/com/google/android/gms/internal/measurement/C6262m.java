package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C6262m implements InterfaceC6289p, InterfaceC6253l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f36746a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final boolean G0(String str) {
        return this.f36746a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final InterfaceC6289p Q(String str) {
        Map map = this.f36746a;
        return map.containsKey(str) ? (InterfaceC6289p) map.get(str) : InterfaceC6289p.f36808x;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return InterfaceC6253l.i(this.f36746a);
    }

    public final List c() {
        return new ArrayList(this.f36746a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final void d(String str, InterfaceC6289p interfaceC6289p) {
        if (interfaceC6289p == null) {
            this.f36746a.remove(str);
        } else {
            this.f36746a.put(str, interfaceC6289p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        return "toString".equals(str) ? new C6324t(toString()) : InterfaceC6253l.a(this, new C6324t(str), c6157a2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6262m) {
            return this.f36746a.equals(((C6262m) obj).f36746a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        C6262m c6262m = new C6262m();
        for (Map.Entry entry : this.f36746a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC6253l) {
                c6262m.f36746a.put((String) entry.getKey(), (InterfaceC6289p) entry.getValue());
            } else {
                c6262m.f36746a.put((String) entry.getKey(), ((InterfaceC6289p) entry.getValue()).g());
            }
        }
        return c6262m;
    }

    public final int hashCode() {
        return this.f36746a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        Map map = this.f36746a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        return Boolean.TRUE;
    }
}
