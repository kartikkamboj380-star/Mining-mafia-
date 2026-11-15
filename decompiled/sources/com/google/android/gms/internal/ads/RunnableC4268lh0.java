package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4268lh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4646oh0 f31335a;

    RunnableC4268lh0(C4646oh0 c4646oh0) {
        Objects.requireNonNull(c4646oh0);
        this.f31335a = c4646oh0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31335a.h().c();
    }
}
