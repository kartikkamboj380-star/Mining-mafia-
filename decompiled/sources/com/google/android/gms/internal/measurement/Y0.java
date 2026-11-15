package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Y0 extends AbstractBinderC6377z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f36546a;

    Y0(Z0 z9, Runnable runnable) {
        this.f36546a = runnable;
        Objects.requireNonNull(z9);
    }

    @Override // com.google.android.gms.internal.measurement.A0
    public final void zze() {
        this.f36546a.run();
    }
}
