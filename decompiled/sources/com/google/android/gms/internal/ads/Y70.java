package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class Y70 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25542a;

    private Y70(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f25542a = interfaceC4864qQ0;
    }

    public static Y70 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new Y70(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new X70(((C4049jy) this.f25542a).a());
    }
}
