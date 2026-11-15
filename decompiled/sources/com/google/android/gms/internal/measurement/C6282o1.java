package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6282o1 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC6308r1 f36800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36801f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6282o1(B1 b10, BinderC6308r1 binderC6308r1) {
        super(b10, true);
        this.f36800e = binderC6308r1;
        Objects.requireNonNull(b10);
        this.f36801f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36801f.n())).registerOnMeasurementEventListener(this.f36800e);
    }
}
