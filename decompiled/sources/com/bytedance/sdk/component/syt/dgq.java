package com.bytedance.sdk.component.syt;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class dgq implements ThreadFactory {
    public static volatile boolean fou;
    protected int bob;
    private final AtomicInteger csi = new AtomicInteger(1);
    protected final ThreadGroup kq;
    protected final String oq;

    public dgq(int i10, String str) {
        this.bob = i10;
        this.kq = new ThreadGroup("csj_g_".concat(String.valueOf(str)));
        this.oq = "csj_".concat(String.valueOf(str));
    }

    protected Thread kq(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (fou) {
            return null;
        }
        Thread threadKq = kq(this.kq, runnable, this.oq + this.csi.getAndIncrement());
        if (threadKq.isDaemon()) {
            threadKq.setDaemon(false);
        }
        int i10 = this.bob;
        if (i10 > 10 || i10 <= 0) {
            this.bob = 5;
        }
        threadKq.setPriority(this.bob);
        return threadKq;
    }
}
