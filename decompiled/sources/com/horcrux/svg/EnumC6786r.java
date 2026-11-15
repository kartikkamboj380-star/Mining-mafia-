package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC6786r {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f41631f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41633a;

    static {
        for (EnumC6786r enumC6786r : values()) {
            f41631f.put(enumC6786r.f41633a, enumC6786r);
        }
    }

    EnumC6786r(String str) {
        this.f41633a = str;
    }

    static EnumC6786r d(String str) {
        Map map = f41631f;
        if (map.containsKey(str)) {
            return (EnumC6786r) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f41633a;
    }
}
