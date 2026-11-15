package com.bytedance.sdk.openadsdk.ou.kq;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.syt;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static Handler kq;
    private static HandlerThread oq;

    public static Handler kq() {
        try {
            HandlerThread handlerThread = oq;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (kq.class) {
                    try {
                        HandlerThread handlerThread2 = oq;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            oq = syt.kq("csj_ev");
                            kq = new Handler(oq.getLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (kq == null) {
                synchronized (kq.class) {
                    try {
                        if (kq == null) {
                            kq = new Handler(oq.getLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return kq;
    }
}
