package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1800Gv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f19163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1956Jv f19164d;

    RunnableC1800Gv(AbstractC1956Jv abstractC1956Jv, String str, String str2, int i10) {
        this.f19161a = str;
        this.f19162b = str2;
        this.f19163c = i10;
        Objects.requireNonNull(abstractC1956Jv);
        this.f19164d = abstractC1956Jv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f19161a);
        map.put("cachedSrc", this.f19162b);
        map.put("totalBytes", Integer.toString(this.f19163c));
        this.f19164d.v("onPrecacheEvent", map);
    }
}
