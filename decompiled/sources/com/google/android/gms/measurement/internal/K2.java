package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class K2 implements com.google.android.gms.internal.measurement.T5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f37591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ P2 f37592b;

    K2(P2 p10, String str) {
        this.f37591a = str;
        Objects.requireNonNull(p10);
        this.f37592b = p10;
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final String k(String str) {
        Map map = (Map) this.f37592b.p().get(this.f37591a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
