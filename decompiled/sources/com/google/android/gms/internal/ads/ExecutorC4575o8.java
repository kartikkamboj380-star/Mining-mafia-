package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ExecutorC4575o8 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f31969a;

    ExecutorC4575o8(C4827q8 c4827q8, Handler handler) {
        this.f31969a = handler;
        Objects.requireNonNull(c4827q8);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f31969a.post(runnable);
    }
}
