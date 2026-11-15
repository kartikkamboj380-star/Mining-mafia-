package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6273n1 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f36782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ B1 f36783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6273n1(B1 b10, Bundle bundle) {
        super(b10, true);
        this.f36782e = bundle;
        Objects.requireNonNull(b10);
        this.f36783f = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36783f.n())).setDefaultEventParameters(this.f36782e);
    }
}
