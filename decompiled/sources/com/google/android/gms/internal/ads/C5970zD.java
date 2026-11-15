package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5970zD implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5307tx0 f35679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ED f35680b;

    C5970zD(ED ed, InterfaceC5307tx0 interfaceC5307tx0) {
        this.f35679a = interfaceC5307tx0;
        Objects.requireNonNull(ed);
        this.f35680b = ed;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f35680b.f();
        this.f35679a.a(th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f35680b.f();
        this.f35679a.zzb((AbstractC4711pD) obj);
    }
}
