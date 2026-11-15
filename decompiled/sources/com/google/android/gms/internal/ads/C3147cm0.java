package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3147cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2978bQ0 f27194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2978bQ0 f27195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2978bQ0 f27196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f27197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5043rr0 f27198e;

    C3147cm0(InterfaceC2978bQ0 interfaceC2978bQ0, InterfaceC2978bQ0 interfaceC2978bQ1, InterfaceC2978bQ0 interfaceC2978bQ2, ExecutorService executorService, C5043rr0 c5043rr0) {
        this.f27194a = interfaceC2978bQ0;
        this.f27195b = interfaceC2978bQ1;
        this.f27196c = interfaceC2978bQ2;
        this.f27197d = executorService;
        this.f27198e = c5043rr0;
    }

    private final com.google.common.util.concurrent.p e(final int i10) {
        return (AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.Xl0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f25381a.c(i10);
            }
        }, this.f27197d)), C2716Yl0.f25699a, AbstractC2272Px0.a());
    }

    final /* synthetic */ C5043rr0 a() {
        return this.f27198e;
    }

    final com.google.common.util.concurrent.p b(int i10, boolean z9) {
        com.google.common.util.concurrent.p pVarE = e(i10);
        return (!z9 || i10 == 2) ? pVarE : (AbstractC4678ox0) AbstractC5685wx0.j((AbstractC4678ox0) AbstractC5685wx0.g(AbstractC4678ox0.B(pVarE), Throwable.class, C3022bm0.f26917a, AbstractC2272Px0.a()), new C2612Wl0(this), AbstractC2272Px0.a());
    }

    final /* synthetic */ InterfaceC2508Ul0 c(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return (InterfaceC2508Ul0) this.f27194a.zzb();
        }
        if (i11 == 2) {
            return (InterfaceC2508Ul0) this.f27195b.zzb();
        }
        if (i11 == 3) {
            return (InterfaceC2508Ul0) this.f27196c.zzb();
        }
        throw new IllegalArgumentException();
    }

    final /* synthetic */ com.google.common.util.concurrent.p d(int i10) {
        return e(2);
    }
}
