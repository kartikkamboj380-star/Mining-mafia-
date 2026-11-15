package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class VM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24246b;

    private VM(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f24245a = interfaceC4864qQ0;
        this.f24246b = interfaceC4864qQ1;
    }

    public static VM a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new VM(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new SM(((GD) this.f24245a).a(), ((C4225lM) this.f24246b).a());
    }
}
