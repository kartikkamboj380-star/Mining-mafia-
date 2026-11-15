package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4489nS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31812a;

    private C4489nS(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f31812a = interfaceC4864qQ0;
    }

    public static C4489nS a(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4489nS(c3609gS, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setG = C3609gS.g((C4867qS) this.f31812a.zzb(), C3129cd0.b());
        AbstractC4738pQ0.b(setG);
        return setG;
    }
}
