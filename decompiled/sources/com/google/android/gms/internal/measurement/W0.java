package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class W0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f36527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W0(B1 b10, String str) {
        super(b10, true);
        this.f36527e = str;
        Objects.requireNonNull(b10);
        this.f36528f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36528f.n())).beginAdUnitExposure(this.f36527e, this.f36840b);
    }
}
