package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6023zd0 implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5393ud0 f35819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1661Ed0 f35820b;

    C6023zd0(C1661Ed0 c1661Ed0, C5393ud0 c5393ud0) {
        this.f35819a = c5393ud0;
        Objects.requireNonNull(c1661Ed0);
        this.f35820b = c1661Ed0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f35820b.f18537f.g().h(this.f35819a, th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void zzb(Object obj) {
        this.f35820b.f18537f.g().e(this.f35819a);
    }
}
