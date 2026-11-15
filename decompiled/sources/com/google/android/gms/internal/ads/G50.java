package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class G50 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18913a;

    private G50(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f18913a = interfaceC4864qQ1;
    }

    public static G50 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new G50(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E50 zzb() {
        return new E50(C3129cd0.b(), ((PF) this.f18913a).a());
    }
}
