package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4237lS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31271a;

    private C4237lS(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f31271a = interfaceC4864qQ0;
    }

    public static C4237lS a(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4237lS(c3609gS, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setE = C3609gS.e((C4867qS) this.f31271a.zzb(), C3129cd0.b());
        AbstractC4738pQ0.b(setE);
        return setE;
    }
}
