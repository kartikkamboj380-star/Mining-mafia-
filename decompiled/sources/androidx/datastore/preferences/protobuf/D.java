package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class D extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f9396b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9397a;

    static {
        D d10 = new D();
        f9396b = d10;
        d10.l();
    }

    private D() {
        this.f9397a = true;
    }

    static int b(Map map) {
        int iC = 0;
        for (Map.Entry entry : map.entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    private static int c(Object obj) {
        return obj instanceof byte[] ? AbstractC1124u.d((byte[]) obj) : obj.hashCode();
    }

    private static void e(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC1124u.a(obj);
            AbstractC1124u.a(map.get(obj));
        }
    }

    public static D f() {
        return f9396b;
    }

    private void g() {
        if (!k()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean i(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean k() {
        return this.f9397a;
    }

    public void l() {
        this.f9397a = false;
    }

    public void m(D d10) {
        g();
        if (d10.isEmpty()) {
            return;
        }
        putAll(d10);
    }

    public D n() {
        return isEmpty() ? new D() : new D(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        g();
        AbstractC1124u.a(obj);
        AbstractC1124u.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        g();
        e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    private D(Map map) {
        super(map);
        this.f9397a = true;
    }
}
