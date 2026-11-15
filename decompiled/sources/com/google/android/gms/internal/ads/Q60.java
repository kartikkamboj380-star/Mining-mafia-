package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class Q60 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22312b;

    private Q60(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f22311a = interfaceC4864qQ0;
        this.f22312b = interfaceC4864qQ2;
    }

    public static Q60 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new Q60(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O60 zzb() {
        return new O60((C2521Us) this.f22311a.zzb(), C3129cd0.b(), ((C4049jy) this.f22312b).a());
    }
}
