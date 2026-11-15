package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5628wV implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34588a;

    private C5628wV(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f34588a = interfaceC4864qQ0;
    }

    public static C5628wV b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5628wV(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5502vV zzb() {
        return new C5502vV(((C4049jy) this.f34588a).a());
    }
}
