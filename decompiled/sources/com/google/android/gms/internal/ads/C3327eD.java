package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3327eD implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27719d;

    private C3327eD(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f27716a = interfaceC4864qQ0;
        this.f27717b = interfaceC4864qQ1;
        this.f27718c = interfaceC4864qQ2;
        this.f27719d = interfaceC4864qQ3;
    }

    public static C3327eD a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C3327eD(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3202dD(((GD) this.f27716a).a(), (C4968rG) this.f27717b.zzb(), (YG) this.f27718c.zzb(), (C5348uH) this.f27719d.zzb());
    }
}
