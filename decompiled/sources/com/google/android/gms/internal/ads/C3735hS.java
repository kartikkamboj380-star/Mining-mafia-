package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3735hS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28996a;

    private C3735hS(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f28996a = interfaceC4864qQ0;
    }

    public static C3735hS a(C3609gS c3609gS, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C3735hS(c3609gS, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setA = C3609gS.a((C4867qS) this.f28996a.zzb(), C3129cd0.b());
        AbstractC4738pQ0.b(setA);
        return setA;
    }
}
