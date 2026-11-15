package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class B50 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17481a;

    private B50(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f17481a = interfaceC4864qQ1;
    }

    public static B50 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new B50(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5955z50 zzb() {
        return new C5955z50(C3129cd0.b(), ((C4049jy) this.f17481a).a());
    }
}
