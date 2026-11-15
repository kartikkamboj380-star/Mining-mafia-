package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2635Wx implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24896b;

    private C2635Wx(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f24895a = interfaceC4864qQ0;
        this.f24896b = interfaceC4864qQ1;
    }

    public static C2635Wx a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C2635Wx(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2583Vx((C1908Ix) this.f24895a.zzb(), (ScheduledExecutorService) this.f24896b.zzb());
    }
}
