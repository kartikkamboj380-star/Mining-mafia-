package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6346v3;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6510c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f37897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p136n5.G f37898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6346v3 f37899d;

    C6510c6(String str, Map map, p136n5.G g10, C6346v3 c6346v3) {
        this.f37896a = str;
        this.f37897b = map;
        this.f37898c = g10;
        this.f37899d = c6346v3;
    }

    public final String a() {
        return this.f37896a;
    }

    public final Map b() {
        Map map = this.f37897b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final p136n5.G c() {
        return this.f37898c;
    }

    public final C6346v3 d() {
        return this.f37899d;
    }
}
