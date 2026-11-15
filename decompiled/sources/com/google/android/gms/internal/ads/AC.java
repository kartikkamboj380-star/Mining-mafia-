package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class AC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17269b;

    private AC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f17268a = interfaceC4864qQ0;
        this.f17269b = interfaceC4864qQ1;
    }

    public static AC b(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new AC(c4331mC, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2365Rs zzb() {
        return new C2365Rs(((C4049jy) this.f17268a).a(), ((PF) this.f17269b).a().f35798g);
    }
}
