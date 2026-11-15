package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class HM0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HM0 f19277c = new HM0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f19279b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QM0 f19278a = new C4604oM0();

    private HM0() {
    }

    static HM0 a() {
        return f19277c;
    }

    final PM0 b(Class cls) {
        AbstractC3346eM0.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f19279b;
        PM0 pm0Zza = (PM0) concurrentMap.get(cls);
        if (pm0Zza == null) {
            pm0Zza = this.f19278a.zza(cls);
            PM0 pm0 = (PM0) concurrentMap.putIfAbsent(cls, pm0Zza);
            if (pm0 != null) {
                return pm0;
            }
        }
        return pm0Zza;
    }
}
