package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3871iX implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29431b;

    private C3871iX(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f29430a = interfaceC4864qQ0;
        this.f29431b = interfaceC4864qQ1;
    }

    public static C3871iX b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C3871iX(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3745hX zzb() {
        return new C3745hX((TW) this.f29430a.zzb(), ((YW) this.f29431b).zzb());
    }
}
