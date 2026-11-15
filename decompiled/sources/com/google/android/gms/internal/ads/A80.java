package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class A80 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f17256a;

    public A80(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f17256a = interfaceExecutorServiceC1805Gx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f17256a.e0(CallableC5961z80.f35660a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 51;
    }
}
