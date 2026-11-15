package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1751Fw0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C1751Fw0 f18876d = new C1751Fw0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f18877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f18878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C1751Fw0 f18879c;

    C1751Fw0() {
        this.f18877a = null;
        this.f18878b = null;
    }

    C1751Fw0(Runnable runnable, Executor executor) {
        this.f18877a = runnable;
        this.f18878b = executor;
    }
}
