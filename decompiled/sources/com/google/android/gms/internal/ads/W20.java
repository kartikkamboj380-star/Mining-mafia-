package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class W20 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f24650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f24652c;

    W20(com.google.common.util.concurrent.p pVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f24650a = pVar;
        this.f24651b = executor;
        this.f24652c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        com.google.common.util.concurrent.p pVar = this.f24650a;
        V20 v20 = V20.f24171a;
        Executor executor = this.f24651b;
        com.google.common.util.concurrent.p pVarJ = AbstractC5685wx0.j(pVar, v20, executor);
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.Wd;
        if (((Integer) H4.B.c().d(abstractC2759Zh)).intValue() > 0) {
            pVarJ = AbstractC5685wx0.i(pVarJ, ((Integer) H4.B.c().d(abstractC2759Zh)).intValue(), TimeUnit.MILLISECONDS, this.f24652c);
        }
        return AbstractC5685wx0.h(pVarJ, Throwable.class, U20.f23896a, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 6;
    }
}
