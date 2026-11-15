package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class TM0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f23486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f23487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ XM0 f23488c;

    TM0(XM0 xm0, Comparable comparable, Object obj) {
        Objects.requireNonNull(xm0);
        this.f23488c = xm0;
        this.f23486a = comparable;
        this.f23487b = obj;
    }

    private static final boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f23486a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f23486a.compareTo(((TM0) obj).f23486a);
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
        return d(this.f23486a, entry.getKey()) && d(this.f23487b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f23486a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f23487b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f23486a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f23487b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f23488c.i();
        Object obj2 = this.f23487b;
        this.f23487b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23486a);
        String strValueOf2 = String.valueOf(this.f23487b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
