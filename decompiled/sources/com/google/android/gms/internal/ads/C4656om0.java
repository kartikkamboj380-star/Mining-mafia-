package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.om0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4656om0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32198g;

    private C4656om0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        this.f32192a = interfaceC4864qQ0;
        this.f32193b = interfaceC4864qQ1;
        this.f32194c = interfaceC4864qQ2;
        this.f32195d = interfaceC4864qQ3;
        this.f32196e = interfaceC4864qQ4;
        this.f32197f = interfaceC4864qQ5;
        this.f32198g = interfaceC4864qQ6;
    }

    public static C4656om0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        return new C4656om0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4, interfaceC4864qQ5, interfaceC4864qQ6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4278lm0((ExecutorService) this.f32192a.zzb(), C3606gQ0.b(this.f32193b), C3606gQ0.b(this.f32194c), (C1947Jq0) this.f32195d.zzb(), C3606gQ0.b(this.f32196e), this.f32197f, (C1571Ck0) this.f32198g.zzb());
    }
}
