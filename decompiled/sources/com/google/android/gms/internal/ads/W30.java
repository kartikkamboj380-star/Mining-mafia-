package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class W30 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24657a;

    private W30(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f24657a = interfaceC4864qQ1;
    }

    public static W30 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new W30(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U30 zzb() {
        return new U30(C3129cd0.b(), ((C4049jy) this.f24657a).a());
    }
}
