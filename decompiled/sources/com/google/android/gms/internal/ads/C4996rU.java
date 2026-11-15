package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4996rU implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32910b;

    private C4996rU(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f32909a = interfaceC4864qQ0;
        this.f32910b = interfaceC4864qQ1;
    }

    public static C4996rU a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4996rU(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4871qU(((C4049jy) this.f32909a).a(), (QR) this.f32910b.zzb());
    }
}
