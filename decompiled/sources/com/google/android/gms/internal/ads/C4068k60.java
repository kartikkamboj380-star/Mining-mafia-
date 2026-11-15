package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4068k60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f30696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5496vS f30697b;

    C4068k60(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, C5496vS c5496vS) {
        this.f30696a = interfaceExecutorServiceC1805Gx0;
        this.f30697b = c5496vS;
    }

    final /* synthetic */ C4194l60 a() {
        return new C4194l60(this.f30697b.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f30696a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.j60
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f30316a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 62;
    }
}
