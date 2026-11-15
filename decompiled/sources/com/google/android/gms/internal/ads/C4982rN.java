package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4982rN implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32884a;

    private C4982rN(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f32884a = interfaceC4864qQ0;
    }

    public static C4982rN a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4982rN(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4857qN((QR) this.f32884a.zzb());
    }
}
