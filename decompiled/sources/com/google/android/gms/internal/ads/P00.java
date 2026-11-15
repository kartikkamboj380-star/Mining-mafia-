package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class P00 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21997b;

    private P00(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f21996a = interfaceC4864qQ0;
        this.f21997b = interfaceC4864qQ1;
    }

    public static P00 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new P00(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O00 zzb() {
        return new O00((C5191t10) this.f21996a.zzb(), (DQ) this.f21997b.zzb());
    }
}
