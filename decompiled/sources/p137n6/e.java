package p137n6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p087i6.g;
import p117l6.AbstractC7048i;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f46926a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46928c;

    public e(int i10, int i11) {
        this.f46927b = i10;
        this.f46928c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f46928c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f46926a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f46926a.size() >= this.f46927b && !this.f46926a.containsKey(strB)) {
            g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f46927b);
            return false;
        }
        String strC = c(str2, this.f46928c);
        if (AbstractC7048i.z((String) this.f46926a.get(strB), strC)) {
            return false;
        }
        Map map = this.f46926a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f46926a.size() < this.f46927b || this.f46926a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f46926a.put(strB, str == null ? "" : c(str, this.f46928c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                g.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f46927b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
