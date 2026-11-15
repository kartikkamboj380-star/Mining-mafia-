package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC6788t {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f41647f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41649a;

    static {
        for (EnumC6788t enumC6788t : values()) {
            f41647f.put(enumC6788t.f41649a, enumC6788t);
        }
    }

    EnumC6788t(String str) {
        this.f41649a = str;
    }

    static EnumC6788t d(String str) {
        Map map = f41647f;
        if (map.containsKey(str)) {
            return (EnumC6788t) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f41649a;
    }
}
