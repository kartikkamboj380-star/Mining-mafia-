package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC6790v {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f41661d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41663a;

    static {
        for (EnumC6790v enumC6790v : values()) {
            f41661d.put(enumC6790v.f41663a, enumC6790v);
        }
    }

    EnumC6790v(String str) {
        this.f41663a = str;
    }

    static EnumC6790v d(String str) {
        Map map = f41661d;
        if (map.containsKey(str)) {
            return (EnumC6790v) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f41663a;
    }
}
