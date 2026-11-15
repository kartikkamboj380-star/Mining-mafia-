package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class SW implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23220b;

    private SW(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f23219a = interfaceC4864qQ0;
        this.f23220b = interfaceC4864qQ1;
    }

    public static SW a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new SW(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new RW(((C3493fX) this.f23219a).zzb(), ((C3295dy) this.f23220b).zzb());
    }
}
