package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1962Jy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20029b;

    private C1962Jy(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f20028a = interfaceC4864qQ0;
        this.f20029b = interfaceC4864qQ1;
    }

    public static C1962Jy b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C1962Jy(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC4539nr zzb() {
        Context contextA = ((C4049jy) this.f20028a).a();
        RunnableC4262le0 runnableC4262le0 = (RunnableC4262le0) this.f20029b.zzb();
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0B = C3129cd0.b();
        C2899ao c2899aoA = G4.t.v().a(contextA, L4.a.a(), runnableC4262le0);
        InterfaceC2511Un interfaceC2511Un = AbstractC2667Xn.f25386a;
        c2899aoA.a("google.afma.request.getAdDictionary", interfaceC2511Un, interfaceC2511Un);
        return new C4917qr(contextA, G4.t.v().a(contextA, L4.a.a(), runnableC4262le0).a("google.afma.sdkConstants.getSdkConstants", interfaceC2511Un, interfaceC2511Un), L4.a.a(), interfaceExecutorServiceC1805Gx0B);
    }
}
