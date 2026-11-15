package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2107Mt extends ScheduledThreadPoolExecutor implements AutoCloseable {
    C2107Mt(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        p131n0.d.a(this);
    }
}
