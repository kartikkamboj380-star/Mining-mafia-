package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2327Qz implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22676a;

    private C2327Qz(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f22676a = interfaceC4864qQ0;
    }

    public static C2327Qz a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2327Qz(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2240Ph0(((C4049jy) this.f22676a).a(), G4.t.w().a());
    }
}
