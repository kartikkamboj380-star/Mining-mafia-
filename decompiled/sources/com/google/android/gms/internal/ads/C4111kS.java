package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4111kS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3609gS f30794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30795b;

    private C4111kS(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f30794a = c3609gS;
        this.f30795b = interfaceC4864qQ0;
    }

    public static C4111kS a(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4111kS(c3609gS, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    public static Set b(C3609gS c3609gS, C4867qS c4867qS, Executor executor) {
        Set setD = C3609gS.d(c4867qS, executor);
        AbstractC4738pQ0.b(setD);
        return setD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return b(this.f30794a, (C4867qS) this.f30795b.zzb(), C3129cd0.b());
    }
}
