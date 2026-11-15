package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4579oA implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31973b;

    private C4579oA(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f31972a = interfaceC4864qQ0;
        this.f31973b = interfaceC4864qQ1;
    }

    public static C4579oA b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4579oA(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4453nA zzb() {
        return new C4453nA(((C4234lQ0) this.f31972a).zzb(), ((C4234lQ0) this.f31973b).zzb());
    }
}
