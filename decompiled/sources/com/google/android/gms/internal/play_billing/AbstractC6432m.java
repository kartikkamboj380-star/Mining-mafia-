package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6432m implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AbstractC6436n f37303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC6436n f37304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC6408g f37305c;

    AbstractC6432m() {
    }

    public static AbstractC6432m c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        AbstractC6400e.a("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        AbstractC6400e.a("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        AbstractC6400e.a("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return C6463u.h(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    abstract AbstractC6408g a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC6408g values() {
        AbstractC6408g abstractC6408g = this.f37305c;
        if (abstractC6408g != null) {
            return abstractC6408g;
        }
        AbstractC6408g abstractC6408gA = a();
        this.f37305c = abstractC6408gA;
        return abstractC6408gA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC6436n e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    abstract AbstractC6436n f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC6436n entrySet() {
        AbstractC6436n abstractC6436n = this.f37303a;
        if (abstractC6436n != null) {
            return abstractC6436n;
        }
        AbstractC6436n abstractC6436nE = e();
        this.f37303a = abstractC6436nE;
        return abstractC6436nE;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC6467v.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC6436n abstractC6436n = this.f37304b;
        if (abstractC6436n != null) {
            return abstractC6436n;
        }
        AbstractC6436n abstractC6436nF = f();
        this.f37304b = abstractC6436nF;
        return abstractC6436nF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z9 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z9 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
