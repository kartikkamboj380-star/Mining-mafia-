package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Aw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1491Aw0 extends AbstractRunnableC1543Bw0 {
    C1491Aw0(com.google.common.util.concurrent.p pVar, Class cls, InterfaceC1899Is0 interfaceC1899Is0) {
        super(pVar, cls, interfaceC1899Is0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1543Bw0
    final void C(Object obj) {
        k(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1543Bw0
    final /* synthetic */ Object D(Object obj, Throwable th) {
        return ((InterfaceC1899Is0) obj).apply(th);
    }
}
