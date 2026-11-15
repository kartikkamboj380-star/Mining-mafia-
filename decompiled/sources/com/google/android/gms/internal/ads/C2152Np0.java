package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Np0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2152Np0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21353i;

    private C2152Np0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6, InterfaceC4864qQ0 interfaceC4864qQ7, InterfaceC4864qQ0 interfaceC4864qQ8) {
        this.f21345a = interfaceC4864qQ0;
        this.f21346b = interfaceC4864qQ1;
        this.f21347c = interfaceC4864qQ2;
        this.f21348d = interfaceC4864qQ3;
        this.f21349e = interfaceC4864qQ4;
        this.f21350f = interfaceC4864qQ5;
        this.f21351g = interfaceC4864qQ6;
        this.f21352h = interfaceC4864qQ7;
        this.f21353i = interfaceC4864qQ8;
    }

    public static C2152Np0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6, InterfaceC4864qQ0 interfaceC4864qQ7, InterfaceC4864qQ0 interfaceC4864qQ8) {
        return new C2152Np0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4, interfaceC4864qQ5, interfaceC4864qQ6, interfaceC4864qQ7, interfaceC4864qQ8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2100Mp0((AbstractC5031rl0) this.f21345a.zzb(), (AbstractC5031rl0) this.f21346b.zzb(), C3606gQ0.b(this.f21347c), (AbstractC5031rl0) this.f21348d.zzb(), (AbstractC5031rl0) this.f21349e.zzb(), C3606gQ0.b(this.f21350f), (File) this.f21351g.zzb(), (ExecutorService) this.f21352h.zzb(), (C5043rr0) this.f21353i.zzb());
    }
}
