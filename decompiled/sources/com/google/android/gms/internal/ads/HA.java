package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class HA implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19230a;

    private HA(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f19230a = interfaceC4864qQ0;
    }

    public static HA a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new HA(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new GA(((C4049jy) this.f19230a).a());
    }
}
