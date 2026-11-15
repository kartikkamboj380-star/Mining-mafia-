package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6438n1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f37312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f37313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6465u1 f37314c;

    C6438n1(AbstractC6465u1 abstractC6465u1, Comparable comparable, Object obj) {
        this.f37314c = abstractC6465u1;
        this.f37312a = comparable;
        this.f37313b = obj;
    }

    private static final boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f37312a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f37312a.compareTo(((C6438n1) obj).f37312a);
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
        return d(this.f37312a, entry.getKey()) && d(this.f37313b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f37312a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37313b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f37312a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f37313b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f37314c.o();
        Object obj2 = this.f37313b;
        this.f37313b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f37312a) + "=" + String.valueOf(this.f37313b);
    }
}
