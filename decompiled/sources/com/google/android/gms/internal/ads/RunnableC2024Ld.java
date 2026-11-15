package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2024Ld implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2075Md f20559a;

    RunnableC2024Ld(C2075Md c2075Md) {
        Objects.requireNonNull(c2075Md);
        this.f20559a = c2075Md;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20559a.b();
    }
}
