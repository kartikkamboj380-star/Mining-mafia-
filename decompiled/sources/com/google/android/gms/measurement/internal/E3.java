package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class E3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E3 f37501c = new E3(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f37502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37503b;

    public E3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        this.f37502a = enumMap;
        enumMap.put(p136n5.v.AD_STORAGE, h(null));
        enumMap.put(p136n5.v.ANALYTICS_STORAGE, h(null));
        this.f37503b = i10;
    }

    public static E3 a(p136n5.u uVar, p136n5.u uVar2, int i10) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        enumMap.put(p136n5.v.AD_STORAGE, uVar);
        enumMap.put(p136n5.v.ANALYTICS_STORAGE, uVar2);
        return new E3(enumMap, -10);
    }

    static String d(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static E3 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new E3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        for (p136n5.v vVar : D3.STORAGE.d()) {
            enumMap.put(vVar, g(bundle.getString(vVar.f46900a)));
        }
        return new E3(enumMap, i10);
    }

    public static E3 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        p136n5.v[] vVarArrC = D3.STORAGE.c();
        for (int i11 = 0; i11 < vVarArrC.length; i11++) {
            String str2 = str == null ? "" : str;
            p136n5.v vVar = vVarArrC[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(vVar, j(str2.charAt(i12)));
            } else {
                enumMap.put(vVar, p136n5.u.UNINITIALIZED);
            }
        }
        return new E3(enumMap, i10);
    }

    static p136n5.u g(String str) {
        if (str == null) {
            return p136n5.u.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return p136n5.u.GRANTED;
        }
        return str.equals("denied") ? p136n5.u.DENIED : p136n5.u.UNINITIALIZED;
    }

    static p136n5.u h(Boolean bool) {
        if (bool == null) {
            return p136n5.u.UNINITIALIZED;
        }
        return bool.booleanValue() ? p136n5.u.GRANTED : p136n5.u.DENIED;
    }

    static String i(p136n5.u uVar) {
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    static p136n5.u j(char c10) {
        if (c10 == '+') {
            return p136n5.u.POLICY;
        }
        if (c10 != '0') {
            return c10 != '1' ? p136n5.u.UNINITIALIZED : p136n5.u.GRANTED;
        }
        return p136n5.u.DENIED;
    }

    static char m(p136n5.u uVar) {
        if (uVar == null) {
            return '-';
        }
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.f37503b;
    }

    public final boolean c() {
        Iterator it = this.f37502a.values().iterator();
        while (it.hasNext()) {
            if (((p136n5.u) it.next()) != p136n5.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e10 = (E3) obj;
        for (p136n5.v vVar : D3.STORAGE.d()) {
            if (this.f37502a.get(vVar) != e10.f37502a.get(vVar)) {
                return false;
            }
        }
        return this.f37503b == e10.f37503b;
    }

    public final int hashCode() {
        Iterator it = this.f37502a.values().iterator();
        int iHashCode = this.f37503b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((p136n5.u) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String k() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (p136n5.v vVar : D3.STORAGE.c()) {
            p136n5.u uVar = (p136n5.u) this.f37502a.get(vVar);
            char c10 = '-';
            if (uVar != null && (iOrdinal = uVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = '1';
                } else if (iOrdinal == 2) {
                    c10 = '0';
                } else if (iOrdinal == 3) {
                    c10 = '1';
                }
            }
            sb.append(c10);
        }
        return sb.toString();
    }

    public final String l() {
        StringBuilder sb = new StringBuilder("G1");
        for (p136n5.v vVar : D3.STORAGE.c()) {
            sb.append(m((p136n5.u) this.f37502a.get(vVar)));
        }
        return sb.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f37502a.entrySet()) {
            String strI = i((p136n5.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((p136n5.v) entry.getKey()).f46900a, strI);
            }
        }
        return bundle;
    }

    public final boolean o(p136n5.v vVar) {
        return ((p136n5.u) this.f37502a.get(vVar)) != p136n5.u.DENIED;
    }

    public final p136n5.u p() {
        p136n5.u uVar = (p136n5.u) this.f37502a.get(p136n5.v.AD_STORAGE);
        return uVar == null ? p136n5.u.UNINITIALIZED : uVar;
    }

    public final p136n5.u q() {
        p136n5.u uVar = (p136n5.u) this.f37502a.get(p136n5.v.ANALYTICS_STORAGE);
        return uVar == null ? p136n5.u.UNINITIALIZED : uVar;
    }

    public final boolean r(E3 e10) {
        EnumMap enumMap = this.f37502a;
        for (p136n5.v vVar : (p136n5.v[]) enumMap.keySet().toArray(new p136n5.v[0])) {
            p136n5.u uVar = (p136n5.u) enumMap.get(vVar);
            p136n5.u uVar2 = (p136n5.u) e10.f37502a.get(vVar);
            p136n5.u uVar3 = p136n5.u.DENIED;
            if (uVar == uVar3 && uVar2 != uVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final E3 s(E3 e10) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        for (p136n5.v vVar : D3.STORAGE.d()) {
            p136n5.u uVar = (p136n5.u) this.f37502a.get(vVar);
            p136n5.u uVar2 = (p136n5.u) e10.f37502a.get(vVar);
            if (uVar == null) {
                uVar = uVar2;
            } else if (uVar2 != null) {
                p136n5.u uVar3 = p136n5.u.UNINITIALIZED;
                if (uVar == uVar3) {
                    uVar = uVar2;
                } else if (uVar2 != uVar3) {
                    p136n5.u uVar4 = p136n5.u.POLICY;
                    if (uVar == uVar4) {
                        uVar = uVar2;
                    } else if (uVar2 != uVar4) {
                        p136n5.u uVar5 = p136n5.u.DENIED;
                        uVar = (uVar == uVar5 || uVar2 == uVar5) ? uVar5 : p136n5.u.GRANTED;
                    }
                }
            }
            if (uVar != null) {
                enumMap.put(vVar, uVar);
            }
        }
        return new E3(enumMap, 100);
    }

    public final E3 t(E3 e10) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        for (p136n5.v vVar : D3.STORAGE.d()) {
            p136n5.u uVar = (p136n5.u) this.f37502a.get(vVar);
            if (uVar == p136n5.u.UNINITIALIZED) {
                uVar = (p136n5.u) e10.f37502a.get(vVar);
            }
            if (uVar != null) {
                enumMap.put(vVar, uVar);
            }
        }
        return new E3(enumMap, this.f37503b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(d(this.f37503b));
        for (p136n5.v vVar : D3.STORAGE.d()) {
            sb.append(",");
            sb.append(vVar.f46900a);
            sb.append("=");
            p136n5.u uVar = (p136n5.u) this.f37502a.get(vVar);
            if (uVar == null) {
                uVar = p136n5.u.UNINITIALIZED;
            }
            sb.append(uVar);
        }
        return sb.toString();
    }

    private E3(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(p136n5.v.class);
        this.f37502a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f37503b = i10;
    }
}
