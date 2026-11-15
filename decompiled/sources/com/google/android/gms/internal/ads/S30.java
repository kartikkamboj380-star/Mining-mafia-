package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class S30 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23109a;

    private S30(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f23109a = interfaceC4864qQ0;
    }

    public static S30 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new S30(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q30 zzb() {
        return new Q30(((C1546By) this.f23109a).a(), C3129cd0.b());
    }
}
