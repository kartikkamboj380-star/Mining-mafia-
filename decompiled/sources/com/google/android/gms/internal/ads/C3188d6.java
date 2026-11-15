package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3188d6 implements InterfaceC5198t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W5 f27331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f27332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f27333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f27334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f27335e;

    public C3188d6(W5 w10, Map map, Map map2, Map map3) {
        this.f27331a = w10;
        this.f27334d = map2;
        this.f27335e = map3;
        this.f27333c = Collections.unmodifiableMap(map);
        this.f27332b = w10.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5198t5
    public final List a(long j10) {
        return this.f27331a.h(j10, this.f27333c, this.f27334d, this.f27335e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5198t5
    public final long b(int i10) {
        return this.f27332b[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5198t5
    public final int zza() {
        return this.f27332b.length;
    }
}
