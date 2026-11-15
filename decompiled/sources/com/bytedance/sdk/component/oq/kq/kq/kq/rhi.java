package com.bytedance.sdk.component.oq.kq.kq.kq;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends com.bytedance.sdk.component.oq.kq.fou {
    private ExecutorService kq;
    private List<com.bytedance.sdk.component.oq.kq.oq> oq = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.oq.kq.oq> bob = new CopyOnWriteArrayList();
    private AtomicInteger fou = new AtomicInteger(64);

    public rhi() {
        if (this.kq == null) {
            this.kq = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.oq.kq.kq.kq.rhi.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public List<com.bytedance.sdk.component.oq.kq.oq> bob() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public List<com.bytedance.sdk.component.oq.kq.oq> fou() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public void kq(int i10) {
        this.fou.set(i10);
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public ExecutorService oq() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public int kq() {
        return this.fou.get();
    }
}
