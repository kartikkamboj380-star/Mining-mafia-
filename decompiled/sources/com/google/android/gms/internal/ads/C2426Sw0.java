package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2426Sw0 extends AbstractRunnableC2530Uw0 {
    C2426Sw0(com.google.common.util.concurrent.p pVar, InterfaceC3294dx0 interfaceC3294dx0) {
        super(pVar, interfaceC3294dx0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2530Uw0
    final /* synthetic */ void C(Object obj) {
        u((com.google.common.util.concurrent.p) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2530Uw0
    final /* bridge */ /* synthetic */ Object D(Object obj, Object obj2) {
        InterfaceC3294dx0 interfaceC3294dx0 = (InterfaceC3294dx0) obj;
        com.google.common.util.concurrent.p pVarZza = interfaceC3294dx0.zza(obj2);
        AbstractC2418Ss0.l(pVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3294dx0);
        return pVarZza;
    }
}
