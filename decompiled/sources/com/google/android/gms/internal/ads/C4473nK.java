package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4473nK implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31776a;

    private C4473nK(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f31776a = interfaceC4864qQ0;
    }

    public static C4473nK a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4473nK(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4347mK(((C5241tQ0) this.f31776a).zzb());
    }
}
