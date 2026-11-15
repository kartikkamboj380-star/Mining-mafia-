package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3037bu implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2783Zt f26953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2679Xt f26954b;

    C3037bu(AbstractC3162cu abstractC3162cu, InterfaceC2783Zt interfaceC2783Zt, InterfaceC2679Xt interfaceC2679Xt) {
        this.f26953a = interfaceC2783Zt;
        this.f26954b = interfaceC2679Xt;
        Objects.requireNonNull(abstractC3162cu);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f26954b.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void zzb(Object obj) {
        this.f26953a.zza(obj);
    }
}
