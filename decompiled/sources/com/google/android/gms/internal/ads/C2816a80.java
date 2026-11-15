package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2816a80 implements InterfaceC3191d70 {
    public C2816a80(C5046rt c5046rt, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        final com.google.common.util.concurrent.p pVarA = AbstractC5685wx0.a(null);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29636N6)).booleanValue()) {
            pVarA = AbstractC5685wx0.a(null);
        }
        final com.google.common.util.concurrent.p pVarA2 = AbstractC5685wx0.a(null);
        return AbstractC5685wx0.o(pVarA, pVarA2).a(new Callable() { // from class: com.google.android.gms.internal.ads.Z70
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new C2942b80((String) pVarA.get(), (String) pVarA2.get());
            }
        }, AbstractC2315Qt.f22473a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 47;
    }
}
