package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5800xs implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.p f35045a;

    C5800xs(C1586Cs c1586Cs, com.google.common.util.concurrent.p pVar) {
        this.f35045a = pVar;
        Objects.requireNonNull(c1586Cs);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        C1586Cs.f17956l.remove(this.f35045a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C1586Cs.f17956l.remove(this.f35045a);
    }
}
