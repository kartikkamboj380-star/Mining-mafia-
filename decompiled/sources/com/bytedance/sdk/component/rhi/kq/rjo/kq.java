package com.bytedance.sdk.component.rhi.kq.rjo;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.rhi.kq.csi;
import com.bytedance.sdk.component.rhi.kq.syt;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static int bob = 3000;
    private static volatile HandlerThread kq;
    private static volatile Handler oq;

    static {
        bob();
    }

    private static void bob() {
        HandlerThread handlerThreadKq;
        csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq != null && (handlerThreadKq = csiVarMxq.kq("csj_ad_log", 10)) != null) {
            kq = handlerThreadKq;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        kq = handlerThread;
        handlerThread.start();
    }

    public static Handler kq() {
        if (kq == null || !kq.isAlive()) {
            synchronized (kq.class) {
                try {
                    if (kq == null || !kq.isAlive()) {
                        bob();
                        oq = new Handler(kq.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (oq == null) {
            synchronized (kq.class) {
                try {
                    if (oq == null) {
                        oq = new Handler(kq.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return oq;
    }

    public static int oq() {
        if (bob <= 0) {
            bob = 3000;
        }
        return bob;
    }
}
