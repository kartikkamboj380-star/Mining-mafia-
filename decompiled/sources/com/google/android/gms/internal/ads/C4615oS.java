package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4615oS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32072a;

    private C4615oS(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f32072a = interfaceC4864qQ0;
    }

    public static C4615oS a(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4615oS(c3609gS, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setH = C3609gS.h((C4867qS) this.f32072a.zzb(), C3129cd0.b());
        AbstractC4738pQ0.b(setH);
        return setH;
    }
}
