package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class N0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f36415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f36416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f36417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ B1 f36418h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(B1 b10, String str, String str2, Bundle bundle) {
        super(b10, true);
        this.f36415e = str;
        this.f36416f = str2;
        this.f36417g = bundle;
        Objects.requireNonNull(b10);
        this.f36418h = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36418h.n())).clearConditionalUserProperty(this.f36415e, this.f36416f, this.f36417g);
    }
}
