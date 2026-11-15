package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1560Cf implements InterfaceC2233Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1716Ff f17919a;

    C1560Cf(C1716Ff c1716Ff) {
        Objects.requireNonNull(c1716Ff);
        this.f17919a = c1716Ff;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2233Pe
    public final void h0(boolean z9) {
        if (z9) {
            this.f17919a.f();
        } else {
            this.f17919a.g();
        }
    }
}
