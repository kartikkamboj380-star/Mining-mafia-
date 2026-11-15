package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class E5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f37510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f37511b;

    E5(N5 n10, long j10) {
        this.f37510a = j10;
        Objects.requireNonNull(n10);
        this.f37511b = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37511b.r(this.f37510a);
    }
}
