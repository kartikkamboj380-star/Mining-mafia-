package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
final class O2 implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21439a;

    private O2(String str) {
        this.f21439a = str;
    }

    public static O2 a(P10 p10) {
        return new O2(p10.k(p10.C(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final int zza() {
        return 1852994675;
    }
}
