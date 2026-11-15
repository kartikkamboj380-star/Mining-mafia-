package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5451v50 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f33987a;

    public C5451v50(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f33987a = interfaceExecutorServiceC1805Gx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f33987a.e0(CallableC5325u50.f33734a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 20;
    }
}
