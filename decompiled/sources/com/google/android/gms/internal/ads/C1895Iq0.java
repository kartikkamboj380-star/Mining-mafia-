package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1895Iq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19679c;

    private C1895Iq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f19677a = interfaceC4864qQ0;
        this.f19678b = interfaceC4864qQ1;
        this.f19679c = interfaceC4864qQ2;
    }

    public static C1895Iq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C1895Iq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1843Hq0((C4148kk0) this.f19677a.zzb(), (C5043rr0) this.f19678b.zzb(), ((C1571Ck0) this.f19679c.zzb()).q0().e0());
    }
}
