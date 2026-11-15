package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class E1 extends G1 {
    E1(Unsafe unsafe) {
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

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.internal.play_billing.H1.n(java.lang.Object, long, boolean):void
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:80)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
        Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 31
        	at java.base/java.util.ArrayList.add(ArrayList.java:484)
        	at java.base/java.util.ArrayList.add(ArrayList.java:496)
        	at jadx.core.utils.ListUtils.safeReplace(ListUtils.java:150)
        	at jadx.core.dex.visitors.InlineMethods.replaceClsUsage(InlineMethods.java:193)
        	at jadx.core.dex.visitors.InlineMethods.lambda$updateUsageInfo$0(InlineMethods.java:173)
        	at jadx.core.dex.nodes.InsnNode.visitInsns(InsnNode.java:301)
        	at jadx.core.dex.visitors.InlineMethods.updateUsageInfo(InlineMethods.java:164)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:93)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
        	... 1 more
        */
    @Override // com.google.android.gms.internal.play_billing.G1
    public final void c(java.lang.Object r2, long r3, boolean r5) {
        /*
            r1 = this;
            boolean r0 = com.google.android.gms.internal.play_billing.H1.f37090h
            if (r0 == 0) goto L8
            com.google.android.gms.internal.play_billing.H1.n(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.play_billing.H1.o(r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.E1.c(java.lang.Object, long, boolean):void");
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
