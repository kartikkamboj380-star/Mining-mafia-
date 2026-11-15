package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class D30 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f18064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1588Ct f18065b;

    D30(Executor executor, C1588Ct c1588Ct) {
        this.f18064a = executor;
        this.f18065b = c1588Ct;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29593J3)).booleanValue()) {
            return AbstractC5685wx0.a(new E30(null));
        }
        C1588Ct c1588Ct = this.f18065b;
        return AbstractC5685wx0.k(c1588Ct.t(), C30.f17778a, this.f18064a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 10;
    }
}
