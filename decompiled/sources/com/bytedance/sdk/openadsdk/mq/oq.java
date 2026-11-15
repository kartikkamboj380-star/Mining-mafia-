package com.bytedance.sdk.openadsdk.mq;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private kq csi;
    private int fou;
    private syt oq;
    private ScheduledExecutorService kq = null;
    private long bob = 0;

    public interface kq {
    }

    public oq(syt sytVar, int i10) {
        this.oq = sytVar;
        this.fou = i10;
    }

    public void kq(long j10) {
        this.bob = j10;
    }

    public boolean oq() {
        ScheduledExecutorService scheduledExecutorService = this.kq;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void kq(int i10) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.kq = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.oq.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = oq.this.bob;
                if (System.currentTimeMillis() - oq.this.bob > oq.this.fou) {
                    oq.this.kq.shutdown();
                    if (oq.this.oq != null) {
                        oq.this.oq.oq(0, "Automatic detection of stuck");
                    }
                    if (oq.this.csi != null) {
                        kq unused2 = oq.this.csi;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void kq() {
        ScheduledExecutorService scheduledExecutorService = this.kq;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
