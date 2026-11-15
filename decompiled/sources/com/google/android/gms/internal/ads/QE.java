package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class QE implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22332a;

    private QE(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f22332a = interfaceC4864qQ0;
    }

    public static QE a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new QE(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return AbstractC1903Iu0.l(new C3593gK((C4964rE) this.f22332a.zzb(), C3129cd0.b()));
    }
}
