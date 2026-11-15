package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private static HandlerThread kq;

    public static void kq(HandlerThread handlerThread) {
        kq = handlerThread;
    }

    public static HandlerThread kq(String str) {
        return kq(str, 0);
    }

    public static HandlerThread kq(String str, int i10) {
        if (com.bytedance.sdk.component.syt.dgq.fou) {
            return kq;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i10) { // from class: com.bytedance.sdk.component.utils.syt.1
                boolean kq = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.kq) {
                        return;
                    }
                    this.kq = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            fax.kq("HandlerThreadUtils", "new handlerThread error", th);
            return kq;
        }
    }
}
