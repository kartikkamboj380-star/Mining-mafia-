package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class S0 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f36484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S0(B1 b10, Bundle bundle) {
        super(b10, true);
        this.f36484e = bundle;
        Objects.requireNonNull(b10);
        this.f36485f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36485f.n())).setConsentThirdParty(this.f36484e, this.f36839a);
    }
}
