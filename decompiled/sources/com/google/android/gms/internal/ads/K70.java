package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class K70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20107b;

    public K70(C5424ut c5424ut, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.f20106a = executor;
        this.f20107b = str;
    }

    final /* synthetic */ com.google.common.util.concurrent.p a(Throwable th) {
        return AbstractC5685wx0.a(new L70(this.f20107b));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        com.google.common.util.concurrent.p pVarA = AbstractC5685wx0.a(this.f20107b);
        J70 j70 = J70.f19765a;
        Executor executor = this.f20106a;
        return AbstractC5685wx0.h(AbstractC5685wx0.k(pVarA, j70, executor), Throwable.class, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.I70
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f19486a.a((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 41;
    }
}
