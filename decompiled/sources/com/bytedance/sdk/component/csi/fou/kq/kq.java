package com.bytedance.sdk.component.csi.fou.kq;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class kq implements ThreadFactory {
    private final ThreadGroup kq;
    private final AtomicInteger oq = new AtomicInteger(1);

    public kq(String str) {
        this.kq = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.kq, runnable, "tt_img_" + this.oq.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
