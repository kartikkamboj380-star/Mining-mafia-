package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3847iL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29330a;

    private C3847iL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f29330a = interfaceC4864qQ0;
    }

    public static C3847iL a(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3847iL(uk, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((IP) this.f29330a.zzb(), AbstractC2315Qt.f22479g);
    }
}
