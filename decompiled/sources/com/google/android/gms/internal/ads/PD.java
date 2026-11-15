package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class PD implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UD f22064a;

    PD(UD ud) {
        Objects.requireNonNull(ud);
        this.f22064a = ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f22064a.k().K(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f22064a.k().K(true);
    }
}
