package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ex0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1701Ex0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5173st0 f18611a = new C5173st0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f18613c;

    C1701Ex0(Class cls) {
        this.f18612b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f18613c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f18611a) {
            try {
                Logger logger2 = this.f18613c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f18612b);
                this.f18613c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
