package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class UM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23982a;

    private UM(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f23982a = interfaceC4864qQ0;
    }

    public static UM a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new UM(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new TM(((GD) this.f23982a).a());
    }
}
