package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Z0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Runnable f36559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z0(B1 b10, Runnable runnable) {
        super(b10, true);
        this.f36559e = runnable;
        Objects.requireNonNull(b10);
        this.f36560f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36560f.n())).retrieveAndUploadBatches(new Y0(this, this.f36559e));
    }
}
