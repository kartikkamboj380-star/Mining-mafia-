package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2622Wq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24879d;

    private C2622Wq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f24876a = interfaceC4864qQ0;
        this.f24877b = interfaceC4864qQ1;
        this.f24878c = interfaceC4864qQ2;
        this.f24879d = interfaceC4864qQ3;
    }

    public static C2622Wq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C2622Wq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2570Vq0((Context) this.f24876a.zzb(), (C5043rr0) this.f24877b.zzb(), (InterfaceExecutorServiceC1805Gx0) this.f24878c.zzb(), (C1571Ck0) this.f24879d.zzb());
    }
}
