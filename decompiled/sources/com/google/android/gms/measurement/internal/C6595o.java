package com.google.android.gms.measurement.internal;

import com.unity3d.services.UnityAdsConstants;
import java.util.EnumMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6595o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f38232a;

    C6595o() {
        this.f38232a = new EnumMap(p136n5.v.class);
    }

    public static C6595o d(String str) {
        EnumMap enumMap = new EnumMap(p136n5.v.class);
        if (str.length() >= p136n5.v.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                p136n5.v[] vVarArrValues = p136n5.v.values();
                int length = vVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(vVarArrValues[i10], EnumC6588n.c(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C6595o(enumMap);
            }
        }
        return new C6595o();
    }

    public final EnumC6588n a(p136n5.v vVar) {
        EnumC6588n enumC6588n = (EnumC6588n) this.f38232a.get(vVar);
        return enumC6588n == null ? EnumC6588n.UNSET : enumC6588n;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void b(p136n5.v vVar, int i10) {
        EnumC6588n enumC6588n = EnumC6588n.UNSET;
        if (i10 == -30) {
            enumC6588n = EnumC6588n.TCF;
        } else if (i10 == -20) {
            enumC6588n = EnumC6588n.API;
        } else if (i10 == -10) {
            enumC6588n = EnumC6588n.MANIFEST;
        } else if (i10 == 0) {
            enumC6588n = EnumC6588n.API;
        } else if (i10 == 30) {
            enumC6588n = EnumC6588n.INITIALIZATION;
        }
        this.f38232a.put(vVar, enumC6588n);
    }

    public final void c(p136n5.v vVar, EnumC6588n enumC6588n) {
        this.f38232a.put(vVar, enumC6588n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        for (p136n5.v vVar : p136n5.v.values()) {
            EnumC6588n enumC6588n = (EnumC6588n) this.f38232a.get(vVar);
            if (enumC6588n == null) {
                enumC6588n = EnumC6588n.UNSET;
            }
            sb.append(enumC6588n.d());
        }
        return sb.toString();
    }

    private C6595o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(p136n5.v.class);
        this.f38232a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
