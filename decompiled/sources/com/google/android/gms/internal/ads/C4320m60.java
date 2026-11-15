package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4320m60 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31444a;

    private C4320m60(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f31444a = interfaceC4864qQ1;
    }

    public static C4320m60 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4320m60(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4068k60 zzb() {
        return new C4068k60(C3129cd0.b(), (C5496vS) this.f31444a.zzb());
    }
}
