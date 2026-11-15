package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4461nE implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31762a;

    private C4461nE(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f31762a = interfaceC4864qQ0;
    }

    public static C4461nE a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4461nE(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((C4455nB) this.f31762a.zzb(), C3129cd0.b());
    }
}
