package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1833Hl0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19389e;

    private C1833Hl0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f19385a = interfaceC4864qQ0;
        this.f19386b = interfaceC4864qQ1;
        this.f19387c = interfaceC4864qQ2;
        this.f19388d = interfaceC4864qQ3;
        this.f19389e = interfaceC4864qQ4;
    }

    public static C1833Hl0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C1833Hl0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.f19385a.zzb();
        InterfaceC4024jl0 interfaceC4024jl0 = (InterfaceC4024jl0) this.f19386b.zzb();
        ExecutorService executorService = (ExecutorService) this.f19387c.zzb();
        InterfaceC3145cl0 interfaceC3145cl0 = (InterfaceC3145cl0) this.f19388d.zzb();
        C1571Ck0 c1571Ck0 = (C1571Ck0) this.f19389e.zzb();
        return new C2248Pl0(context, interfaceC4024jl0, executorService, interfaceC3145cl0, new Random(), c1571Ck0.m0().d0(), c1571Ck0.m0().f0(), c1571Ck0.m0().g0(), c1571Ck0.m0().e0(), c1571Ck0.k0(), c1571Ck0.h0() - 1);
    }
}
