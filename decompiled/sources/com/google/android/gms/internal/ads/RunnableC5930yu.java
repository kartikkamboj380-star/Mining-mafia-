package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC5930yu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f35479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1590Cu f35480b;

    RunnableC5930yu(C1590Cu c1590Cu, boolean z9) {
        this.f35479a = z9;
        Objects.requireNonNull(c1590Cu);
        this.f35480b = c1590Cu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35480b.l("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.f35479a)});
    }
}
