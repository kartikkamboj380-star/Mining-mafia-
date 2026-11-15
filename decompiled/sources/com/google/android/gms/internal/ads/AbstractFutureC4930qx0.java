package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFutureC4930qx0 extends AbstractC4672ou0 implements Future {
    protected AbstractFutureC4930qx0() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return i().get();
    }

    protected abstract Future i();

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return i().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return i().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return i().get(j10, timeUnit);
    }
}
