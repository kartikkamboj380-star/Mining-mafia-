package com.bytedance.sdk.component.rhi.kq.rhi;

import com.bytedance.sdk.component.rhi.kq.syt;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static volatile oq kq;

    public static oq kq() {
        if (kq == null) {
            synchronized (oq.class) {
                try {
                    if (kq == null) {
                        kq = new bob(syt.rjo().rhi(), new rhi(syt.rjo().rhi()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }
}
