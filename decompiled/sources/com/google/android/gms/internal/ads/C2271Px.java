package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2271Px extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f22234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ThreadFactoryC2323Qx f22235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2271Px(ThreadFactoryC2323Qx threadFactoryC2323Qx, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f22234a = runnable2;
        Objects.requireNonNull(threadFactoryC2323Qx);
        this.f22235b = threadFactoryC2323Qx;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f22235b.a());
        this.f22234a.run();
    }
}
