package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5951z30 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f35627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f35628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1796Gt f35629c;

    public C5951z30(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, C6019zb0 c6019zb0, C1796Gt c1796Gt) {
        this.f35627a = interfaceExecutorServiceC1805Gx0;
        this.f35628b = c6019zb0;
        this.f35629c = c1796Gt;
    }

    final /* synthetic */ A30 a() {
        return new A30(this.f35628b.f35802k, this.f35629c.k());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f35627a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.x30
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f34725a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 9;
    }
}
