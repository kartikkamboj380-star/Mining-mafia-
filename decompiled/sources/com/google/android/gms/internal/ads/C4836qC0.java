package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4836qC0 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32601a;

    public C4836qC0(String str) {
        this.f32601a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f32601a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4836qC0) {
            return this.f32601a.equals(((C4836qC0) obj).f32601a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f32601a);
    }

    public final int hashCode() {
        return this.f32601a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f32601a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f32601a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f32601a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f32601a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f32601a).longValue();
        }
    }

    public final String toString() {
        return this.f32601a;
    }
}
