package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile p f13219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f13220b;

    public static p a() {
        if (f13219a == null) {
            b();
        }
        return f13219a;
    }

    private static HandlerThread b() {
        if (f13219a == null) {
            synchronized (m.class) {
                try {
                    if (f13219a == null) {
                        p pVar = new p("default_npth_thread");
                        f13219a = pVar;
                        pVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13219a.c();
    }
}
