package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2911au implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC3162cu f26662a;

    C2911au(AbstractC3162cu abstractC3162cu) {
        Objects.requireNonNull(abstractC3162cu);
        this.f26662a = abstractC3162cu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f26662a.f().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void zzb(Object obj) {
        this.f26662a.f().set(1);
    }
}
