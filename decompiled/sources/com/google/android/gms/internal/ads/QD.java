package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class QD implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UD f22328a;

    QD(UD ud) {
        Objects.requireNonNull(ud);
        this.f22328a = ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f22328a.k().g0(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f22328a.k().g0(true);
    }
}
