package com.bytedance.sdk.component.rhi.kq.oq;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.rhi.kq.csi;
import com.bytedance.sdk.component.rhi.kq.syt;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private volatile com.bytedance.sdk.component.rhi.kq.oq.bob.bob dgq;
    private volatile Handler nn;
    private final Comparator<com.bytedance.sdk.component.rhi.kq.fou.kq> ubx;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.rhi.kq.fou.kq> vvw;
    public static final fou kq = new fou();
    public static final com.bytedance.sdk.component.rhi.kq.oq.kq.kq fou = new com.bytedance.sdk.component.rhi.kq.oq.kq.kq();
    public static final AtomicLong csi = new AtomicLong(0);
    public static final AtomicLong rhi = new AtomicLong(0);
    public static final long rjo = System.currentTimeMillis();
    public static long syt = 0;
    public volatile boolean oq = false;
    public volatile boolean bob = false;

    private fou() {
        Comparator<com.bytedance.sdk.component.rhi.kq.fou.kq> comparator = new Comparator<com.bytedance.sdk.component.rhi.kq.fou.kq>() { // from class: com.bytedance.sdk.component.rhi.kq.oq.fou.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar, com.bytedance.sdk.component.rhi.kq.fou.kq kqVar2) {
                return fou.this.kq(kqVar, kqVar2);
            }
        };
        this.ubx = comparator;
        this.vvw = new PriorityBlockingQueue<>(8, comparator);
    }

    public void bob() {
        if (this.dgq == null || !this.dgq.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.dgq != null && this.dgq.isAlive()) {
                    if (this.nn != null) {
                        this.nn.removeCallbacksAndMessages(null);
                    }
                    this.dgq.kq(false);
                    this.dgq.quitSafely();
                    this.dgq = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void csi() {
        com.bytedance.sdk.component.rhi.kq.bob.oq.kq(fou.xn(), 1);
        final com.bytedance.sdk.component.rhi.kq.oq.bob.bob bobVar = this.dgq;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (bobVar != null) {
                bobVar.bob(2);
                return;
            }
            return;
        }
        csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq != null) {
            Executor executorFou = csiVarMxq.fou();
            if (executorFou == null) {
                executorFou = csiVarMxq.csi();
            }
            if (executorFou != null) {
                executorFou.execute(new com.bytedance.sdk.component.rhi.kq.csi.csi("flush") { // from class: com.bytedance.sdk.component.rhi.kq.oq.fou.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.rhi.kq.oq.bob.bob bobVar2 = bobVar;
                        if (bobVar2 != null) {
                            bobVar2.bob(2);
                        }
                    }
                });
            }
        }
    }

    public boolean fou() {
        try {
            if (this.dgq != null || com.bytedance.sdk.component.rhi.kq.oq.oq()) {
                return false;
            }
            synchronized (this) {
                if (this.dgq != null) {
                    return false;
                }
                this.dgq = new com.bytedance.sdk.component.rhi.kq.oq.bob.bob(this.vvw);
                this.dgq.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void oq() {
        fou();
        csi();
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.rhi.kq.fou.kq> kq() {
        return this.vvw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar, com.bytedance.sdk.component.rhi.kq.fou.kq kqVar2) {
        long jKq;
        long jOq;
        long jOq2;
        long jKq2;
        if (kqVar == null) {
            return kqVar2 == null ? 0 : -1;
        }
        if (kqVar2 == null) {
            return 1;
        }
        if (kqVar.csi() == kqVar2.csi()) {
            if (kqVar.kq() != null) {
                jKq = kqVar.kq().kq();
                jOq = kqVar.kq().oq();
            } else {
                jKq = 0;
                jOq = 0;
            }
            if (kqVar2.kq() != null) {
                jKq2 = kqVar2.kq().kq();
                jOq2 = kqVar2.kq().oq();
            } else {
                jOq2 = 0;
                jKq2 = 0;
            }
            if (jKq == 0 || jKq2 == 0) {
                return 0;
            }
            long j10 = jKq - jKq2;
            if (Math.abs(j10) > 2147483647L) {
                return 0;
            }
            if (j10 != 0) {
                return (int) j10;
            }
            if (jOq == 0 || jOq2 == 0) {
                return 0;
            }
            return (int) (jOq - jOq2);
        }
        return kqVar.csi() - kqVar2.csi();
    }

    public void kq(Handler handler) {
        this.nn = handler;
    }

    public void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar, int i10) {
        fou();
        csi csiVarMxq = syt.rjo().mxq();
        com.bytedance.sdk.component.rhi.kq.oq.bob.bob bobVar = this.dgq;
        if (bobVar != null) {
            kq(csiVarMxq, kqVar);
            bobVar.kq(kqVar, kqVar.csi() == 4);
        }
    }

    private void kq(final csi csiVar, com.bytedance.sdk.component.rhi.kq.fou.kq kqVar) {
        if (csiVar != null) {
            try {
                if (csiVar.rjo()) {
                    final long jOq = (kqVar == null || kqVar.kq() == null) ? 0L : kqVar.kq().oq();
                    if (jOq == 1) {
                        syt = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongYsx = fou.ysx();
                    com.bytedance.sdk.component.rhi.kq.bob.oq.kq(atomicLongYsx, 1);
                    if (atomicLongYsx.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorFou = csiVar.fou();
                                if (executorFou == null) {
                                    executorFou = csiVar.csi();
                                }
                                if (executorFou != null) {
                                    executorFou.execute(new com.bytedance.sdk.component.rhi.kq.csi.csi("report") { // from class: com.bytedance.sdk.component.rhi.kq.oq.fou.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            fou.this.kq(csiVar, jOq);
                                        }
                                    });
                                }
                            } else {
                                kq(csiVar, jOq);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(csi csiVar, long j10) {
        com.bytedance.sdk.component.rhi.kq.oq.bob.bob bobVar = this.dgq;
        if (csiVar == null || bobVar == null) {
            return;
        }
        com.bytedance.sdk.component.rhi.kq.oq.kq.kq kqVar = fou;
        bobVar.kq(csiVar.kq(kqVar.oq(j10)), true);
        kqVar.syw();
    }
}
