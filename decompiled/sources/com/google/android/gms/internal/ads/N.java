package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class N implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f20985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3977jO f20986b;

    N(Executor executor, InterfaceC3977jO interfaceC3977jO) {
        this.f20985a = executor;
        this.f20986b = interfaceC3977jO;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20985a.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.O
    public final void zza() {
        this.f20986b.zza(this.f20985a);
    }
}
