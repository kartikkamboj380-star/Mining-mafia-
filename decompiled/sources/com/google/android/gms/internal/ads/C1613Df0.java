package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Df0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1613Df0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18268b;

    private C1613Df0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f18267a = interfaceC4864qQ0;
        this.f18268b = interfaceC4864qQ1;
    }

    public static C1613Df0 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C1613Df0(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1561Cf0 zzb() {
        return new C1561Cf0((QR) this.f18267a.zzb(), ((C4049jy) this.f18268b).a());
    }
}
