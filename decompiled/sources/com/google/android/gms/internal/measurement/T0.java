package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class T0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ B1 f36492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T0(B1 b10) {
        super(b10, true);
        Objects.requireNonNull(b10);
        this.f36492e = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36492e.n())).resetAnalyticsData(this.f36839a);
    }
}
