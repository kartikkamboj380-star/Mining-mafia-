package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3206dF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27391a;

    private C3206dF(ZE ze, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f27391a = interfaceC4864qQ0;
    }

    public static C3206dF a(ZE ze, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3206dF(ze, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((XE) this.f27391a.zzb(), AbstractC2315Qt.f22479g);
    }
}
