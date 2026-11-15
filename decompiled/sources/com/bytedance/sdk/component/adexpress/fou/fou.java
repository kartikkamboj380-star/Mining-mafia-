package com.bytedance.sdk.component.adexpress.fou;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static void kq(com.bytedance.sdk.component.syt.syt sytVar, int i10) {
        if (sytVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.kq.kq.bob bobVarBob = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob();
        ExecutorService executorServiceSuf = bobVarBob != null ? bobVarBob.suf() : null;
        if (executorServiceSuf == null) {
            com.bytedance.sdk.component.syt.rhi.kq(sytVar, i10);
        } else {
            sytVar.setPriority(i10);
            executorServiceSuf.execute(sytVar);
        }
    }

    public static void oq(com.bytedance.sdk.component.syt.syt sytVar, int i10) {
        if (sytVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.kq.kq.bob bobVarBob = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob();
        ExecutorService executorServiceWki = bobVarBob != null ? bobVarBob.wki() : null;
        if (executorServiceWki == null) {
            com.bytedance.sdk.component.syt.rhi.kq(sytVar);
        } else {
            sytVar.setPriority(i10);
            executorServiceWki.execute(sytVar);
        }
    }

    public static ScheduledFuture kq(Runnable runnable, long j10, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.syt.rhi.fou().schedule(runnable, j10, timeUnit);
    }
}
