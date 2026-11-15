package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4981rM0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4981rM0 f32882b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32883a;

    static {
        C4981rM0 c4981rM0 = new C4981rM0();
        f32882b = c4981rM0;
        c4981rM0.f32883a = false;
    }

    private C4981rM0() {
        this.f32883a = true;
    }

    public static C4981rM0 b() {
        return f32882b;
    }

    private static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof WL0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC3346eM0.f27766b;
        int length = bArr.length;
        int iC = AbstractC3346eM0.c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    private final void i() {
        if (!this.f32883a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(C4981rM0 c4981rM0) {
        i();
        if (c4981rM0.isEmpty()) {
            return;
        }
        putAll(c4981rM0);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final C4981rM0 e() {
        return isEmpty() ? new C4981rM0() : new C4981rM0(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        this.f32883a = false;
    }

    public final boolean g() {
        return this.f32883a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iH = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        byte[] bArr = AbstractC3346eM0.f27766b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC3346eM0.f27766b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private C4981rM0(Map map) {
        super(map);
        this.f32883a = true;
    }
}
