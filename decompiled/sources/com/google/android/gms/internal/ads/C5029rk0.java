package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5029rk0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33006a;

    private C5029rk0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33006a = interfaceC4864qQ0;
    }

    public static C5029rk0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5029rk0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0B = AbstractC2272Px0.b((ExecutorService) this.f33006a.zzb());
        AbstractC4738pQ0.b(interfaceExecutorServiceC1805Gx0B);
        return interfaceExecutorServiceC1805Gx0B;
    }
}
