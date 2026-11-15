package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2340Rf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2704Yf0 f22884a;

    RunnableC2340Rf0(AbstractC2704Yf0 abstractC2704Yf0) {
        Objects.requireNonNull(abstractC2704Yf0);
        this.f22884a = abstractC2704Yf0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22884a.g();
    }
}
