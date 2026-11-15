package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class F30 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18630a;

    private F30(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f18630a = interfaceC4864qQ1;
    }

    public static F30 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new F30(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D30 zzb() {
        return new D30(C3129cd0.b(), (C1588Ct) this.f18630a.zzb());
    }
}
