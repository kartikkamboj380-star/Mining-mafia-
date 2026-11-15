package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5586wA implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34489a;

    private C5586wA(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f34489a = interfaceC4864qQ0;
    }

    public static C5586wA a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5586wA(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5460vA((BT) this.f34489a.zzb());
    }
}
