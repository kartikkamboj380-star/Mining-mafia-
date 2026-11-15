package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class F5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f37524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f37525b;

    F5(N5 n10, long j10) {
        this.f37524a = j10;
        Objects.requireNonNull(n10);
        this.f37525b = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37525b.s(this.f37524a);
    }
}
