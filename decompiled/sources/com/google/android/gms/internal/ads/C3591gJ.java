package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3591gJ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3465fJ f28616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28617b;

    private C3591gJ(C3465fJ c3465fJ, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f28616a = c3465fJ;
        this.f28617b = interfaceC4864qQ0;
    }

    public static C3591gJ a(C3465fJ c3465fJ, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3591gJ(c3465fJ, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2957bG c2957bGP = this.f28616a.p(((C5241tQ0) this.f28617b).zzb());
        AbstractC4738pQ0.b(c2957bGP);
        return c2957bGP;
    }
}
