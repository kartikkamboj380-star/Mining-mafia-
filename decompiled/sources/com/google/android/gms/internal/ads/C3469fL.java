package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3469fL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28261a;

    private C3469fL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f28261a = interfaceC4864qQ0;
    }

    public static C3469fL a(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3469fL(uk, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((IL) this.f28261a.zzb(), AbstractC2315Qt.f22478f);
    }
}
