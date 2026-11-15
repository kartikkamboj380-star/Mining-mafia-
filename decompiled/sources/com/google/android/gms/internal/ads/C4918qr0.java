package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4918qr0 implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4792pr0 f32737a;

    C4918qr0(C5043rr0 c5043rr0, C4792pr0 c4792pr0) {
        this.f32737a = c4792pr0;
        Objects.requireNonNull(c5043rr0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        C4792pr0 c4792pr0 = this.f32737a;
        c4792pr0.b(th);
        c4792pr0.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void zzb(Object obj) {
        this.f32737a.c();
    }
}
