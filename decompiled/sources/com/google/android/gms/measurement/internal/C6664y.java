package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.tenjin.android.config.TenjinConsts;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6664y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C6664y f38541f = new C6664y((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f38544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumMap f38546e;

    C6664y(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        this.f38546e = enumMap;
        enumMap.put(p136n5.v.AD_USER_DATA, E3.h(bool));
        this.f38542a = i10;
        this.f38543b = l();
        this.f38544c = bool2;
        this.f38545d = str;
    }

    static C6664y a(p136n5.u uVar, int i10) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        enumMap.put(p136n5.v.AD_USER_DATA, uVar);
        return new C6664y(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C6664y g(String str) {
        if (str == null || str.length() <= 0) {
            return f38541f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        p136n5.v[] vVarArrC = D3.DMA.c();
        int length = vVarArrC.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(vVarArrC[i12], E3.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C6664y(enumMap, i10, (Boolean) null, (String) null);
    }

    public static C6664y h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C6664y((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        for (p136n5.v vVar : D3.DMA.c()) {
            enumMap.put(vVar, E3.g(bundle.getString(vVar.f46900a)));
        }
        return new C6664y(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        p136n5.u uVarG;
        if (bundle == null || (uVarG = E3.g(bundle.getString(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION))) == null) {
            return null;
        }
        int iOrdinal = uVarG.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38542a);
        for (p136n5.v vVar : D3.DMA.c()) {
            sb.append(":");
            sb.append(E3.m((p136n5.u) this.f38546e.get(vVar)));
        }
        return sb.toString();
    }

    public final int b() {
        return this.f38542a;
    }

    public final p136n5.u c() {
        p136n5.u uVar = (p136n5.u) this.f38546e.get(p136n5.v.AD_USER_DATA);
        return uVar == null ? p136n5.u.UNINITIALIZED : uVar;
    }

    public final boolean d() {
        Iterator it = this.f38546e.values().iterator();
        while (it.hasNext()) {
            if (((p136n5.u) it.next()) != p136n5.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f38543b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6664y)) {
            return false;
        }
        C6664y c6664y = (C6664y) obj;
        if (this.f38543b.equalsIgnoreCase(c6664y.f38543b) && Objects.equals(this.f38544c, c6664y.f38544c)) {
            return Objects.equals(this.f38545d, c6664y.f38545d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f38546e.entrySet()) {
            String strI = E3.i((p136n5.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((p136n5.v) entry.getKey()).f46900a, strI);
            }
        }
        Boolean bool = this.f38544c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f38545d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f38544c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f38545d;
        return this.f38543b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f38544c;
    }

    public final String k() {
        return this.f38545d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(E3.d(this.f38542a));
        for (p136n5.v vVar : D3.DMA.c()) {
            sb.append(",");
            sb.append(vVar.f46900a);
            sb.append("=");
            p136n5.u uVar = (p136n5.u) this.f38546e.get(vVar);
            if (uVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = uVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f38544c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f38545d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    private C6664y(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(p136n5.v.class);
        this.f38546e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f38542a = i10;
        this.f38543b = l();
        this.f38544c = bool;
        this.f38545d = str;
    }
}
