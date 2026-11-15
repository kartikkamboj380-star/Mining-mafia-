package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4664oq0 implements InterfaceC1789Gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1891Io0 f32205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f32206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5043rr0 f32207c;

    C4664oq0(C1891Io0 c1891Io0, ExecutorService executorService, C5043rr0 c5043rr0) {
        this.f32205a = c1891Io0;
        this.f32206b = executorService;
        this.f32207c = c5043rr0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p a(final C2456Tl0 c2456Tl0, final byte[] bArr, final byte[] bArr2) {
        com.google.common.util.concurrent.p pVarD = AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.mq0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f31576a.f(c2456Tl0, bArr, bArr2);
                return null;
            }
        }, this.f32206b);
        this.f32207c.e(15321, pVarD);
        return pVarD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p b(final C2456Tl0 c2456Tl0, final byte[] bArr) {
        com.google.common.util.concurrent.p pVarD = AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.lq0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f31368a.e(c2456Tl0, bArr);
                return null;
            }
        }, this.f32206b);
        this.f32207c.e(15305, pVarD);
        return pVarD;
    }

    final /* synthetic */ C2456Tl0 c() {
        C2456Tl0 c2456Tl0C = this.f32205a.c(1);
        return c2456Tl0C == null ? C2456Tl0.i0() : c2456Tl0C;
    }

    final /* synthetic */ C4774pi0 d() {
        return this.f32205a.b(1);
    }

    final /* synthetic */ Void e(C2456Tl0 c2456Tl0, byte[] bArr) {
        this.f32205a.a(c2456Tl0, null, bArr);
        return null;
    }

    final /* synthetic */ Void f(C2456Tl0 c2456Tl0, byte[] bArr, byte[] bArr2) {
        this.f32205a.a(c2456Tl0, bArr, bArr2);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p zzb() {
        com.google.common.util.concurrent.p pVarD = AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.nq0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f31891a.c();
            }
        }, this.f32206b);
        this.f32207c.e(15302, pVarD);
        return pVarD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1789Gp0
    public final com.google.common.util.concurrent.p zze() {
        com.google.common.util.concurrent.p pVarD = AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.kq0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f30890a.d();
            }
        }, this.f32206b);
        this.f32207c.e(15314, pVarD);
        return pVarD;
    }
}
