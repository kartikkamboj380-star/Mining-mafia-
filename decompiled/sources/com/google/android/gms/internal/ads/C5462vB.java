package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5462vB implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34009b;

    private C5462vB(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f34008a = interfaceC4864qQ0;
        this.f34009b = interfaceC4864qQ1;
    }

    public static C5462vB a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5462vB(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5336uB(((C4049jy) this.f34008a).a(), (C5142se) this.f34009b.zzb());
    }
}
