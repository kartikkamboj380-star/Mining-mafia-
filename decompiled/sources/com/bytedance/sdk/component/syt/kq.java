package com.bytedance.sdk.component.syt;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p131n0.d;

/* JADX INFO: loaded from: classes.dex */
class kq extends ThreadPoolExecutor implements AutoCloseable {
    private String kq;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.syt.kq$kq, reason: collision with other inner class name */
    public static class C0256kq {
        private RejectedExecutionHandler syt;
        private String kq = "io";
        private int oq = 1;
        private long bob = 30;
        private TimeUnit fou = TimeUnit.SECONDS;
        private int csi = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        private BlockingQueue<Runnable> rhi = null;
        private ThreadFactory rjo = null;
        private int dgq = 5;

        public C0256kq kq(String str) {
            this.kq = str;
            return this;
        }

        public C0256kq oq(int i10) {
            this.dgq = i10;
            return this;
        }

        public C0256kq kq(int i10) {
            this.oq = i10;
            return this;
        }

        public C0256kq kq(long j10) {
            this.bob = j10;
            return this;
        }

        public C0256kq kq(TimeUnit timeUnit) {
            this.fou = timeUnit;
            return this;
        }

        public C0256kq kq(BlockingQueue<Runnable> blockingQueue) {
            this.rhi = blockingQueue;
            return this;
        }

        public C0256kq kq(ThreadFactory threadFactory) {
            this.rjo = threadFactory;
            return this;
        }

        public C0256kq kq(RejectedExecutionHandler rejectedExecutionHandler) {
            this.syt = rejectedExecutionHandler;
            return this;
        }

        public kq kq() {
            if (this.rjo == null) {
                this.rjo = csi.kq().kq(this.dgq, this.kq);
            }
            if (this.syt == null) {
                this.syt = rhi.rhi();
            }
            if (this.rhi == null) {
                this.rhi = new LinkedBlockingQueue();
            }
            return new kq(this.kq, this.oq, this.csi, this.bob, this.fou, this.rhi, this.rjo, this.syt);
        }
    }

    public kq(String str, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.kq = str;
    }

    private void kq(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e10) {
            kq(runnable, e10);
        } catch (Throwable th) {
            kq(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!rhi.csi() || TextUtils.isEmpty(this.kq) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.kq;
        str.getClass();
        switch (str) {
            case "io":
                kq(queue, 2);
                break;
            case "log":
                kq(queue, 4);
                break;
            case "aidl":
                kq(queue, 2);
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        d.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof syt) {
            kq(new oq((syt) runnable, this));
        } else {
            kq(new oq(new syt("unknown") { // from class: com.bytedance.sdk.component.syt.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!rhi.csi() || TextUtils.isEmpty(this.kq) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.kq;
        str.getClass();
        switch (str) {
            case "io":
                kq(queue, rhi.kq + 2, getCorePoolSize() * 2);
                break;
            case "log":
                kq(queue, 8, 8);
                break;
            case "aidl":
                kq(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.kq) || "aidl".equals(this.kq)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return ("io".equals(this.kq) || "aidl".equals(this.kq)) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private void kq(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        kq(runnable, (Throwable) outOfMemoryError);
    }

    private void kq(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    private void kq(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void kq(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public String kq() {
        return this.kq;
    }
}
