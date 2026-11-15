package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6298q implements InterfaceC6289p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f36838b;

    public C6298q(String str, List list) {
        this.f36837a = str;
        ArrayList arrayList = new ArrayList();
        this.f36838b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f36837a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return null;
    }

    public final ArrayList c() {
        return this.f36838b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6298q)) {
            return false;
        }
        C6298q c6298q = (C6298q) obj;
        String str = this.f36837a;
        if (str == null ? c6298q.f36837a == null : str.equals(c6298q.f36837a)) {
            return this.f36838b.equals(c6298q.f36838b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        return this;
    }

    public final int hashCode() {
        String str = this.f36837a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f36838b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
}
