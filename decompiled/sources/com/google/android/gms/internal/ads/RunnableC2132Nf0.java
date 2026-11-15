package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2132Nf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2704Yf0 f21307a;

    RunnableC2132Nf0(AbstractC2704Yf0 abstractC2704Yf0) {
        Objects.requireNonNull(abstractC2704Yf0);
        this.f21307a = abstractC2704Yf0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21307a.S();
    }
}
