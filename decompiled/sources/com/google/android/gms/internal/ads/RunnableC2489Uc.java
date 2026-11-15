package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2489Uc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2645Xc f24059a;

    RunnableC2489Uc(C2645Xc c2645Xc) {
        Objects.requireNonNull(c2645Xc);
        this.f24059a = c2645Xc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24059a.r();
    }
}
