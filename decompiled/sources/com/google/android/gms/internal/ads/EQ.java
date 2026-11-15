package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class EQ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18478b;

    private EQ(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f18477a = interfaceC4864qQ0;
        this.f18478b = interfaceC4864qQ1;
    }

    public static EQ a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new EQ(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DQ(((C2691Xz) this.f18477a).zzb(), (AQ) this.f18478b.zzb());
    }
}
