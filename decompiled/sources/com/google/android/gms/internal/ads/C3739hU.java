package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3739hU implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29003a;

    private C3739hU(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f29003a = interfaceC4864qQ0;
    }

    public static C3739hU a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3739hU(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3613gU(((C4049jy) this.f29003a).a());
    }
}
