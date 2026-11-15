package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final N5 f36423c = new N5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36424d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f36426b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R5 f36425a = new C6357w5();

    private N5() {
    }

    public static N5 a() {
        return f36423c;
    }

    public final Q5 b(Class cls) {
        AbstractC6268m5.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f36426b;
        Q5 q5Zza = (Q5) concurrentMap.get(cls);
        if (q5Zza == null) {
            q5Zza = this.f36425a.zza(cls);
            AbstractC6268m5.a(cls, "messageType");
            Q5 q10 = (Q5) concurrentMap.putIfAbsent(cls, q5Zza);
            if (q10 != null) {
                return q10;
            }
        }
        return q5Zza;
    }
}
