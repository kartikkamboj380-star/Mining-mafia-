package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2947bB implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26752f;

    private C2947bB(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        this.f26747a = interfaceC4864qQ0;
        this.f26748b = interfaceC4864qQ1;
        this.f26749c = interfaceC4864qQ2;
        this.f26750d = interfaceC4864qQ3;
        this.f26751e = interfaceC4864qQ5;
        this.f26752f = interfaceC4864qQ6;
    }

    public static C2947bB a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4, InterfaceC4864qQ0 interfaceC4864qQ5, InterfaceC4864qQ0 interfaceC4864qQ6) {
        return new C2947bB(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4, interfaceC4864qQ5, interfaceC4864qQ6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2821aB(((C4049jy) this.f26747a).a(), ((C3295dy) this.f26748b).zzb(), (C3873iY) this.f26749c.zzb(), (C4611oQ) this.f26750d.zzb(), C3129cd0.b(), (InterfaceExecutorServiceC1805Gx0) this.f26751e.zzb(), (ScheduledExecutorService) this.f26752f.zzb());
    }
}
