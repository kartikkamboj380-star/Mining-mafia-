package com.bytedance.sdk.component.rhi.kq.bob;

import com.bytedance.sdk.component.rhi.kq.csi;
import com.bytedance.sdk.component.rhi.kq.syt;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static void kq(AtomicLong atomicLong, int i10) {
        csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq == null || !csiVarMxq.rjo() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i10);
    }
}
