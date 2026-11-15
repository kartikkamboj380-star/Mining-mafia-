package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2313Qs extends AbstractC2573Vs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Clock f22464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InterfaceC4864qQ0 f22465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC4864qQ0 f22466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final InterfaceC4864qQ0 f22467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final InterfaceC4864qQ0 f22468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final InterfaceC4864qQ0 f22469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final InterfaceC4864qQ0 f22470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final InterfaceC4864qQ0 f22471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final InterfaceC4864qQ0 f22472j;

    C2313Qs(Context context, Clock clock, InterfaceC0790q0 interfaceC0790q0, C2521Us c2521Us) {
        this.f22464b = clock;
        InterfaceC3732hQ0 interfaceC3732hQ0A = C3858iQ0.a(context);
        this.f22465c = interfaceC3732hQ0A;
        InterfaceC3732hQ0 interfaceC3732hQ0A2 = C3858iQ0.a(interfaceC0790q0);
        this.f22466d = interfaceC3732hQ0A2;
        this.f22467e = C3606gQ0.a(C2002Ks.a(interfaceC3732hQ0A, interfaceC3732hQ0A2));
        InterfaceC3732hQ0 interfaceC3732hQ0A3 = C3858iQ0.a(clock);
        this.f22468f = interfaceC3732hQ0A3;
        InterfaceC3732hQ0 interfaceC3732hQ0A4 = C3858iQ0.a(c2521Us);
        this.f22469g = interfaceC3732hQ0A4;
        InterfaceC4864qQ0 interfaceC4864qQ0A = C3606gQ0.a(C2105Ms.a(interfaceC3732hQ0A3, interfaceC3732hQ0A2, interfaceC3732hQ0A4));
        this.f22470h = interfaceC4864qQ0A;
        C2209Os c2209OsB = C2209Os.b(interfaceC3732hQ0A3, interfaceC4864qQ0A);
        this.f22471i = c2209OsB;
        this.f22472j = C3606gQ0.a(C3035bt.a(interfaceC3732hQ0A, c2209OsB));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2573Vs
    final C2157Ns a() {
        return new C2157Ns(this.f22464b, (C2053Ls) this.f22470h.zzb());
    }
}
