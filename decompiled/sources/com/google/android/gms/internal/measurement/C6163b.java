package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6163b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Y5.l f36626d = Y5.l.q("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f36629c;

    public C6163b(String str, long j10, Map map) {
        this.f36627a = str;
        this.f36628b = j10;
        HashMap map2 = new HashMap();
        this.f36629c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f36626d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f36628b;
    }

    public final String b() {
        return this.f36627a;
    }

    public final void c(String str) {
        this.f36627a = str;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f36629c.remove(str);
        } else {
            Map map = this.f36629c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f36629c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6163b)) {
            return false;
        }
        C6163b c6163b = (C6163b) obj;
        if (this.f36628b == c6163b.f36628b && this.f36627a.equals(c6163b.f36627a)) {
            return this.f36629c.equals(c6163b.f36629c);
        }
        return false;
    }

    public final Map f() {
        return this.f36629c;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C6163b clone() {
        return new C6163b(this.f36627a, this.f36628b, new HashMap(this.f36629c));
    }

    public final int hashCode() {
        int iHashCode = this.f36627a.hashCode() * 31;
        long j10 = this.f36628b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f36629c.hashCode();
    }

    public final String toString() {
        String str = this.f36627a;
        String string = this.f36629c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f36628b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j10);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
