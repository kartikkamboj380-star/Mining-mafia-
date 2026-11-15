package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6264m1 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f36748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6264m1(B1 b10, boolean z9) {
        super(b10, true);
        this.f36748e = z9;
        Objects.requireNonNull(b10);
        this.f36749f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36749f.n())).setDataCollectionEnabled(this.f36748e);
    }
}
