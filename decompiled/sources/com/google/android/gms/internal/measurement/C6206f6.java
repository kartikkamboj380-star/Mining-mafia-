package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6206f6 extends AbstractC6224h6 {
    C6206f6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6224h6
    public final void a(Object obj, long j10, byte b10) {
        if (AbstractC6233i6.f36717h) {
            AbstractC6233i6.d(obj, j10, b10);
        } else {
            AbstractC6233i6.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6224h6
    public final boolean b(Object obj, long j10) {
        return AbstractC6233i6.f36717h ? AbstractC6233i6.z(obj, j10) : AbstractC6233i6.A(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.i6.B(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.i6.C(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z9' boolean)' in method call: com.google.android.gms.internal.measurement.i6.B(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z9' boolean)' in method call: com.google.android.gms.internal.measurement.i6.C(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.AbstractC6224h6
    public final void c(Object obj, long j10, boolean z9) {
        if (AbstractC6233i6.f36717h) {
            AbstractC6233i6.B(obj, j10, z9);
        } else {
            AbstractC6233i6.C(obj, j10, z9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6224h6
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f36704a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6224h6
    public final void e(Object obj, long j10, float f10) {
        this.f36704a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6224h6
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f36704a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6224h6
    public final void g(Object obj, long j10, double d10) {
        this.f36704a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
