package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2953bE implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26764a;

    private C2953bE(WD wd, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f26764a = interfaceC4864qQ0;
    }

    public static C2953bE a(WD wd, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2953bE(wd, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((C3581gE) this.f26764a.zzb(), AbstractC2315Qt.f22479g);
    }
}
