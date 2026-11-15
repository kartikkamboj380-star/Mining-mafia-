package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5848yF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35323e;

    private C5848yF(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f35319a = interfaceC4864qQ0;
        this.f35320b = interfaceC4864qQ1;
        this.f35321c = interfaceC4864qQ2;
        this.f35322d = interfaceC4864qQ3;
        this.f35323e = interfaceC4864qQ4;
    }

    public static C5848yF a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C5848yF(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5722xF(((JD) this.f35319a).a(), ((GD) this.f35320b).a(), (Clock) this.f35321c.zzb(), (QR) this.f35322d.zzb(), (ScheduledExecutorService) this.f35323e.zzb());
    }
}
