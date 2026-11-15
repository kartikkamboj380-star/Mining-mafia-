package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4442n40 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f31678a;

    C4442n40(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f31678a = interfaceExecutorServiceC1805Gx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f31678a.e0(new Callable(this) { // from class: com.google.android.gms.internal.ads.m40
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new C4568o40(G4.t.o().currentTimeMillis() - G4.t.l().r().zzi().b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 55;
    }
}
