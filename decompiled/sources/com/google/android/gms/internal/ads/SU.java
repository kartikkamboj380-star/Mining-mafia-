package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class SU implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23216c;

    private SU(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f23214a = interfaceC4864qQ0;
        this.f23215b = interfaceC4864qQ3;
        this.f23216c = interfaceC4864qQ4;
    }

    public static SU b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new SU(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RU zzb() {
        return new RU((ScheduledExecutorService) this.f23214a.zzb(), C3129cd0.b(), C3884id0.b(), ((C5124sV) this.f23215b).zzb(), C3606gQ0.b(this.f23216c));
    }
}
