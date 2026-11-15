package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f13622a;

    public static c a() {
        if (f13622a == null) {
            synchronized (c.class) {
                try {
                    if (f13622a == null) {
                        f13622a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13622a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
