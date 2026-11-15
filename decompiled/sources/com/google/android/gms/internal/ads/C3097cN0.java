package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3097cN0 extends AbstractC2846aN0 {
    C3097cN0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* bridge */ /* synthetic */ void a(Object obj, int i10, long j10) {
        ((C2972bN0) obj).j(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* bridge */ /* synthetic */ void b(Object obj, int i10, int i11) {
        ((C2972bN0) obj).j((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* bridge */ /* synthetic */ void c(Object obj, int i10, long j10) {
        ((C2972bN0) obj).j((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* bridge */ /* synthetic */ void d(Object obj, int i10, AbstractC5231tL0 abstractC5231tL0) {
        ((C2972bN0) obj).j((i10 << 3) | 2, abstractC5231tL0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* bridge */ /* synthetic */ void e(Object obj, int i10, Object obj2) {
        ((C2972bN0) obj).j((i10 << 3) | 3, (C2972bN0) obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* synthetic */ Object f() {
        return C2972bN0.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* synthetic */ Object g(Object obj) {
        C2972bN0 c2972bN0 = (C2972bN0) obj;
        c2972bN0.d();
        return c2972bN0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* bridge */ /* synthetic */ Object h(Object obj) {
        UL0 ul0 = (UL0) obj;
        C2972bN0 c2972bN0 = ul0.zzt;
        if (c2972bN0 != C2972bN0.a()) {
            return c2972bN0;
        }
        C2972bN0 c2972bN0B = C2972bN0.b();
        ul0.zzt = c2972bN0B;
        return c2972bN0B;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final /* synthetic */ void i(Object obj, Object obj2) {
        ((UL0) obj).zzt = (C2972bN0) obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2846aN0
    final void j(Object obj) {
        ((UL0) obj).zzt.d();
    }
}
