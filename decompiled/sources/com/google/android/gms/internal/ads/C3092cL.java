package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3092cL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27098a;

    private C3092cL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f27098a = interfaceC4864qQ0;
    }

    public static C3092cL a(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3092cL(uk, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((NK) this.f27098a.zzb(), AbstractC2315Qt.f22478f);
    }
}
