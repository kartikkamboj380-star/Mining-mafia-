package com.horcrux.svg;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC6789u {
    OVER("over"),
    IN(ScarConstants.IN_SIGNAL_KEY),
    OUT("out"),
    ATOP("atop"),
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f41656h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41658a;

    static {
        for (EnumC6789u enumC6789u : values()) {
            f41656h.put(enumC6789u.f41658a, enumC6789u);
        }
    }

    EnumC6789u(String str) {
        this.f41658a = str;
    }

    static EnumC6789u d(String str) {
        Map map = f41656h;
        if (map.containsKey(str)) {
            return (EnumC6789u) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f41658a;
    }
}
