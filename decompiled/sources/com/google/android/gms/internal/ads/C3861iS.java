package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3861iS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29400a;

    private C3861iS(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f29400a = interfaceC4864qQ0;
    }

    public static C3861iS a(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C3861iS(c3609gS, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setB = C3609gS.b((C4867qS) this.f29400a.zzb(), C3129cd0.b());
        AbstractC4738pQ0.b(setB);
        return setB;
    }
}
