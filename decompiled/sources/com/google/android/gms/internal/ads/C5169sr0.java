package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5169sr0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33243b;

    private C5169sr0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f33242a = interfaceC4864qQ0;
        this.f33243b = interfaceC4864qQ1;
    }

    public static C5169sr0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5169sr0(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5043rr0((C4148kk0) this.f33242a.zzb(), (InterfaceC1781Gl0) this.f33243b.zzb());
    }
}
