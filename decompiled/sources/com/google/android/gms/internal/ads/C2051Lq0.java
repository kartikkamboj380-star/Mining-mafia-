package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2051Lq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20677b;

    private C2051Lq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f20676a = interfaceC4864qQ0;
        this.f20677b = interfaceC4864qQ1;
    }

    public static C2051Lq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C2051Lq0(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1947Jq0((C3032br0) this.f20676a.zzb(), ((C5241tQ0) this.f20677b).zzb());
    }
}
