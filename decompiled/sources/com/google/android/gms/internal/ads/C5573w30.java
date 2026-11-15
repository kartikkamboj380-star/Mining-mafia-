package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5573w30 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34461a;

    private C5573w30(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f34461a = interfaceC4864qQ1;
    }

    public static C5573w30 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5573w30(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5321u30 zzb() {
        return new C5321u30(C3129cd0.b(), ((C4049jy) this.f34461a).a());
    }
}
