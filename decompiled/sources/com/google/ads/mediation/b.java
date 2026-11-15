package com.google.ads.mediation;

import B4.k;
import H4.InterfaceC0580a;
import N4.n;

/* JADX INFO: loaded from: classes2.dex */
final class b extends B4.d implements C4.e, InterfaceC0580a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f16701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f16702b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f16701a = abstractAdViewAdapter;
        this.f16702b = nVar;
    }

    @Override // B4.d
    public final void i() {
        this.f16702b.l(this.f16701a);
    }

    @Override // B4.d
    public final void j(k kVar) {
        this.f16702b.h(this.f16701a, kVar);
    }

    @Override // B4.d
    public final void m() {
        this.f16702b.f(this.f16701a);
    }

    @Override // B4.d
    public final void o() {
        this.f16702b.j(this.f16701a);
    }

    @Override // B4.d
    public final void onAdClicked() {
        this.f16702b.d(this.f16701a);
    }

    @Override // C4.e
    public final void v(String str, String str2) {
        this.f16702b.p(this.f16701a, str, str2);
    }
}
