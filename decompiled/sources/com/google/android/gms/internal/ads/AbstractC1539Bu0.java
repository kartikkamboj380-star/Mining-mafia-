package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1539Bu0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AbstractC1903Iu0 f17735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC1903Iu0 f17736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC5427uu0 f17737c;

    AbstractC1539Bu0() {
    }

    public static AbstractC1539Bu0 a() {
        return C5933yv0.f35483g;
    }

    public static AbstractC1539Bu0 b(Object obj, Object obj2) {
        AbstractC2472Tt0.a("dialog_not_shown_reason", obj2);
        return C5933yv0.l(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static AbstractC1539Bu0 c(Map map) {
        if ((map instanceof AbstractC1539Bu0) && !(map instanceof SortedMap)) {
            AbstractC1539Bu0 abstractC1539Bu0 = (AbstractC1539Bu0) map;
            abstractC1539Bu0.k();
            return abstractC1539Bu0;
        }
        Set setEntrySet = map.entrySet();
        C1487Au0 c1487Au0 = new C1487Au0(setEntrySet != null ? setEntrySet.size() : 4);
        c1487Au0.b(setEntrySet);
        return c1487Au0.c();
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

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC1903Iu0 entrySet() {
        AbstractC1903Iu0 abstractC1903Iu0 = this.f17735a;
        if (abstractC1903Iu0 != null) {
            return abstractC1903Iu0;
        }
        AbstractC1903Iu0 abstractC1903Iu0F = f();
        this.f17735a = abstractC1903Iu0F;
        return abstractC1903Iu0F;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC3542fv0.b(this, obj);
    }

    abstract AbstractC1903Iu0 f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC1903Iu0 keySet() {
        AbstractC1903Iu0 abstractC1903Iu0 = this.f17736b;
        if (abstractC1903Iu0 != null) {
            return abstractC1903Iu0;
        }
        AbstractC1903Iu0 abstractC1903Iu0H = h();
        this.f17736b = abstractC1903Iu0H;
        return abstractC1903Iu0H;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    abstract AbstractC1903Iu0 h();

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1905Iv0.c(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC5427uu0 values() {
        AbstractC5427uu0 abstractC5427uu0 = this.f17737c;
        if (abstractC5427uu0 != null) {
            return abstractC5427uu0;
        }
        AbstractC5427uu0 abstractC5427uu0J = j();
        this.f17737c = abstractC5427uu0J;
        return abstractC5427uu0J;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract AbstractC5427uu0 j();

    abstract boolean k();

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
        AbstractC2472Tt0.b(size, "size");
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
