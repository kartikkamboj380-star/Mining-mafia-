package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC6487a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f37848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f37849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f37850c;

    RunnableC6487a(C0 c10, String str, long j10) {
        this.f37848a = str;
        this.f37849b = j10;
        Objects.requireNonNull(c10);
        this.f37850c = c10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37850c.l(this.f37848a, this.f37849b);
    }
}
