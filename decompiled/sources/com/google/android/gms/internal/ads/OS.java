package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class OS extends AbstractBinderC3912is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ QS f21553a;

    OS(QS qs) {
        Objects.requireNonNull(qs);
        this.f21553a = qs;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void n(int i10) {
        QS qs = this.f21553a;
        qs.c().l(qs.b(), i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void o(H4.Z0 z9) {
        QS qs = this.f21553a;
        qs.c().l(qs.b(), z9.f1252a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void zze() {
        QS qs = this.f21553a;
        qs.c().k(qs.b());
    }
}
