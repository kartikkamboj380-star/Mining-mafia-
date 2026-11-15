package p108k7;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45681a;

    public z(String str) {
        this.f45681a = str;
    }

    private BigDecimal a() {
        return B.b(this.f45681a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f45681a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f45681a.equals(((z) obj).f45681a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f45681a);
    }

    public int hashCode() {
        return this.f45681a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f45681a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f45681a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f45681a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f45681a;
    }
}
