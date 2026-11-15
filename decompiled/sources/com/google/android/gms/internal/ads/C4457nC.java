package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4457nC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4331mC f31757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31758b;

    private C4457nC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f31757a = c4331mC;
        this.f31758b = interfaceC4864qQ0;
    }

    public static C4457nC a(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4457nC(c4331mC, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f31757a.e(((C5241tQ0) this.f31758b).zzb());
    }
}
