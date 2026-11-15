package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5880yV implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35360b;

    private C5880yV(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f35359a = interfaceC4864qQ0;
        this.f35360b = interfaceC4864qQ1;
    }

    public static C5880yV b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5880yV(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5754xV zzb() {
        return new C5754xV(((C4049jy) this.f35359a).a(), (C2521Us) this.f35360b.zzb());
    }
}
