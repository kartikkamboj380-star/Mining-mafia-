package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class R0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Boolean f36477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R0(B1 b10, Boolean bool) {
        super(b10, true);
        this.f36477e = bool;
        Objects.requireNonNull(b10);
        this.f36478f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36478f.n())).setMeasurementEnabled(this.f36477e.booleanValue(), this.f36839a);
    }
}
