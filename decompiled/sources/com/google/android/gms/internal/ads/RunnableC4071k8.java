package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4071k8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5960z8 f30706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4197l8 f30707b;

    RunnableC4071k8(C4197l8 c4197l8, AbstractC5960z8 abstractC5960z8) {
        this.f30706a = abstractC5960z8;
        Objects.requireNonNull(c4197l8);
        this.f30707b = c4197l8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30707b.b().put(this.f30706a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
