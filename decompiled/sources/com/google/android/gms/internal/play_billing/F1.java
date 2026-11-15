package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class F1 extends G1 {
    F1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f37082a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f37082a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void c(Object obj, long j10, boolean z9) {
        if (H1.f37090h) {
            H1.d(obj, j10, r5 ? (byte) 1 : (byte) 0);
        } else {
            H1.e(obj, j10, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void d(Object obj, long j10, byte b10) {
        if (H1.f37090h) {
            H1.d(obj, j10, b10);
        } else {
            H1.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void e(Object obj, long j10, double d10) {
        this.f37082a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final void f(Object obj, long j10, float f10) {
        this.f37082a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final boolean g(Object obj, long j10) {
        return H1.f37090h ? H1.y(obj, j10) : H1.z(obj, j10);
    }
}
