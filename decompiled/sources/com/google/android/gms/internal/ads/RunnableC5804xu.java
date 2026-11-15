package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC5804xu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1590Cu f35058a;

    RunnableC5804xu(C1590Cu c1590Cu) {
        Objects.requireNonNull(c1590Cu);
        this.f35058a = c1590Cu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35058a.l("surfaceDestroyed", new String[0]);
    }
}
