package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class RB0 implements TB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f22753a = new AtomicBoolean(false);

    RB0(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.TB0
    public final boolean zza() {
        return this.f22753a.get();
    }
}
