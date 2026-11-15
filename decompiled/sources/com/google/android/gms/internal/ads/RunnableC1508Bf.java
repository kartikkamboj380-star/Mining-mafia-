package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1508Bf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1716Ff f17668a;

    RunnableC1508Bf(C1716Ff c1716Ff) {
        Objects.requireNonNull(c1716Ff);
        this.f17668a = c1716Ff;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17668a.g();
    }
}
