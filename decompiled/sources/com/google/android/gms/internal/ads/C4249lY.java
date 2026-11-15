package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4249lY implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31289a;

    private C4249lY(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f31289a = interfaceC4864qQ0;
    }

    public static C4249lY b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4249lY(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4123kY zzb() {
        return new C4123kY(((C4049jy) this.f31289a).a());
    }
}
