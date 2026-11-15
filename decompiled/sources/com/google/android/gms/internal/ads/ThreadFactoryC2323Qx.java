package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ThreadFactoryC2323Qx implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f22537a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22538b;

    final /* synthetic */ int a() {
        return this.f22538b;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f22537a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 26);
        sb.append("AdWorker(WebViewStartup) #");
        sb.append(andIncrement);
        return new C2271Px(this, runnable, sb.toString(), runnable);
    }
}
