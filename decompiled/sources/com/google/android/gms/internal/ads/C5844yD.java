package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5844yD implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5307tx0 f35299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ED f35300b;

    C5844yD(ED ed, InterfaceC5307tx0 interfaceC5307tx0) {
        this.f35299a = interfaceC5307tx0;
        Objects.requireNonNull(ed);
        this.f35300b = ed;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f35299a.a(th);
        this.f35300b.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f35300b.e(((C5718xD) obj).f34763a, this.f35299a);
    }
}
