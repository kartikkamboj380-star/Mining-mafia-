package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3528fo0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28482d;

    private C3528fo0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f28479a = interfaceC4864qQ0;
        this.f28480b = interfaceC4864qQ1;
        this.f28481c = interfaceC4864qQ2;
        this.f28482d = interfaceC4864qQ3;
    }

    public static C3528fo0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C3528fo0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceC4864qQ0 interfaceC4864qQ0 = this.f28482d;
        InterfaceC4864qQ0 interfaceC4864qQ1 = this.f28481c;
        InterfaceC4864qQ0 interfaceC4864qQ2 = this.f28480b;
        InterfaceC2978bQ0 interfaceC2978bQ0B = C3606gQ0.b(this.f28479a);
        InterfaceC2978bQ0 interfaceC2978bQ0B2 = C3606gQ0.b(interfaceC4864qQ2);
        InterfaceC2978bQ0 interfaceC2978bQ0B3 = C3606gQ0.b(interfaceC4864qQ1);
        C1571Ck0 c1571Ck0 = (C1571Ck0) interfaceC4864qQ0.zzb();
        return new C3402eo0(interfaceC2978bQ0B, interfaceC2978bQ0B2, interfaceC2978bQ0B3, c1571Ck0.q0().d0(), c1571Ck0.q0().g0());
    }
}
