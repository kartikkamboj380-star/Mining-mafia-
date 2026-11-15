package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceExecutorServiceC1805Gx0 extends ExecutorService, AutoCloseable {
    com.google.common.util.concurrent.p e0(Callable callable);

    com.google.common.util.concurrent.p j0(Runnable runnable);
}
