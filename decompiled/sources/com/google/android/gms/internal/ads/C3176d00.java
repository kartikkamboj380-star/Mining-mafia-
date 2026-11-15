package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3176d00 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27271c;

    private C3176d00(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f27269a = interfaceC4864qQ0;
        this.f27270b = interfaceC4864qQ1;
        this.f27271c = interfaceC4864qQ2;
    }

    public static C3176d00 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C3176d00(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3050c00 zzb() {
        return new C3050c00((C2436Tb0) this.f27269a.zzb(), (AQ) this.f27270b.zzb(), (QR) this.f27271c.zzb());
    }
}
