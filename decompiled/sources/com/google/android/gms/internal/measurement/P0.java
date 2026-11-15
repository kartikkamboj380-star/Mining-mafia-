package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class P0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f36443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P0(B1 b10, String str) {
        super(b10, true);
        this.f36443e = str;
        Objects.requireNonNull(b10);
        this.f36444f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36444f.n())).setUserId(this.f36443e, this.f36839a);
    }
}
