package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4465nG implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31764a;

    private C4465nG(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f31764a = interfaceC4864qQ0;
    }

    public static C4465nG b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4465nG(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3837iG zzb() {
        return new C3837iG(((C5241tQ0) this.f31764a).zzb());
    }
}
