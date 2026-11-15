package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4690p20 implements InterfaceC5445v20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4941r20 f32277a;

    C4690p20(C4941r20 c4941r20) {
        Objects.requireNonNull(c4941r20);
        this.f32277a = c4941r20;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5445v20
    public final void zza() {
        synchronized (this.f32277a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5445v20
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AbstractC4711pD abstractC4711pD = (AbstractC4711pD) obj;
        C4941r20 c4941r20 = this.f32277a;
        synchronized (c4941r20) {
            c4941r20.e(abstractC4711pD.d());
            abstractC4711pD.b();
        }
    }
}
