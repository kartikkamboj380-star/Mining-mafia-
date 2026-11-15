package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class DV implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18178b;

    private DV(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f18177a = interfaceC4864qQ0;
        this.f18178b = interfaceC4864qQ2;
    }

    public static DV b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new DV(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CV zzb() {
        return new CV(((C4612oQ0) this.f18177a).c(), C3129cd0.b(), ((HH) this.f18178b).zzb());
    }
}
