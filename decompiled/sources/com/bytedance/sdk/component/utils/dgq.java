package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class dgq {
    private static volatile Handler kq;

    public static Handler kq() {
        return com.bytedance.sdk.component.syt.kq.kq.kq().oq();
    }

    public static Handler oq() {
        if (kq == null) {
            synchronized (dgq.class) {
                try {
                    if (kq == null) {
                        kq = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }
}
