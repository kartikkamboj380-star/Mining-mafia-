package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class FI implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18728a;

    private FI(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f18728a = interfaceC4864qQ0;
    }

    public static FI a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new FI(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new EI(((C5241tQ0) this.f18728a).zzb());
    }
}
