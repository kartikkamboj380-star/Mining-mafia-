package com.google.android.gms.internal.ads;

import K4.C0794u;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3583gF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28607c;

    private C3583gF(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f28605a = interfaceC4864qQ0;
        this.f28606b = interfaceC4864qQ1;
        this.f28607c = interfaceC4864qQ2;
    }

    public static C3583gF a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C3583gF(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f28605a.zzb();
        final L4.a aVarA = ((C1546By) this.f28606b).a();
        final C6019zb0 c6019zb0A = ((PF) this.f28607c).a();
        return new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.fF
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                C3502fb0 c3502fb0 = (C3502fb0) obj;
                C0794u c0794u = new C0794u(context);
                c0794u.e(c3502fb0.f28363B);
                c0794u.f(c3502fb0.f28365C.toString());
                c0794u.d(aVarA.f3097a);
                c0794u.c(c6019zb0A.f35798g);
                return c0794u;
            }
        };
    }
}
