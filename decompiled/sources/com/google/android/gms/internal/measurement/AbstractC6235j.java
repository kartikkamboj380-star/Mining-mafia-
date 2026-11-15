package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6235j implements InterfaceC6289p, InterfaceC6253l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f36718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map f36719b = new HashMap();

    public AbstractC6235j(String str) {
        this.f36718a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final boolean G0(String str) {
        return this.f36719b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final InterfaceC6289p Q(String str) {
        Map map = this.f36719b;
        return map.containsKey(str) ? (InterfaceC6289p) map.get(str) : InterfaceC6289p.f36808x;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return InterfaceC6253l.i(this.f36719b);
    }

    public abstract InterfaceC6289p c(C6157a2 c6157a2, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC6253l
    public final void d(String str, InterfaceC6289p interfaceC6289p) {
        if (interfaceC6289p == null) {
            this.f36719b.remove(str);
        } else {
            this.f36719b.put(str, interfaceC6289p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        return "toString".equals(str) ? new C6324t(this.f36718a) : InterfaceC6253l.a(this, new C6324t(str), c6157a2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6235j)) {
            return false;
        }
        AbstractC6235j abstractC6235j = (AbstractC6235j) obj;
        String str = this.f36718a;
        if (str != null) {
            return str.equals(abstractC6235j.f36718a);
        }
        return false;
    }

    public final String f() {
        return this.f36718a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public InterfaceC6289p g() {
        return this;
    }

    public final int hashCode() {
        String str = this.f36718a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        return this.f36718a;
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
