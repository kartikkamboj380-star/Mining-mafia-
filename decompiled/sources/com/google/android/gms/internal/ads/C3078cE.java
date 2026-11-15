package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3078cE implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27070a;

    private C3078cE(WD wd, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f27070a = interfaceC4864qQ0;
    }

    public static C3078cE a(WD wd, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3078cE(wd, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((C3581gE) this.f27070a.zzb(), AbstractC2315Qt.f22479g);
    }
}
