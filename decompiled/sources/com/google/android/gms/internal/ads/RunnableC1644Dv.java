package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1644Dv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC1956Jv f18311e;

    RunnableC1644Dv(AbstractC1956Jv abstractC1956Jv, String str, String str2, int i10, int i11, boolean z9) {
        this.f18307a = str;
        this.f18308b = str2;
        this.f18309c = i10;
        this.f18310d = i11;
        Objects.requireNonNull(abstractC1956Jv);
        this.f18311e = abstractC1956Jv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f18307a);
        map.put("cachedSrc", this.f18308b);
        map.put("bytesLoaded", Integer.toString(this.f18309c));
        map.put("totalBytes", Integer.toString(this.f18310d));
        map.put("cacheReady", "0");
        this.f18311e.v("onPrecacheEvent", map);
    }
}
