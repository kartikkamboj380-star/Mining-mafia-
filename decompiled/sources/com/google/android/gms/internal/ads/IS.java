package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class IS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19552b;

    private IS(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f19551a = interfaceC4864qQ0;
        this.f19552b = interfaceC4864qQ1;
    }

    public static IS a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new IS(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new HS((KS) this.f19551a.zzb(), ((GS) this.f19552b).zzb());
    }
}
