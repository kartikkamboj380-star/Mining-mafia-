package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5405uj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4776pj0 f33888a;

    public final /* synthetic */ C5027rj0 a() {
        UL0 ul0W = this.f33888a.w();
        Intrinsics.checkNotNullExpressionValue(ul0W, "build(...)");
        return (C5027rj0) ul0W;
    }

    public final /* synthetic */ C4858qN0 b() {
        Map mapB = this.f33888a.B();
        Intrinsics.checkNotNullExpressionValue(mapB, "getQueryIdToAdQualityDataMapMap(...)");
        return new C4858qN0(mapB);
    }

    public final void c(C4858qN0 c4858qN0, String key, C4524nj0 value) {
        Intrinsics.checkNotNullParameter(c4858qN0, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f33888a.C(key, value);
    }

    public final /* synthetic */ void d(C4858qN0 c4858qN0, String key) {
        Intrinsics.checkNotNullParameter(c4858qN0, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f33888a.A(key);
    }
}
