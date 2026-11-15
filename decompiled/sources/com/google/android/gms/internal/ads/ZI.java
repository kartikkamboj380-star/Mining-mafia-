package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f26147a;

    public static synchronized Executor a() {
        try {
            if (f26147a == null) {
                f26147a = AbstractC4634ob0.B("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f26147a;
    }
}
