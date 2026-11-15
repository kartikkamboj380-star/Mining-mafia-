package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ThreadFactoryC2159Nt implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f21363a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f21364b;

    ThreadFactoryC2159Nt(String str) {
        this.f21364b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f21363a.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f21364b;
        StringBuilder sb = new StringBuilder(str.length() + 12 + length);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
