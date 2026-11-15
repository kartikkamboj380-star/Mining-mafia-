package com.horcrux.svg;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
enum g0 {
    Normal("normal"),
    Bold("bold"),
    w100(StatisticData.ERROR_CODE_NOT_FOUND),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f41549w = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41550a;

    static {
        for (g0 g0Var : values()) {
            f41549w.put(g0Var.f41550a, g0Var);
        }
    }

    g0(String str) {
        this.f41550a = str;
    }

    static g0 d(String str) {
        return (g0) f41549w.get(str);
    }

    static boolean e(String str) {
        return f41549w.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f41550a;
    }
}
