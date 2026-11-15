package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6061zw0 extends AbstractRunnableC1543Bw0 {
    C6061zw0(com.google.common.util.concurrent.p pVar, Class cls, InterfaceC3294dx0 interfaceC3294dx0) {
        super(pVar, cls, interfaceC3294dx0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1543Bw0
    final /* synthetic */ void C(Object obj) {
        u((com.google.common.util.concurrent.p) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1543Bw0
    final /* bridge */ /* synthetic */ Object D(Object obj, Throwable th) {
        InterfaceC3294dx0 interfaceC3294dx0 = (InterfaceC3294dx0) obj;
        com.google.common.util.concurrent.p pVarZza = interfaceC3294dx0.zza(th);
        AbstractC2418Ss0.l(pVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3294dx0);
        return pVarZza;
    }
}
