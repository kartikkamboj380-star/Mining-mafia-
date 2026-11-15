package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC6671z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f38561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f38562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f38563c;

    RunnableC6671z(C0 c10, String str, long j10) {
        this.f38561a = str;
        this.f38562b = j10;
        Objects.requireNonNull(c10);
        this.f38563c = c10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38563c.m(this.f38561a, this.f38562b);
    }
}
