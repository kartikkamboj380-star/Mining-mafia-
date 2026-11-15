package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39945a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f39947c;

    o(Class cls) {
        this.f39946b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f39947c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f39945a) {
            try {
                Logger logger2 = this.f39947c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f39946b);
                this.f39947c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
