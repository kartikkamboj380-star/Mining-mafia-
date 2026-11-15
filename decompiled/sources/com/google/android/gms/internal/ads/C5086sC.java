package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5086sC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4331mC f33117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33118b;

    private C5086sC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33117a = c4331mC;
        this.f33118b = interfaceC4864qQ0;
    }

    public static C5086sC b(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5086sC(c4331mC, interfaceC4864qQ0);
    }

    public static AbstractC3325eC c(C4331mC c4331mC, Object obj) {
        return (C3829iC) obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC3325eC zzb() {
        return ((C3953jC) this.f33118b).zzb();
    }
}
