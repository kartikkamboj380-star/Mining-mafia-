package com.bytedance.sdk.component.syt.bob;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p131n0.d;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends ThreadPoolExecutor implements AutoCloseable {
    private int bob;
    private boolean csi;
    private int fou;
    private final String kq;
    private int oq;

    public static class kq {
        private String kq = "cache";
        private int oq = 4;
        private int bob = 100;
        private int fou = 0;
        private long csi = 30000;
        private boolean rhi = false;
        private TimeUnit rjo = TimeUnit.MILLISECONDS;
        private boolean syt = false;
        private BlockingQueue<Runnable> dgq = new PriorityBlockingQueue();
        private ThreadFactory nn = null;

        public kq csi(int i10) {
            return this;
        }

        public kq fou(int i10) {
            return this;
        }

        public kq bob(int i10) {
            this.fou = i10;
            return this;
        }

        public kq kq(String str) {
            this.kq = str;
            return this;
        }

        public kq oq(int i10) {
            this.bob = i10;
            return this;
        }

        public kq kq(int i10) {
            this.oq = i10;
            return this;
        }

        public kq oq(boolean z9) {
            this.syt = z9;
            return this;
        }

        public kq kq(long j10) {
            this.csi = j10;
            return this;
        }

        public kq kq(boolean z9) {
            this.rhi = z9;
            return this;
        }

        public rhi kq() {
            if (this.nn == null) {
                this.nn = new fou(this.kq);
            }
            if (this.oq < 0) {
                this.oq = 8;
            }
            if (this.oq == 0) {
                this.dgq = new SynchronousQueue();
            }
            if (this.dgq == null) {
                this.dgq = new LinkedBlockingQueue();
            }
            if (this.bob > 100) {
                this.bob = 100;
            }
            int i10 = this.bob;
            int i11 = this.oq;
            if (i10 < i11) {
                this.bob = i11;
            }
            return new rhi(this);
        }
    }

    private void bob() {
        try {
            if (this.oq != 0 && getCorePoolSize() > this.oq && getQueue().size() == 0) {
                setCorePoolSize(this.oq);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void oq() {
        try {
            if (this.oq != 0 && getCorePoolSize() < this.bob) {
                int size = getQueue().size();
                if (getActiveCount() < this.oq || size < this.fou) {
                    return;
                }
                setCorePoolSize(this.bob);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        boolean z9 = runnable instanceof oq;
        if (z9) {
            ((oq) runnable).bob(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z9) {
            oq oqVar = (oq) runnable;
            oqVar.oq();
            oqVar.kq();
            oqVar.bob();
            oqVar.fou();
            oqVar.csi();
        }
        bob();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof oq) {
            ((oq) runnable).oq(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        d.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.syt.bob.kq kqVarKq;
        if (!(runnable instanceof oq)) {
            runnable = new oq("unknown", runnable) { // from class: com.bytedance.sdk.component.syt.bob.rhi.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableRhi = rhi();
                    if (runnableRhi != null) {
                        runnableRhi.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.kq)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(fou.kq(this.kq)) && (kqVarKq = bob.kq()) != null) {
                kqVarKq.kq(this, (oq) runnable);
            }
        }
        ((oq) runnable).kq(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            oq();
        } catch (Throwable th) {
            kq(runnable, th);
        }
    }

    public void kq(kq kqVar) {
        try {
            if (kqVar.oq >= 0 && this.oq != kqVar.oq) {
                int i10 = kqVar.oq;
                this.oq = i10;
                setCorePoolSize(i10);
            }
            this.bob = kqVar.bob;
            this.fou = kqVar.fou;
            allowCoreThreadTimeOut(kqVar.rhi);
            this.csi = kqVar.syt;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = kqVar.kq;
        int unused2 = kqVar.oq;
        int unused3 = kqVar.bob;
        long unused4 = kqVar.csi;
        int unused5 = kqVar.fou;
        boolean unused6 = kqVar.syt;
        BlockingQueue unused7 = kqVar.dgq;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.kq)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.kq) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int iKq;
        String strOq;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof oq) {
            oq oqVar = (oq) runnable;
            iKq = oqVar.kq();
            strOq = oqVar.oq();
        } else {
            iKq = 6;
            strOq = "";
        }
        if (iKq == 0 || TextUtils.isEmpty(strOq)) {
            new RuntimeException();
        }
        execute(new oq(iKq, strOq) { // from class: com.bytedance.sdk.component.syt.bob.rhi.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private rhi(kq kqVar) {
        super(kqVar.oq, Api.BaseClientBuilder.API_PRIORITY_OTHER, kqVar.csi, kqVar.rjo, (BlockingQueue<Runnable>) kqVar.dgq, kqVar.nn);
        this.csi = false;
        String unused = kqVar.kq;
        int unused2 = kqVar.oq;
        int unused3 = kqVar.bob;
        long unused4 = kqVar.csi;
        int unused5 = kqVar.fou;
        boolean unused6 = kqVar.syt;
        BlockingQueue unused7 = kqVar.dgq;
        this.kq = kqVar.kq;
        this.oq = kqVar.oq;
        this.bob = kqVar.bob;
        this.fou = kqVar.fou;
        allowCoreThreadTimeOut(kqVar.rhi);
        this.csi = kqVar.syt;
    }

    private void kq(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerOq = bob.oq();
                if (handlerOq != null) {
                    handlerOq.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean kq() {
        return this.csi;
    }
}
