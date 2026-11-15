package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC6787s {
    UNKNOWN("unknown"),
    NORMAL("normal"),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f41640h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41642a;

    static {
        for (EnumC6787s enumC6787s : values()) {
            f41640h.put(enumC6787s.f41642a, enumC6787s);
        }
    }

    EnumC6787s(String str) {
        this.f41642a = str;
    }

    static EnumC6787s d(String str) {
        Map map = f41640h;
        if (map.containsKey(str)) {
            return (EnumC6787s) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f41642a;
    }
}
