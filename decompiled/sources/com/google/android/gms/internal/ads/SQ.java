package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class SQ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23202a;

    private SQ(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f23202a = interfaceC4864qQ0;
    }

    public static SQ a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new SQ(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((C3230dR) this.f23202a.zzb(), C3129cd0.b());
    }
}
