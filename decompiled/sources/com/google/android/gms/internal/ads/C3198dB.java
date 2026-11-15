package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3198dB implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27360b;

    private C3198dB(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f27359a = interfaceC4864qQ0;
        this.f27360b = interfaceC4864qQ1;
    }

    public static C3198dB a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C3198dB(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3072cB(((GD) this.f27359a).a(), ((C1702Ey) this.f27360b).zzb());
    }
}
