package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class AK0 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17289a;

    public AK0(String str) {
        this.f17289a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f17289a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AK0) {
            return this.f17289a.equals(((AK0) obj).f17289a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f17289a);
    }

    public final int hashCode() {
        return this.f17289a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f17289a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f17289a);
            }
        } catch (NumberFormatException unused2) {
            return KK0.a(this.f17289a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f17289a);
        } catch (NumberFormatException unused) {
            return KK0.a(this.f17289a).longValue();
        }
    }

    public final String toString() {
        return this.f17289a;
    }
}
