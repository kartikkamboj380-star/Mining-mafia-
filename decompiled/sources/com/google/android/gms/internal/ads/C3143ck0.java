package com.google.android.gms.internal.ads;

import W.InterfaceC0984i;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ck0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3143ck0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27192b;

    private C3143ck0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f27191a = interfaceC4864qQ0;
        this.f27192b = interfaceC4864qQ2;
    }

    public static C3143ck0 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C3143ck0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3018bk0 zzb() {
        return new C3018bk0((InterfaceC0984i) this.f27191a.zzb(), C4301ly.b(), (C5744xQ) this.f27192b.zzb(), new C5909yj0());
    }
}
