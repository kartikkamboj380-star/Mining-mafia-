package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class L4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ M4 f37607a;

    L4(M4 m10) {
        Objects.requireNonNull(m10);
        this.f37607a = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37607a.E(null);
    }
}
