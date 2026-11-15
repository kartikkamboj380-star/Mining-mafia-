package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6237j1 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f36721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC6307r0 f36722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ B1 f36723g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6237j1(B1 b10, String str, BinderC6307r0 binderC6307r0) {
        super(b10, true);
        this.f36721e = str;
        this.f36722f = binderC6307r0;
        Objects.requireNonNull(b10);
        this.f36723g = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36723g.n())).getMaxUserProperties(this.f36721e, this.f36722f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    protected final void b() {
        this.f36722f.f0(null);
    }
}
