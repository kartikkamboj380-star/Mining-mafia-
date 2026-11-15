package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class Y20 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25459b;

    private Y20(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f25458a = interfaceC4864qQ0;
        this.f25459b = interfaceC4864qQ2;
    }

    public static Y20 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new Y20(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new W20((com.google.common.util.concurrent.p) this.f25458a.zzb(), C3129cd0.b(), (ScheduledExecutorService) this.f25459b.zzb());
    }
}
