package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3474fN0 extends AbstractC3600gN0 {
    C3474fN0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final void a(Object obj, long j10, byte b10) {
        if (AbstractC3726hN0.f28955i) {
            AbstractC3726hN0.f(obj, j10, b10);
        } else {
            AbstractC3726hN0.g(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final boolean b(Object obj, long j10) {
        return AbstractC3726hN0.f28955i ? AbstractC3726hN0.D(obj, j10) : AbstractC3726hN0.E(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.hN0.F(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.hN0.G(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z9' boolean)' in method call: com.google.android.gms.internal.ads.hN0.F(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z9' boolean)' in method call: com.google.android.gms.internal.ads.hN0.G(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final void c(Object obj, long j10, boolean z9) {
        if (AbstractC3726hN0.f28955i) {
            AbstractC3726hN0.F(obj, j10, z9);
        } else {
            AbstractC3726hN0.G(obj, j10, z9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f28631a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final void e(Object obj, long j10, float f10) {
        this.f28631a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f28631a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final void g(Object obj, long j10, double d10) {
        this.f28631a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3600gN0
    public final byte h(long j10) {
        return Memory.peekByte(j10);
    }
}
