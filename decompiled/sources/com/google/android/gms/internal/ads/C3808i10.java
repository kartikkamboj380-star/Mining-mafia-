package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3808i10 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29238d;

    private C3808i10(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f29235a = interfaceC4864qQ0;
        this.f29236b = interfaceC4864qQ1;
        this.f29237c = interfaceC4864qQ2;
        this.f29238d = interfaceC4864qQ3;
    }

    public static C3808i10 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C3808i10(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3682h10((C2128Nd0) this.f29235a.zzb(), (InterfaceExecutorServiceC1805Gx0) this.f29236b.zzb(), ((C4058k10) this.f29237c).a(), ((C5065s10) this.f29238d).zzb());
    }
}
