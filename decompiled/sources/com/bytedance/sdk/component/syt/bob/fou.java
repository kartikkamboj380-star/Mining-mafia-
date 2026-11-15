package com.bytedance.sdk.component.syt.bob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class fou implements ThreadFactory {
    public static volatile boolean bob;
    private final AtomicInteger fou = new AtomicInteger(1);
    protected final ThreadGroup kq;
    protected final String oq;

    public fou(String str) {
        this.kq = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.oq = kq(str);
    }

    protected Thread kq(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (bob) {
            return null;
        }
        Thread threadKq = kq(this.kq, runnable, this.oq + "_" + this.fou.getAndIncrement());
        if (threadKq.isDaemon()) {
            threadKq.setDaemon(false);
        }
        return threadKq;
    }

    public static String kq(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
