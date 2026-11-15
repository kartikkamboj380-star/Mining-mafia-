package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6210g1 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f36687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f36688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f36689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC6307r0 f36690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ B1 f36691i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6210g1(B1 b10, String str, String str2, boolean z9, BinderC6307r0 binderC6307r0) {
        super(b10, true);
        this.f36687e = str;
        this.f36688f = str2;
        this.f36689g = z9;
        this.f36690h = binderC6307r0;
        Objects.requireNonNull(b10);
        this.f36691i = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36691i.n())).getUserProperties(this.f36687e, this.f36688f, this.f36689g, this.f36690h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    protected final void b() {
        this.f36690h.f0(null);
    }
}
