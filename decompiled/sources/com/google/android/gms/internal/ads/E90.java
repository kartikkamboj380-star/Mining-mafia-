package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class E90 implements InterfaceC5307tx0 {
    E90(H90 h90) {
        Objects.requireNonNull(h90);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        AbstractC0786o0.k("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* synthetic */ void zzb(Object obj) {
        AbstractC0786o0.k("Notification of cache hit successful.");
    }
}
