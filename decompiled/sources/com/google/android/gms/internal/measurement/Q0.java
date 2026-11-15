package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Q0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ J0 f36466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f36467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f36468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ B1 f36469h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(B1 b10, J0 j10, String str, String str2) {
        super(b10, true);
        this.f36466e = j10;
        this.f36467f = str;
        this.f36468g = str2;
        Objects.requireNonNull(b10);
        this.f36469h = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36469h.n())).setCurrentScreenByScionActivityInfo(this.f36466e, this.f36467f, this.f36468g, this.f36839a);
    }
}
