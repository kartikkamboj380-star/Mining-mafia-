package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3401eo implements InterfaceC2679Xt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2575Vt f28067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1784Gn f28068b;

    C3401eo(C3653go c3653go, C2575Vt c2575Vt, C1784Gn c1784Gn) {
        this.f28067a = c2575Vt;
        this.f28068b = c1784Gn;
        Objects.requireNonNull(c3653go);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2679Xt
    public final void zza() {
        AbstractC0786o0.k("callJs > getEngine: Promise rejected");
        this.f28067a.c(new C2251Pn("Unable to obtain a JavascriptEngine."));
        this.f28068b.g();
    }
}
