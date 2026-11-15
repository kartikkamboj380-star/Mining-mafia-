package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2691Xz implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25423a;

    private C2691Xz(C2223Oz c2223Oz, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f25423a = interfaceC4864qQ0;
    }

    public static C2691Xz b(C2223Oz c2223Oz, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2691Xz(c2223Oz, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2592Wb0 zzb() {
        C2592Wb0 c2592Wb0A = C2592Wb0.a(((C4049jy) this.f25423a).a());
        AbstractC4738pQ0.b(c2592Wb0A);
        return c2592Wb0A;
    }
}
