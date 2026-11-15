package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1695Eu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f18596a;

    final Map a() {
        Map map = this.f18596a;
        if (map != null) {
            return map;
        }
        C3414eu0 c3414eu0 = new C3414eu0();
        this.f18596a = c3414eu0;
        return c3414eu0;
    }
}
