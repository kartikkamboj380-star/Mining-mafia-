package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC5678wu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1590Cu f34669a;

    RunnableC5678wu(C1590Cu c1590Cu) {
        Objects.requireNonNull(c1590Cu);
        this.f34669a = c1590Cu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34669a.l("surfaceCreated", new String[0]);
    }
}
