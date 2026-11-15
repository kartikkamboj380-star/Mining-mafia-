package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3318e80 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceExecutorServiceC1805Gx0 f27699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f27700b;

    public C3318e80(C2395Sh c2395Sh, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, List list) {
        this.f27699a = interfaceExecutorServiceC1805Gx0;
        this.f27700b = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f27699a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.d80
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new C3444f80(this.f27342a.f27700b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 48;
    }
}
