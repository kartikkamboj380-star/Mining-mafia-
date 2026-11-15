package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3080cF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27075a;

    private C3080cF(ZE ze, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f27075a = interfaceC4864qQ0;
    }

    public static C3080cF a(ZE ze, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3080cF(ze, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((XE) this.f27075a.zzb(), AbstractC2315Qt.f22479g);
    }
}
