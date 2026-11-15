package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2275Pz implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22263a;

    private C2275Pz(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f22263a = interfaceC4864qQ0;
    }

    public static C2275Pz b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2275Pz(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2157Ns zzb() {
        return C2157Ns.a(((C4049jy) this.f22263a).a());
    }
}
