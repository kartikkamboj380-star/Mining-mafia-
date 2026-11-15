package com.bytedance.sdk.openadsdk.mxq;

import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.openadsdk.core.ou;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    /* JADX INFO: Access modifiers changed from: private */
    public static void bob() {
        ou.kq();
    }

    public static void kq() {
        if (nz.rhi()) {
            nz.kq(new syt("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.mxq.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    kq.bob();
                }
            });
        } else {
            bob();
        }
    }
}
