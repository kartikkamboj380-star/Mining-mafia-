package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class IK0 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IK0 f19519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IK0 f19520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    IK0 f19521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    IK0 f19522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IK0 f19523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Object f19524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f19525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f19526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f19527i;

    IK0(boolean z9) {
        this.f19524f = null;
        this.f19525g = z9;
        this.f19523e = this;
        this.f19522d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f19524f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f19526h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19524f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19526h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f19524f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f19526h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f19525g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f19526h;
        this.f19526h = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19524f);
        String strValueOf2 = String.valueOf(this.f19526h);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    IK0(boolean z9, IK0 ik0, Object obj, IK0 ik1, IK0 ik2) {
        this.f19519a = ik0;
        this.f19524f = obj;
        this.f19525g = z9;
        this.f19527i = 1;
        this.f19522d = ik1;
        this.f19523e = ik2;
        ik2.f19522d = this;
        ik1.f19523e = this;
    }
}
