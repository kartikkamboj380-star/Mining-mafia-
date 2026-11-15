package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4374mX0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3046bz[] f31531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6011zX0 f31532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3703hC f31533c;

    public C4374mX0(InterfaceC3046bz... interfaceC3046bzArr) {
        C6011zX0 c6011zX0 = new C6011zX0();
        C3703hC c3703hC = new C3703hC();
        InterfaceC3046bz[] interfaceC3046bzArr2 = {c6011zX0, c3703hC};
        this.f31531a = interfaceC3046bzArr2;
        System.arraycopy(interfaceC3046bzArr, 0, interfaceC3046bzArr2, 0, 0);
        this.f31532b = c6011zX0;
        this.f31533c = c3703hC;
    }

    public final InterfaceC3046bz[] a() {
        return this.f31531a;
    }

    public final C3122ca b(C3122ca c3122ca) {
        C3703hC c3703hC = this.f31533c;
        c3703hC.g(c3122ca.f27150a);
        c3703hC.h(c3122ca.f27151b);
        return c3122ca;
    }

    public final boolean c(boolean z9) {
        this.f31532b.m(z9);
        return z9;
    }

    public final long d(long j10) {
        C3703hC c3703hC = this.f31533c;
        return c3703hC.zzc() ? c3703hC.i(j10) : j10;
    }

    public final long e() {
        return this.f31532b.n();
    }
}
