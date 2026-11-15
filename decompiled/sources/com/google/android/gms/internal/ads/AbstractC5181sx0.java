package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5181sx0 extends AbstractFutureC4930qx0 implements com.google.common.util.concurrent.p {
    protected AbstractC5181sx0() {
    }

    @Override // com.google.common.util.concurrent.p
    public final void e(Runnable runnable, Executor executor) {
        j().e(runnable, executor);
    }

    protected abstract com.google.common.util.concurrent.p j();
}
