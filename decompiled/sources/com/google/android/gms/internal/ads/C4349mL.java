package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4349mL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31495b;

    private C4349mL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f31494a = interfaceC4864qQ0;
        this.f31495b = interfaceC4864qQ1;
    }

    public static C4349mL b(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4349mL(uk, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2365Rs zzb() {
        return new C2365Rs(((C4049jy) this.f31494a).a(), ((PF) this.f31495b).a().f35798g);
    }
}
