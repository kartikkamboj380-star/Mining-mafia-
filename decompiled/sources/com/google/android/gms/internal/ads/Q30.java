package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class Q30 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f22281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L4.a f22282b;

    Q30(L4.a aVar, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f22282b = aVar;
        this.f22281a = interfaceExecutorServiceC1805Gx0;
    }

    final /* synthetic */ R30 a() {
        return R30.a(this.f22282b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f22281a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.P30
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f22011a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 54;
    }
}
