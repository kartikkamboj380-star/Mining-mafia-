package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4467nH implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31765a;

    private C4467nH(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f31765a = interfaceC4864qQ0;
    }

    public static C4467nH a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4467nH(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4341mH(((C5241tQ0) this.f31765a).zzb());
    }
}
