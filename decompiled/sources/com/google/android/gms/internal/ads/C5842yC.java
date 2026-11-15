package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5842yC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4331mC f35296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35297b;

    private C5842yC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f35296a = c4331mC;
        this.f35297b = interfaceC4864qQ0;
    }

    public static C5842yC a(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5842yC(c4331mC, interfaceC4864qQ0);
    }

    public static C3593gK b(C4331mC c4331mC, C2951bD c2951bD) {
        return new C3593gK(c2951bD, AbstractC2315Qt.f22478f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return b(this.f35296a, (C2951bD) this.f35297b.zzb());
    }
}
