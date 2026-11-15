package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4603oM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3973jM f32038a;

    private C4603oM(C3973jM c3973jM) {
        this.f32038a = c3973jM;
    }

    public static C4603oM b(C3973jM c3973jM) {
        return new C4603oM(c3973jM);
    }

    public static C5616wP c(C3973jM c3973jM) {
        C5616wP c5616wPD = c3973jM.d();
        AbstractC4738pQ0.b(c5616wPD);
        return c5616wPD;
    }

    public final C5616wP a() {
        return c(this.f32038a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f32038a);
    }
}
