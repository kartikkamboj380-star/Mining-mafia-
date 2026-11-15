package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1852Hv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f19416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1956Jv f19417d;

    RunnableC1852Hv(AbstractC1956Jv abstractC1956Jv, String str, String str2, long j10) {
        this.f19414a = str;
        this.f19415b = str2;
        this.f19416c = j10;
        Objects.requireNonNull(abstractC1956Jv);
        this.f19417d = abstractC1956Jv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f19414a);
        map.put("cachedSrc", this.f19415b);
        map.put("totalDuration", Long.toString(this.f19416c));
        this.f19417d.v("onPrecacheEvent", map);
    }
}
