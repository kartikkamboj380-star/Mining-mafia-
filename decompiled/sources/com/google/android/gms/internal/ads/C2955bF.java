package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2955bF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26772a;

    private C2955bF(ZE ze, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f26772a = interfaceC4864qQ0;
    }

    public static C2955bF a(ZE ze, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2955bF(ze, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((CE) this.f26772a.zzb(), AbstractC2315Qt.f22479g);
    }
}
