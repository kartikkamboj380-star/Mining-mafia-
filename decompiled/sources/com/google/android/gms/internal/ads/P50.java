package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class P50 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f22026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BT f22027b;

    P50(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, BT bt) {
        this.f22026a = interfaceExecutorServiceC1805Gx0;
        this.f22027b = bt;
    }

    final /* synthetic */ Q50 a() {
        BT bt = this.f22027b;
        return new Q50(bt.h(), bt.e(), G4.t.s().k(), bt.r(), bt.n());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f22026a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.O50
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f21464a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 23;
    }
}
