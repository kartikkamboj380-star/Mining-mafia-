package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class V5 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f36518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f36519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y5 f36520c;

    V5(Y5 y9, Comparable comparable, Object obj) {
        Objects.requireNonNull(y9);
        this.f36520c = y9;
        this.f36518a = comparable;
        this.f36519b = obj;
    }

    private static final boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f36518a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f36518a.compareTo(((V5) obj).f36518a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return d(this.f36518a, entry.getKey()) && d(this.f36519b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f36518a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f36519b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f36518a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f36519b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f36520c.i();
        Object obj2 = this.f36519b;
        this.f36519b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f36518a);
        String strValueOf2 = String.valueOf(this.f36519b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
