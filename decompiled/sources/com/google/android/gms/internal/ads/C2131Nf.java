package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2131Nf extends C2575Vt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2443Tf f21306b;

    C2131Nf(C2443Tf c2443Tf) {
        Objects.requireNonNull(c2443Tf);
        this.f21306b = c2443Tf;
    }

    @Override // com.google.android.gms.internal.ads.C2575Vt, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        this.f21306b.b();
        return super.cancel(z9);
    }
}
