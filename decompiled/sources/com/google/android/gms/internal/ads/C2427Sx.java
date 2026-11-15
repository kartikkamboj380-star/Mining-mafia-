package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2427Sx implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23344b;

    private C2427Sx(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f23343a = interfaceC4864qQ0;
        this.f23344b = interfaceC4864qQ1;
    }

    public static C2427Sx a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C2427Sx(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2375Rx((C1908Ix) this.f23343a.zzb(), (QR) this.f23344b.zzb());
    }
}
