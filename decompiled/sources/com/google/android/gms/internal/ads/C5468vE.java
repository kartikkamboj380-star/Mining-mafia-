package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5468vE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34023a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f34024b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f34025c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f34026d = new ConcurrentHashMap();

    public final void a(String str) {
        synchronized (this.f34023a) {
            try {
                ConcurrentHashMap concurrentHashMap = this.f34024b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(String str) {
        Integer num = (Integer) this.f34024b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long c(String str) {
        Long l10 = (Long) this.f34026d.get(str);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public final void d(String str, long j10) {
        this.f34025c.put(str, Long.valueOf(j10));
    }

    public final void e(String str, String str2, long j10) {
        ConcurrentHashMap concurrentHashMap = this.f34025c;
        Long l10 = (Long) concurrentHashMap.get(str2);
        if (l10 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.f34026d.put(str, Long.valueOf(j10 - l10.longValue()));
    }
}
