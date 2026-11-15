package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3347eN implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27769b;

    private C3347eN(ZM zm, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f27768a = interfaceC4864qQ0;
        this.f27769b = interfaceC4864qQ1;
    }

    public static C3347eN b(ZM zm, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C3347eN(zm, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2365Rs zzb() {
        return new C2365Rs(((C4049jy) this.f27768a).a(), ((PF) this.f27769b).a().f35798g);
    }
}
