package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2585Vy implements E80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f24612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC4864qQ0 f24613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InterfaceC4864qQ0 f24614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC4864qQ0 f24615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final InterfaceC4864qQ0 f24616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final InterfaceC4864qQ0 f24617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final InterfaceC4864qQ0 f24618g;

    C2585Vy(C2325Qy c2325Qy, Context context, String str) {
        this.f24612a = c2325Qy;
        InterfaceC3732hQ0 interfaceC3732hQ0A = C3858iQ0.a(context);
        this.f24613b = interfaceC3732hQ0A;
        InterfaceC3732hQ0 interfaceC3732hQ0A2 = C3858iQ0.a(str);
        this.f24614c = interfaceC3732hQ0A2;
        InterfaceC4864qQ0 interfaceC4864qQ0 = c2325Qy.f22674z1;
        X90 x90B = X90.b(interfaceC3732hQ0A, interfaceC4864qQ0, c2325Qy.f22541A1);
        this.f24615d = x90B;
        InterfaceC4864qQ0 interfaceC4864qQ0A = C3606gQ0.a(C3069c90.a(interfaceC4864qQ0));
        this.f24616e = interfaceC4864qQ0A;
        InterfaceC4864qQ0 interfaceC4864qQ1 = c2325Qy.f22606d;
        InterfaceC4864qQ0 interfaceC4864qQ2 = c2325Qy.f22610e0;
        C1501Bb0 c1501Bb0A = C1501Bb0.a();
        InterfaceC4864qQ0 interfaceC4864qQ3 = c2325Qy.f22630l;
        InterfaceC4864qQ0 interfaceC4864qQ0A2 = C3606gQ0.a(C3320e90.a(interfaceC3732hQ0A, interfaceC4864qQ1, interfaceC4864qQ2, x90B, interfaceC4864qQ0A, c1501Bb0A, interfaceC4864qQ3));
        this.f24617f = interfaceC4864qQ0A2;
        this.f24618g = C3606gQ0.a(C4200l90.a(interfaceC4864qQ2, interfaceC3732hQ0A, interfaceC3732hQ0A2, interfaceC4864qQ0A2, interfaceC4864qQ0A, interfaceC4864qQ3, c2325Qy.f22639o));
    }

    @Override // com.google.android.gms.internal.ads.E80
    public final BinderC3948j90 zza() {
        return (BinderC3948j90) this.f24618g.zzb();
    }
}
