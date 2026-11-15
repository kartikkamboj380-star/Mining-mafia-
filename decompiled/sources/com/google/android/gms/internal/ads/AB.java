package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class AB implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17267b;

    private AB(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f17266a = interfaceC4864qQ0;
        this.f17267b = interfaceC4864qQ1;
    }

    public static AB a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new AB(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C5142se c5142se = (C5142se) this.f17266a.zzb();
        return new C5210tB(c5142se.d(), (C4281lo) this.f17267b.zzb(), C2878ad0.b());
    }
}
