package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class U0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f36500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36501f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U0(B1 b10, long j10) {
        super(b10, true);
        this.f36500e = j10;
        Objects.requireNonNull(b10);
        this.f36501f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36501f.n())).setSessionTimeoutDuration(this.f36500e);
    }
}
