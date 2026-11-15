package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2080Mf0 implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2704Yf0 f20900a;

    C2080Mf0(AbstractC2704Yf0 abstractC2704Yf0) {
        Objects.requireNonNull(abstractC2704Yf0);
        this.f20900a = abstractC2704Yf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f20900a.c(th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void zzb(Object obj) {
        this.f20900a.b(obj);
    }
}
