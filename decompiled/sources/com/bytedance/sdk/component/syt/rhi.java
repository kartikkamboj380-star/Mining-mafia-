package com.bytedance.sdk.component.syt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends csi {
    private static volatile ThreadPoolExecutor csi;
    public static bob oq;
    private static volatile ThreadPoolExecutor rhi;
    private static volatile ScheduledExecutorService rjo;
    public static final int kq = Runtime.getRuntime().availableProcessors();
    public static int bob = 120;
    public static boolean fou = true;

    public static ExecutorService bob() {
        return kq(10);
    }

    public static boolean csi() {
        return fou;
    }

    public static ScheduledExecutorService fou() {
        if (rjo == null) {
            synchronized (rhi.class) {
                try {
                    if (rjo == null) {
                        rjo = Executors.newSingleThreadScheduledExecutor(csi.kq().kq(5, "scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return rjo;
    }

    public static void kq(syt sytVar) {
        if (csi == null) {
            oq();
        }
        if (sytVar == null || csi == null) {
            return;
        }
        csi.execute(sytVar);
    }

    public static ExecutorService oq() {
        if (csi == null) {
            synchronized (rhi.class) {
                try {
                    if (csi == null) {
                        csi = new kq.C0256kq().kq("init").kq(0).oq(10).kq(5L).kq(TimeUnit.SECONDS).kq(new SynchronousQueue()).kq(rhi()).kq(csi.kq().kq(10, "init")).kq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return csi;
    }

    public static RejectedExecutionHandler rhi() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.syt.rhi.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static bob rjo() {
        return oq;
    }

    public static ExecutorService kq(int i10) {
        if (rhi == null) {
            synchronized (rhi.class) {
                try {
                    if (rhi == null) {
                        kq kqVarKq = new kq.C0256kq().kq("io").kq(2).oq(i10).kq(20L).kq(TimeUnit.SECONDS).kq(new LinkedBlockingQueue()).kq(rhi()).kq(csi.kq().kq(i10, "io")).kq();
                        rhi = kqVarKq;
                        kqVarKq.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return rhi;
    }

    public static void oq(syt sytVar) {
        if (rhi == null) {
            bob();
        }
        if (rhi != null) {
            rhi.execute(sytVar);
        }
    }

    public static void oq(int i10) {
        bob = i10;
    }

    public static void kq(syt sytVar, int i10) {
        oq(sytVar);
    }

    public static void kq(boolean z9) {
        fou = z9;
    }

    public static void kq(bob bobVar) {
        oq = bobVar;
    }
}
