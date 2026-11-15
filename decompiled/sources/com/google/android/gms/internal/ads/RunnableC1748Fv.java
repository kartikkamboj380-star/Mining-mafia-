package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1748Fv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f18870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f18871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f18872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f18873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f18874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ AbstractC1956Jv f18875j;

    RunnableC1748Fv(AbstractC1956Jv abstractC1956Jv, String str, String str2, int i10, int i11, long j10, long j11, boolean z9, int i12, int i13) {
        this.f18866a = str;
        this.f18867b = str2;
        this.f18868c = i10;
        this.f18869d = i11;
        this.f18870e = j10;
        this.f18871f = j11;
        this.f18872g = z9;
        this.f18873h = i12;
        this.f18874i = i13;
        Objects.requireNonNull(abstractC1956Jv);
        this.f18875j = abstractC1956Jv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f18866a);
        map.put("cachedSrc", this.f18867b);
        map.put("bytesLoaded", Integer.toString(this.f18868c));
        map.put("totalBytes", Integer.toString(this.f18869d));
        map.put("bufferedDuration", Long.toString(this.f18870e));
        map.put("totalDuration", Long.toString(this.f18871f));
        map.put("cacheReady", true != this.f18872g ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        map.put("playerCount", Integer.toString(this.f18873h));
        map.put("playerPreparedCount", Integer.toString(this.f18874i));
        this.f18875j.v("onPrecacheEvent", map);
    }
}
