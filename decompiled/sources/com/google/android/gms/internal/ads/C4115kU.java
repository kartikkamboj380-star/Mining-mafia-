package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4115kU implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30808d;

    private C4115kU(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f30805a = interfaceC4864qQ0;
        this.f30806b = interfaceC4864qQ1;
        this.f30807c = interfaceC4864qQ2;
        this.f30808d = interfaceC4864qQ3;
    }

    public static C4115kU a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C4115kU(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3989jU((C3613gU) this.f30805a.zzb(), (QR) this.f30806b.zzb(), ((C4049jy) this.f30807c).a(), ((C3295dy) this.f30808d).zzb());
    }
}
