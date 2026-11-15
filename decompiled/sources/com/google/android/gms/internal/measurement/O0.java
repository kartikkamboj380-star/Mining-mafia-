package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class O0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f36429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f36430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC6307r0 f36431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ B1 f36432h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(B1 b10, String str, String str2, BinderC6307r0 binderC6307r0) {
        super(b10, true);
        this.f36429e = str;
        this.f36430f = str2;
        this.f36431g = binderC6307r0;
        Objects.requireNonNull(b10);
        this.f36432h = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36432h.n())).getConditionalUserProperties(this.f36429e, this.f36430f, this.f36431g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    protected final void b() {
        this.f36431g.f0(null);
    }
}
