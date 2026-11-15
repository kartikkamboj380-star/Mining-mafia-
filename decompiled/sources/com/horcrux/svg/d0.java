package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
enum d0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");


    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Map f41503I = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41519a;

    static {
        for (d0 d0Var : values()) {
            f41503I.put(d0Var.f41519a, d0Var);
        }
    }

    d0(String str) {
        this.f41519a = str;
    }

    static d0 d(String str) {
        Map map = f41503I;
        if (map.containsKey(str)) {
            return (d0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f41519a;
    }
}
