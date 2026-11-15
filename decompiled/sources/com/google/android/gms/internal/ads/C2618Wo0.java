package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2618Wo0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24873e;

    private C2618Wo0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f24869a = interfaceC4864qQ0;
        this.f24870b = interfaceC4864qQ1;
        this.f24871c = interfaceC4864qQ2;
        this.f24872d = interfaceC4864qQ3;
        this.f24873e = interfaceC4864qQ4;
    }

    public static C2618Wo0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C2618Wo0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2566Vo0((C1463Ai0) this.f24869a.zzb(), (InterfaceC1789Gp0) this.f24870b.zzb(), (InterfaceC1687Eq0) this.f24871c.zzb(), (C5043rr0) this.f24872d.zzb(), (ExecutorService) this.f24873e.zzb());
    }
}
