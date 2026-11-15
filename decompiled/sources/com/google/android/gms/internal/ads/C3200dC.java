package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3200dC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27369c;

    private C3200dC(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f27367a = interfaceC4864qQ0;
        this.f27368b = interfaceC4864qQ1;
        this.f27369c = interfaceC4864qQ2;
    }

    public static C3200dC b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C3200dC(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    public static DH c(ScheduledExecutorService scheduledExecutorService, Clock clock, QR qr) {
        return new DH(scheduledExecutorService, clock, qr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DH zzb() {
        return c((ScheduledExecutorService) this.f27367a.zzb(), (Clock) this.f27368b.zzb(), (QR) this.f27369c.zzb());
    }
}
