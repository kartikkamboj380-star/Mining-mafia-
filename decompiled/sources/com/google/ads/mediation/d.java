package com.google.ads.mediation;

import B4.j;
import N4.t;

/* JADX INFO: loaded from: classes2.dex */
final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f16705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f16706b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, t tVar) {
        this.f16705a = abstractAdViewAdapter;
        this.f16706b = tVar;
    }

    @Override // B4.j
    public final void c() {
        this.f16706b.t(this.f16705a);
    }

    @Override // B4.j
    public final void f() {
        this.f16706b.u(this.f16705a);
    }
}
