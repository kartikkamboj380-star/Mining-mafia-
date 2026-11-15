package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4709pC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4331mC f32334a;

    private C4709pC(C4331mC c4331mC) {
        this.f32334a = c4331mC;
    }

    public static C4709pC b(C4331mC c4331mC) {
        return new C4709pC(c4331mC);
    }

    public static C3628gb0 c(C4331mC c4331mC) {
        C3628gb0 c3628gb0D = c4331mC.d();
        AbstractC4738pQ0.b(c3628gb0D);
        return c3628gb0D;
    }

    public final C3628gb0 a() {
        return c(this.f32334a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f32334a);
    }
}
