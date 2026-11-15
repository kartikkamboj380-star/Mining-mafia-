package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4764pd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f32438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f32439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ScheduledFuture f32440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4890qd0 f32441d;

    C4764pd0(C4890qd0 c4890qd0, Runnable runnable, long j10) {
        Objects.requireNonNull(c4890qd0);
        this.f32441d = c4890qd0;
        this.f32438a = runnable;
        this.f32439b = j10;
    }
}
