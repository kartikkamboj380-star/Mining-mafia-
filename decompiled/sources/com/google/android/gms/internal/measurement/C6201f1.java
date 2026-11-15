package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6201f1 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC6307r0 f36678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6201f1(B1 b10, BinderC6307r0 binderC6307r0) {
        super(b10, true);
        this.f36678e = binderC6307r0;
        Objects.requireNonNull(b10);
        this.f36679f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36679f.n())).getCurrentScreenClass(this.f36678e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    protected final void b() {
        this.f36678e.f0(null);
    }
}
